package com.ibsplc.amr_login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibsplc.amr_login.mapper.LoginMapper;
import com.ibsplc.amr_login.model.LoginDetails;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginMapper loginMapper;

	@Override
	public boolean insertLoginDetails(LoginDetails loginDetails) {
		boolean test;
		try
		{
			test=true;
			System.out.println(loginDetails);
			loginMapper.insertLoginDetails(loginDetails);
		}
		catch(Exception e)
		{
			test=false;
			e.printStackTrace();
		}
		return test;
	}

	@Override
	public boolean checkLoginDetails(String username) {
		boolean test;
		try
		{
			List<LoginDetails> a=loginMapper.checkLoginDetails(username);
			System.out.println(a);
			if(a.isEmpty())
			{
				test=false;
			}
			else
			{
				test=true;
			}

		}
		catch(Exception e)
		{
			test=false;
			e.printStackTrace();
		}
		return test;
	}

}
