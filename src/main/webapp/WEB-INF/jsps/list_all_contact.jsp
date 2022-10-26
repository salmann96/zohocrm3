<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All leads</title>
</head>
<body>
<h2>All Leads</h2>
<table border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Source</th>
<th>Billing</th>

</tr>
			<c:forEach var="contact" items="${contact}">
			<tr>
				<td><a href="findByIdContact?id=${contact.id}">${contact.firstname}</a></td>
				<td>${contact.lastname}</td>
				<td>${contact.email}</td>
				<td>${contact.mobile}</td>
				<td>${contact.source}</td>
				<td><a href="GenerateBill?id=${contact.id}">GenerateBill</a></td>
			</tr>
		</c:forEach>
</table>
</body>
</html>