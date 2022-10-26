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


<form action="saveLead" method="post">
<table>
<tr>
<td>FirstName</td>
<td><input type="text" name="firstname"></td>
</tr>
<tr>
<td>LastName</td>
<td><input type="text" name="lastname"></td>
</tr>
<tr>
<td>Email</td>
<td><input type="email" name="email"></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="number" name="mobile"></td>
</tr>

<tr>
<td>Source</td>
<td>
<select name="source">
  <option value="newspaper">Newspaper</option>
  <option value="tvcommercial">TV commercial</option>
  <option value="online">Online</option>
  <option value="seminar">Seminar</option>
</select>
</td>
</tr>
<tr>
<td><input type="submit" name="Save"></td>
</tr>
</table>
</form>

</body>
</html>