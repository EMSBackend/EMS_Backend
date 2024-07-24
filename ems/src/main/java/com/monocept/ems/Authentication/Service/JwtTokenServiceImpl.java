// package com.monocept.ems.Authentication.Service;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.monocept.ems.Authentication.Dao.JwtDao;
// import com.monocept.ems.Authentication.Model.JwtToken;

// @Service
// public class JwtTokenServiceImpl implements JwtTokenService {

// 	private static final Logger logger = LoggerFactory.getLogger(JwtTokenServiceImpl.class);

// 	@Autowired
// 	private JwtDao jwtDao;

// 	@Override
// 	public boolean createTokenEntry(String employeeId, String email, String jwtToken) {
// 		try {
// 			deletePreviousToken(employeeId, email);
// 			jwtDao.save(new JwtToken(employeeId, email, jwtToken));
// 			logger.info("Jwt token saved successfully {}", employeeId);
// 		} catch (Exception e) {
// 			logger.error("Exception while create jwt token entry");
// 			logger.info(e.getMessage(), e);
// 			return false;
// 		}
// 		return true;
// 	}

// 	private void deletePreviousToken(String employeeId, String email) {
// 		logger.info("is token deleted {}", jwtDao.deletePreviousToken(employeeId, email));

// 	}

// 	@Override
// 	public boolean isTokenActive(String employeeId, String jwt) {
// 		logger.info("Inside isTokenActive {} employeeId:", employeeId);
// 		JwtToken token = jwtDao.isTokenActive(employeeId, jwt);
// 		return token == null ? false : true;
// 	}

// }
