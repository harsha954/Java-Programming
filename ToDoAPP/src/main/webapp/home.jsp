<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TO DO APPLICATION</title>
</head>
<body>
    <h1>                         TO DO APPLICATION           </h1><br>
    <h2>                                                      Developed by Harshith Raj</h2>
<form action="home">
    Enter Name:
    <input type="text" name="t1"><br><br>
    Enter Data to Store:
    <input type="text" name="t2"><br><br>
    <input type="submit"><br><br><br><br>
</form>
    Name Entered is: <%=request.getAttribute("Name")%><br><br>
    Data Entered is: <%=request.getAttribute("Data")%>
</body>
</html>