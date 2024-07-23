package com.monocept.ems.Authentication.Jwt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.monocept.ems.Authentication.Model.EmployeeDetails;
import com.monocept.ems.Authentication.Service.AuthenticationService;
import com.monocept.ems.Authentication.Service.JwtTokenService;
import com.monocept.ems.Employee.Service.EmployeeService;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

	private String tokenHeader = "X-Auth-TOKEN";

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private AuthenticationService authenticationService;

	@Autowired
	private JwtTokenService jwtTokenService;

	@Autowired
	private EmployeeService employeeService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		logger.info("Inside JwtRequestFilter ::: Inside doFilterInternal");
		try {

			final String authorizationHeader = request.getHeader(this.tokenHeader);
			logger.info("JwtRequestFilter : doFilterInternal : authorizationHeader : " + authorizationHeader);
			for (Enumeration<?> e = request.getHeaderNames(); e.hasMoreElements();) {
				String nextHeaderName = (String) e.nextElement();
				logger.info("JwtRequestFilter : doFilterInternal : nextHeaderName : " + nextHeaderName);
				String headerValue = request.getHeader(nextHeaderName);
				logger.info("JwtRequestFilter : doFilterInternal : headerValue : " + headerValue);
			}
			String username = null;
			String jwt = null;
			if (authorizationHeader != null && !authorizationHeader.isEmpty()) {
				jwt = authorizationHeader;
				logger.info("JwtRequestFilter : doFilterInternal : jwt DECRYPTED: " + jwt);
				if (jwt != null && !jwt.isEmpty()) {
					username = jwtUtil.extractUsername(jwt);
					logger.info("JwtRequestFilter : doFilterInternal : username : " + username);
				}
			}
			logger.info("JwtRequestFilter : doFilterInternal : jwt : " + jwt);
			if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
				UserDetails userDetails = null;
				userDetails = this.authenticationService.loadUserByUsername(username);
				boolean isTokenActive = jwtTokenService.isTokenActive(username, jwt);
				if (isTokenActive) {
					if (jwtUtil.validateToken(jwt, userDetails)) {
						logger.info("Token validated");
						UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
								userDetails, null, userDetails.getAuthorities());
						usernamePasswordAuthenticationToken
								.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
						SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
						EmployeeDetails employeeDetails = employeeService.getEmployeeDetails(username);
						logger.info("Token validated 1");
						if (employeeDetails == null) {
							logger.info("user status is inactive");
							response.sendError(403, "UnAuthorized Access.");
							return;
						}
						if (employeeDetails.getStatus() != null
								&& !employeeDetails.getStatus().equalsIgnoreCase("ACTIVE")) {
							logger.info("user status is inactive");
							response.sendError(403, "UnAuthorized Access.");
							return;
						}
						request.setAttribute("employeeId", username);
						request.setAttribute("emailId", employeeDetails.getEmail());
					} else {
						response.sendError(403, "UnAuthorized Access.");
						return;
					}
				} else {
					logger.info("Token expired");
					response.setStatus(HttpServletResponse.SC_FORBIDDEN);
					response.getWriter().write(new JSONObject().put("status", HttpServletResponse.SC_FORBIDDEN)
							.putOpt("data", new ArrayList<>()).put("message", "Access token is Exipred.").toString());
					return;
				}
			}
		} catch (Exception ex) {
			logger.info("JwtRequestFilter : doFilterInternal : Exception");
			logger.info(ex.getMessage(), ex);
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "UnAuthorized Access.");
			return;
		}

		filterChain.doFilter(request, response);

	}

}
