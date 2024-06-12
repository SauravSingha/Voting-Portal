package com.entity;
import java.sql.Date;

public class User {
	private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int age;
    private String gender;
    private String dob;
    private String address;
    private boolean applicationStatus;
    private boolean blocked;

    public User() {
    	super();
    }
    
    public User(String firstName, String lastName, String email, String password,
            int age, String gender,String dob, String address) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.email = email;
	    this.password = password;
	    this.age = age;
	    this.gender = gender;
	    this.dob = dob;
	    this.address = address;
	    applicationStatus = false;
	    blocked = false;
    }
    
    // Getter and setter methods for userId
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getter and setter methods for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and setter methods for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and setter methods for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter methods for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter methods for gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and setter methods for dob
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    // Getter and setter methods for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    // Getter and setter application
    public boolean getApplicationStatus() {
    	return applicationStatus;
    }
    
    public void setApplicationStatus(boolean stat) {
    	this.applicationStatus = stat;
    }
    
    // getter and setter blocked
    public void setBlocked(boolean stat) {
    	this.blocked = true;
    }
    
    public boolean getBlocked(){
    	return blocked;
    }
}
