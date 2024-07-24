package com.monocept.ems.authentication.Jwt;
// package com.monocept.ems.Authentication.Jwt;

// import java.util.Date;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.function.Function;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.stereotype.Component;

// import io.jsonwebtoken.Claims;
// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.SignatureAlgorithm;

// @Component
// public class JwtUtil {

// 	private String SECRET_KEY = "Secret_Key";
// //
// //	@Value("${JwtTokenValidityInMin}")
// //	private String jwtTokenValidityInMin;
// //
// //	@Autowired
// //	EnterpriseDetailsService enterpriseDetailsService;
// //
// //	@Autowired
// //	JwtTokenService jwtTokenService;
// //
// //	@Value("${enterprise.demo.email}")
// //	private String enterpriseDemoEmail;
// //
// //	@Autowired
// //	Utility utility;

// 	private static final Logger logger = LoggerFactory.getLogger(JwtUtil.class);

// 	public String extractUsername(String token) {
// 		return extractClaim(token, Claims::getSubject);
// 	}

// 	public Date extractExpiration(String token) {
// 		return extractClaim(token, Claims::getExpiration);
// 	}

// 	public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
// 		final Claims claims = extractAllClaims(token);
// 		return claimsResolver.apply(claims);
// 	}

// 	private Claims extractAllClaims(String token) {
// 		return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
// 	}

// 	private Boolean isTokenExpired(String token) {
// 		return extractExpiration(token).before(new Date());
// 	}

// 	public String generateToken(UserDetails userDetails) {
// 		Map<String, Object> claims = new HashMap<>();
// 		return createToken(claims, userDetails.getUsername());
// 	}

// 	private String createToken(Map<String, Object> claims, String subject) {
// 		logger.info("JwtUtil : createToken : subject : {}", subject);
// 		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
// 				.setExpiration(new Date(System.currentTimeMillis() + (15 * 60 * 1000)))
// 				.signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
// 	}

// 	public Boolean validateToken(String token, UserDetails userDetails) {
// 		final String username = extractUsername(token);
// 		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
// 	}

// 	public static void main(String args[]) {
// 		JwtUtil util = new JwtUtil();
// 		String token = "49c0vkXgJXhN1ppyFJAqnN6A3YQvjSvoR7nEVk40121XMsvZaSA7QKS1GrUqyjNgSfTiXg5r9XluGEawZ5y7Cb322V2bKAa29lzoU5tNcEpMyWav4amIumOBxGNfQ1PWz62Ds3dhaeAC42dJpPDyECj/hCZZ1VCJuX2ZF1bfxAFP/fHfJEJBeKDezTEI0tvuemdL2VyrILtmJQlI8FFUzA==";
// 		System.out.print(util.extractExpiration(token));
// 	}

// }
