<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>Home Page</title>
	
	</head>
	<body>
		Welcome to Home Page
	
	</body>
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
			<input type="submit" value="Log Out">
	</form:form>
	

</html>