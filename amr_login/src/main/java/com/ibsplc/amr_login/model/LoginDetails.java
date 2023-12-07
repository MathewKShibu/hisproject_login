package com.ibsplc.amr_login.model;

public class LoginDetails {
	private int login_id;
	private String username;
	private String password;

	public LoginDetails()
	{

	}

	public LoginDetails(int login_id, String username, String password) {
		super();
		this.login_id = login_id;
		this.username = username;
		this.password = password;
	}

	public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDetails [login_id=" + login_id + ", username=" + username + ", password=" + password + "]";
	}

}
