<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST" >
	
	
	<c:if test="${param.error!=null}">
		<i>Sorry! Invalid User name and pwd</i>
	</c:if>
	<p>
	User Name: <input type="text" name="username" />
	</p>
	
	<p>
	Password: <input type="password" name="password" />
	</p>
	
	<input type="submit" value="Login" />

</form:form>