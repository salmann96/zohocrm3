<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Information</title>
</head>
<body>
<h2>Lead Information</h2>
<hr/>

FirstName: ${contact.firstname}<br/>
lastName: ${contact.lastname}<br/>
Email: ${contact.email}<br/>
Mobile: ${contact.mobile}<br/>
Source: ${contact.source}<br/>

</body>
</html>