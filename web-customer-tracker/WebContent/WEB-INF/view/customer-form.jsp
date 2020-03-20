<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<!DOCTYPE html>
<html>
<head>
<title>Customer Form</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />

</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Customer Form</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
	
	
		<form:form action="saveCustomer" modelAttribute="customer" method="POST" >	
			<form:hidden path="id" />
			<table>
				<tbody> 
	
						<tr>
							<td><label>First Name:</label></td>
							<td><form:input path="firstName" /></td>
						</tr>
		
						<tr>
							<td><label>Last Name:</label></td>
							<td><form:input path="lastName" /></td>
						</tr>
		
						<tr>
							<td><label>Email:</label></td>
							<td><form:input path="email" /></td>
						</tr>
						
						<tr>
						<td><input type="submit" value="Save" class="save" /></td>
						</tr>
		
		
				</tbody>	
		
			</table>
		</form:form>
		
		<a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
		</div>
	</div>
</body>
</html>