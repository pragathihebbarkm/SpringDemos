<%@ page language="java" contentType="text/html" isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<html>
<head>
<title>Register</title>
</head>
<body>
	<h1>User Registration</h1>
	
	<form action="registeruser" method="post">
		<pre>
			
			Name: <input type="text" name="name" />
			Email Id: <input type="text" name="email" />
			Password: <input type="password" name="password">
			<input type="submit" name="Sign Up" />
			
		</pre>
	</form>
	
	<p>${message}</p>
	
	<ul>
		<c:forEach items="${users}" >
			<li>
			${user.id} |  ${user.name} | ${user.email} 
			</li>
		</c:forEach>
	</ul>
	
	
</body>
</html>