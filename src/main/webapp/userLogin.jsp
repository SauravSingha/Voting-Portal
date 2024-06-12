<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/VotingPortal/UserCss/userLogin.css">
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

    <div class="main-div">
        <div class="left-container">
            <!-- <div class="title">
                <h5>voting</h5>
                <h5 style="color:black">SYSTEM</h5>
            </div> -->
            <div class="content" style="margin-top: 70px;">
                <h1>Welcome to Online Voting</h1>
                <h1>System</h1>
                <h1 style=" margin-top: 40px; font-family: audiowide;">Your Vote, Your Voice</h1>
            </div>
        </div>
        <div class="right-container">
            <h2>Voter Login</h2>
          		<c:if test="${not empty succMsg }">
					<p class="text-center text-success fs-3">${succMsg}</p>
					<c:remove var="succMsg" scope="session" />
				</c:if>

				<c:if test="${not empty errorMsg }">
					<p class="text-center text-danger fs-5">${errorMsg}</p>
					<c:remove var="errorMsg" scope="session" />
				</c:if>
				
            <form id="login-form" action="userLogin" method="post">
                <div class="input-group">
                    <label for="username">Email:</label>
                    <input type="email" id="email" name="email" placeholder="Enter your email" required>
                </div>
                <div class="input-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" placeholder="Enter your password" required>
                </div>
                <button type="submit">Login</button>
            </form>
            <div class="register-link">
                <p>Not registered? <a href="userRegistration.html">Register now</a></p>
            </div>
        </div>
    </div>
</body>
</html>