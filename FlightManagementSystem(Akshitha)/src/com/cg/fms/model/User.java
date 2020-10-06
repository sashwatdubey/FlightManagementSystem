package com.cg.fms.model;

public class User {
	private int userId;
	private String userName;
	private String password;
	private long mobileNumber;
	private String emailId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public User(int userId, String userName, String password, long mobileNumber, String emailId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	public User(String userName, String password, long mobileNumber, String emailId) {
		super();
		this.userName = userName;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	
	public User(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", mobileNumber="
				+ mobileNumber + ", emailId=" + emailId + "]";
	}

	
}
