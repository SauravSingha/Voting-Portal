package com.user.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.dao.UserDAO;
import com.db.DBConnect;
import com.entity.User;

@WebServlet("/user_register")
public class UserRegistration extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
            String firstName = req.getParameter("first-name");
            String lastName = req.getParameter("last-name");
            String email = req.getParameter("email");
            String password = req.getParameter("password");
            int age = Integer.parseInt(req.getParameter("age"));
            String gender = req.getParameter("gender");
            String dob = req.getParameter("dob"); 

            String address = req.getParameter("address");

            User u = new User(firstName, lastName, email, password, age, gender, dob, address);
            UserDAO dao = new UserDAO(DBConnect.getConn());

            HttpSession session = req.getSession();

            boolean f = dao.register(u);

            if (f) {
                session.setAttribute("sucMsg", "Register Successfully");
                resp.sendRedirect("userLogin.jsp");
            } else {
                session.setAttribute("errorMsg", "Something went wrong on the server");
                resp.sendRedirect("userRegistration.jsp");
            }
        } catch (Exception e) {
//            e.printStackTrace();
        	System.out.println("Error in code");
        }
	}
}
