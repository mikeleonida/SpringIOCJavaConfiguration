package com.spring.bean.javaconfiguration2;

public class User {
	private int userId;
	private String name;
	private String city;

	public User() {
		super();
	}

	public User(int userId, String name, String city) {
		super();
		this.userId = userId;
		this.name = name;
		this.city = city;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", city=" + city + "]";
	}
	
}
