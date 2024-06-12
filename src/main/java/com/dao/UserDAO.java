package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;

public class UserDAO {
	private Connection conn;

	public UserDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean register(User u) {
		boolean f = false;

		try {
            String sql = "INSERT INTO users (first_name, last_name, email, password, age, gender, dob, address, application_status, blocked) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, u.getFirstName());
            ps.setString(2, u.getLastName());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getPassword());
            ps.setInt(5, u.getAge());
            ps.setString(6, u.getGender());
            ps.setString(7, u.getDob()); 
            ps.setString(8, u.getAddress());
            byte b = (byte) ((u.getApplicationStatus()) ? 1 : 0);  
            ps.setByte(9, b);
            b = (byte) ((u.getBlocked()) ? 1 : 0);  
            ps.setByte(10, b);

			int i = ps.executeUpdate();

			if (i == 1) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public User login(String em, String psw) {
		User u = null;

		try {
			String sql = "select * from users where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, em);
			ps.setString(2, psw);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				u = new User();
				u.setUserId(rs.getInt(1));
				u.setFirstName(rs.getString(2));
				u.setLastName(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setPassword(rs.getString(5));
				u.setAge(rs.getInt(6));
				u.setGender(rs.getString(7));
				u.setDob(rs.getString(8));
				u.setAddress(rs.getString(9));
				u.setApplicationStatus(rs.getBoolean(10));
				u.setBlocked(rs.getBoolean(11));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
	
	
}
