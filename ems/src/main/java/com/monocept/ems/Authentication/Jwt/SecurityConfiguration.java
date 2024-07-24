// package com.monocept.ems.Authentication.Jwt;

// import java.util.List;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationProvider;
// import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
// import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.CorsConfigurationSource;
// import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

// import com.monocept.ems.Authentication.Service.AuthenticationService;

// @Configuration
// @EnableWebSecurity
// @EnableMethodSecurity(prePostEnabled = true)
// public class SecurityConfiguration {

// 	private static final String[] WHITE_LIST_URL = { "/auth/v1/login","/auth/v1/login1", "/v2/api-docs", "/v3/api-docs",
// 			"/v3/api-docs/**", "/swagger-resources", "/swagger-resources/**", "/configuration/ui",
// 			"/configuration/security", "/swagger-ui/**", "/webjars/**", "/swagger-ui.html" };

// 	private static final Logger logger = LoggerFactory.getLogger(SecurityConfiguration.class);

// 	@Autowired
// 	private JwtRequestFilter jwtRequestFilter;

// 	@Autowired
// 	private AuthenticationService authenticationService;

// 	@Bean
// 	AuthenticationProvider authenticationProvider() {
// 		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
// 		provider.setUserDetailsService(authenticationService);
// 		provider.setPasswordEncoder(new BCryptPasswordEncoder());
// 		return provider;
// 	}

// 	@Bean
// 	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
// 		http.csrf(csrf -> csrf.disable())
// 				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
// 				.authorizeHttpRequests(auth -> auth.antMatchers().permitAll().antMatchers(WHITE_LIST_URL).permitAll()
// 						.antMatchers("/auth/v1/login1").permitAll().antMatchers().permitAll().anyRequest()
// 						.authenticated());
// 		logger.info("ByPass");
// 		http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);

// 		return http.build();
// 	}

// 	@Bean
// 	CorsConfigurationSource corsConfigurationSource() {
// 		CorsConfiguration configuration = new CorsConfiguration();

// 		configuration.setAllowedOrigins(List.of("http://localhost:8080"));
// 		configuration.setAllowedMethods(List.of("GET", "POST"));
// 		configuration.setAllowedHeaders(List.of("Authorization", "Content-Type"));

// 		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

// 		source.registerCorsConfiguration("/**", configuration);

// 		return source;
// 	}

// }
