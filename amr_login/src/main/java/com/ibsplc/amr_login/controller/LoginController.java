package com.ibsplc.amr_login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibsplc.amr_login.model.LoginDetails;
import com.ibsplc.amr_login.service.LoginService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoginController {
	@Autowired
	LoginService loginService;

	@PostMapping("/addlogin")
	public ResponseEntity<String> insertLoginDetails(@RequestBody LoginDetails loginDetails)
	{
		String addStatus="";
		ResponseEntity<String> newLoginEntity=null;
		boolean test=loginService.insertLoginDetails(loginDetails);
		if(test)
		{
			addStatus="{\"Status\":\"Success\"}";
			newLoginEntity=new ResponseEntity<String>(addStatus,HttpStatus.CREATED);
		}
		else
		{
			addStatus="{\"Status\":\"Failure\"}";
			newLoginEntity=new ResponseEntity<String>(addStatus,HttpStatus.NOT_IMPLEMENTED);
		}
		return newLoginEntity;
	}

	@GetMapping("/getlogin/{username}")
	public ResponseEntity<String> checkLoginDetails(String username)
	{
		String addStatus="";
		ResponseEntity<String> newLoginEntity=null;
		boolean test=loginService.checkLoginDetails(username);
		if(test)
		{
			addStatus="{\"Status\":\"Found\"}";
			newLoginEntity=new ResponseEntity<String>(addStatus,HttpStatus.CREATED);
		}
		else
		{
			addStatus="{\"Status\":\"Not found\"}";
			newLoginEntity=new ResponseEntity<String>(addStatus,HttpStatus.NOT_IMPLEMENTED);
		}
		return newLoginEntity;
	}

}
