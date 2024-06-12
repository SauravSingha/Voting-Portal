<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/VotingPortal/UserCss/registerUser.css">
    <title>User Registration</title>
</head>
<body>
    <div class="navbar">
        <div class="title">
            <h5>voting</h5>
            <h5 style="color:black">SYSTEM</h5>
        </div>
        <div class="navbar-menu">
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="userLogin.jsp">Voter Login</a></li>
                <li><a href="userRegistration.jsp">Register Voter</a></li>
                <li><a href="adminLogin.jsp">Admin Login</a></li>
            </ul>
        </div>
    </div>
    <div class="container">
        <h2>Registration Application</h2>   
		<c:if test="${not empty sucMsg }">
			<p class="text-center text-success fs-3">${sucMsg}</p>
			<c:remove var="sucMsg" scope="session" />
		</c:if>

		<c:if test="${not empty errorMsg }">
			<p class="text-center text-danger fs-3">${errorMsg}</p>
			<c:remove var="errorMsg" scope="session" />
		</c:if>
		
        <form id="registration-form" action="user_register" method="post">
            <div class="form-group">
                <label for="first-name">First Name:</label>
                <input type="text" id="first-name" name="first-name" placeholder="Enter first name" required>
            </div>
            <div class="form-group">
                <label for="last-name">Last Name:</label>
                <input type="text" id="last-name" name="last-name" placeholder="Enter last name" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">Set Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <label for="aadhar">Aadhar Number:</label>
                <input type="text" id="aadhar" name="aadhar">
            </div>
            <div class="form-group">
                <label for="age">Age:</label>
                <input type="number" id="age" name="age" required>
            </div>
            <div class="form-group">
                <label for="gender">Gender:</label>
                <select id="gender" name="gender" required>
                    <option value="">Select Gender</option>
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                    <option value="other">Other</option>
                </select>
            </div>
            <div class="form-group">
                <label for="user-image">Upload your image</label>
                <input type="file" id="user-image" name="user-image" accept="image/*" required>
            </div>
            <div class="form-group">
                <label for="dob">Date of Birth:</label>
                <input type="date" id="dob" name="dob" required>
            </div>
            <div class="form-group">
                <label for="address">Address:</label>
                <input type="text" id="address" name="address" required>
            </div>
            <button type="submit">Register</button>
        </form>
        <div class="message">
            <p>
                <span style="color: green;">
                    <%= request.getParameter("sucMsg") != null ? request.getParameter("sucMsg") : "" %>
                </span>
                <span style="color: red;">
                    <%= request.getParameter("errorMsg") != null ? request.getParameter("errorMsg") : "" %>
                </span>
            </p>
        </div>
    </div>
</body>
</html>