<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
</head>
<body>
<h2> Create | Lead</h2>


<form action="saveBill" method="post">
<table>
<tr>
<td>FirstName</td>
<td><input type="text" name="firstname" value="${contact.firstname}"></td>
</tr>
<tr>
<td>LastName</td>
<td><input type="text" name="lastname"value="${contact.lastname}"></td>
</tr>
<tr>
<td>Email</td>
<td><input type="email" name="email"value="${contact.email}"></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="number" name="mobile"value="${contact.mobile}"></td>
</tr>
<tr>
<td>Product</td>
<td><input type="text" name="product"></td>
</tr>
<tr>
<td>Amount</td>
<td><input type="number" name="amount"></td>

<tr>
<td><input type="submit" name="Save"></td>
</tr>
</table>
</form>

</body>
</html>