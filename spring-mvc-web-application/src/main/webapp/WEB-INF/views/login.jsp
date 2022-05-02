<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
My First JSP

<form action="/login" method = "post">
<p ><font color = "red">${errorMessage}</font></p>
Enter your name : <input type = "text" name = "name"/>
Enter your password : <input type = "password" name = "password"/>
<input type = "submit" value = "submit"/>
</form>

</body>
</html>