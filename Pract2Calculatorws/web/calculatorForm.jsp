<%-- 
    Document   : calculatorForm
    Created on : 4 Jul, 2022, 12:22:42 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
<form action="calculator.jsp" method="get">

<label for="num1"><b>Number 1</b></label>
<input type="text" name ="num1"><br><br>
<label for = "num2"><b>Number 2</b></label>
<input type="text" name="num2"><br><br>

<input type ="radio" name = "r1" value="Add">+
<input type = "radio" name = "r1" value="Sub">-<br>
<input type="radio" name="r1" value ="mul">*
<input type = "radio" name="r1" value="div">/<br><br>

<input type="submit" value="submit">
</form>
</center>
    </body>
</html>
