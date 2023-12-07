package com.ibsplc.amr_login.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ibsplc.amr_login.model.LoginDetails;

@Mapper
public interface LoginMapper {

	@Insert("insert into flight_login("
			+"login_id,"
			+"username,"
			+"password)"
			+"values"
			+"(#{loginDetails.login_id},#{loginDetails.username},#{loginDetails.password})")
	void insertLoginDetails(@Param("loginDetails") LoginDetails loginDetails);

	@Select("select * from flight_login where username=#{username}")
	List<LoginDetails> checkLoginDetails(@Param("username") String username);

}
