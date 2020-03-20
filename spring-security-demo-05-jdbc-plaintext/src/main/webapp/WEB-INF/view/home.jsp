<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
	<head>
		<title>Home Page</title>
	
	</head>
	<body>
		Welcome to Home Page
	
	<hr>
	<p>
		User:<security:authentication property="principal.username" />
		Role:<security:authentication property="principal.authorities" />
	</p>
	<security:authorize access="hasRole('MANAGER')">
	<p>
	<a href="${pageContext.request.contextPath}/leaders">Leaders Meeting (Only For leaders)</a>
	
	</p>
	</security:authorize>
	<br><br>
	<security:authorize access="hasRole('ADMIN')">
	<p>
	<a href="${pageContext.request.contextPath}/systems">Admins Meeting(Only for Admins)</a>
	</p>
	</security:authorize>
	</hr>
	
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
			<input type="submit" value="Log Out">
	</form:form>
	
	</body>

</html>