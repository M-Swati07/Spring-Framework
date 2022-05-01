<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Google From JSP</title>
</head>

<!-- To write java code in JSP is called scriplets anything written within < % % >is a scriplet -->
<%
//System.out.println("Hello1");
//System.out.println(request.getParameter("name"));
//Date d = new Date(); 
//it imports the Date class within the % in line 1 and you can print it using line 17
//scriplets is a bad practice and jsp should only be used for rendering views and not logic, logic needs to be handled by servlets
%>
<!-- <div>--> <%//=d %> <!-- </div> -->
<body>
My First JSP

<form action="/login.do" method = "post">
<p ><font color = "red">${errorMessage}</font></p>
Enter your name : <input type = "text" name = "name"/>
Enter your password : <input type = "password" name = "password"/>
<input type = "submit" value = "submit"/>
</form>


</body>
</html>