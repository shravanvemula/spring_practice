<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<title>Customer Confirmation</title>
<body>
The customer is confirmed: ${customer.firstName} ${customer.lastName}
<br><br>
Customer's Free Passes : ${customer.freePasses}
<br><br>
Customer's Postal Code : ${customer.postalCode}
<br><br>
Customer's Course Code : ${customer.courseCode}
</body>
</html>