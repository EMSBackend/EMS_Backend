package com.monocept.ems.Authentication.Service;

public interface JwtTokenService {

	boolean createTokenEntry(String employeeId, String email, String jwtToken);

	boolean isTokenActive(String username, String jwt);

}
