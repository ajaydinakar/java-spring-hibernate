<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
	<legend>Registration form</legend>
<form action="rest/welcome/add" method="post">
	
	
	<table>
	
<tr>
	<td>Id:</td>
	<td>
	<input type="text" name="id">	
	</td>
</tr>
<tr>
	<td>Name:</td>
	<td>
	<input type="text" name="name">	
	</td>
</tr>
<tr>
	<td>Password:</td><td>
		<input type="text" name="password">
	</td>
</tr>
<tr>
	<tr></tr>
	<td>
	
	<input type="submit" name="button"  value="Insert">
	</td>
</tr>
</table>

</form>

</fieldset>
</body>
</html>