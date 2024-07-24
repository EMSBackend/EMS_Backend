package com.monocept.ems.authentication.Dao;
// package com.monocept.ems.Authentication.Dao;

// import javax.transaction.Transactional;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
// import org.springframework.stereotype.Repository;

// import com.monocept.ems.Authentication.Model.JwtToken;

// @Repository
// public interface JwtDao extends JpaRepository<JwtToken, Long> {

// 	@Transactional
// 	@Modifying
// 	@Query(value = "Delete from Jwt_Token where Employee_Id=:employeeId AND Email_Id=:email", nativeQuery = true)
// 	int deletePreviousToken(@Param("employeeId") String employeeId, @Param("email") String email);

// 	@Query(value = "Select * from Jwt_Token where Employee_Id=:employeeId AND Token=:jwt AND Status='ACTIVE'", nativeQuery = true)
// 	JwtToken isTokenActive(@Param("employeeId") String employeeId, @Param("jwt") String jwt);

// }
