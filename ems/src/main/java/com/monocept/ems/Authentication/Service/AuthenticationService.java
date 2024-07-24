package com.monocept.ems.authentication.Service;
// package com.monocept.ems.Authentication.Service;

// import java.util.Arrays;

// import org.hibernate.validator.internal.util.stereotypes.Lazy;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.BadCredentialsException;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import com.monocept.ems.Authentication.DTO.LoginRequestDTO;
// import com.monocept.ems.Authentication.DTO.LoginResponseDTO;
// import com.monocept.ems.Authentication.Jwt.JwtUtil;
// import com.monocept.ems.Authentication.Model.EmployeeDetails;
// import com.monocept.ems.Employee.Service.EmployeeService;

// @Service
// public class AuthenticationService implements UserDetailsService {

// 	private static final Logger logger = LoggerFactory.getLogger(AuthenticationService.class);

// //	@Autowired
// //	private AuthenticationManager authenticationManager;

// 	@Autowired
// 	private EmployeeService employeeService;

// 	@Autowired
// 	private JwtUtil jwtUtil;

// 	@Autowired
// 	private JwtTokenService jwtTokenService;

// 	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
// 		logger.info("AuthenticationService : loadUserByUsername : username : {}", userId);
// 		EmployeeDetails employeeDetails = null;
// 		if (userId != null && !userId.trim().isEmpty()) {
// 			employeeDetails = employeeService.getEmployeeDetails(userId);
// 			if (employeeDetails == null) {
// 				logger.info("AuthenticationService : loadUserByUsername : user details not found ");
// 				throw new UsernameNotFoundException("User Details Not Found");
// 			}
// 		}
// 		return new User(employeeDetails.getEmployeeId(), employeeDetails.getPassword(),
// 				Arrays.asList(new SimpleGrantedAuthority("ROLE_" + employeeDetails.getRole())));

// 	}

// 	public ResponseEntity<?> login(LoginRequestDTO loginRequestDTO) {
// 		logger.info("Inside AuthenticationService ::: Inside Login :Employee id {}", loginRequestDTO.getEmployeeId());
// 		try {
// 	//			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequestDTO.getEmployeeId(),
// 	//					loginRequestDTO.getPassword()));
// 			UserDetails userDetails = loadUserByUsername(loginRequestDTO.getEmployeeId());
// 			logger.info("AuthenticationService : authenticateCredentials : credentials authenticated");
// 			EmployeeDetails employeeDetails = employeeService.getEmployeeDetails(loginRequestDTO.getEmployeeId());
// 			if (employeeDetails != null) {
// 				if (employeeDetails.getStatus() != null && !employeeDetails.getStatus().equalsIgnoreCase("ACTIVE"))
// 					return new ResponseEntity<>("User Status Deactive", HttpStatus.UNAUTHORIZED);
// 			}
// 			String jwtToken = jwtUtil.generateToken(userDetails);
// 			if (jwtToken != null && !jwtToken.trim().isEmpty()) {

// 				if (jwtTokenService.createTokenEntry(employeeDetails.getEmployeeId(), employeeDetails.getEmail(),
// 						jwtToken))
// 					return new ResponseEntity<>(
// 							new LoginResponseDTO(employeeDetails.getEmail(), employeeDetails.getFirstName(),
// 									employeeDetails.getLastName(), employeeDetails.getRole(), jwtToken),
// 							HttpStatus.OK);

// 			}
// 			return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
// 		} catch (BadCredentialsException ex) {
// 			logger.info("AuthenticationServiceImpl : authenticateCredentials : BadCredentialsException : {}",
// 					loginRequestDTO.getEmployeeId());
// 			logger.info(ex.getMessage(), ex);
// 			return new ResponseEntity<>("Invalid Credentials", HttpStatus.UNAUTHORIZED);
// 		} catch (Exception ex) {
// 			logger.info("AuthenticationServiceImpl : authenticateCredentials : Exception : {}",
// 					loginRequestDTO.getEmployeeId());
// 			logger.info(ex.getMessage(), ex);
// 			return new ResponseEntity<>("Error", HttpStatus.OK);
// 		}
// 	}

// }
