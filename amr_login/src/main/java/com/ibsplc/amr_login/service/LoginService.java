package com.ibsplc.amr_login.service;

import com.ibsplc.amr_login.model.LoginDetails;

public interface LoginService {
	public boolean insertLoginDetails(LoginDetails loginDetails);
	public boolean checkLoginDetails(String username);

}
