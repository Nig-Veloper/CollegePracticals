<%-- 
    Document   : calculator
    Created on : 4 Jul, 2022, 12:21:08 PM
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
        <h1>Calculator</h1>
        <%
 int num1 = Integer.parseInt(request.getParameter("num1"));
 int num2 = Integer.parseInt(request.getParameter("num2"));

 String operation = request.getParameter("r1");

 if(operation.equals("Add")){
 int add=num1+num2;
 out.println("Addition is: "+add);
 }
 else if(operation.equals("Sub")){

 int sub=num1-num2;
 out.println("Substraction is: "+sub);
 }
 else if(operation.equals("mul")){
 int mul=num1*num2;
 out.println("multiplication is: "+mul);
 }
 else if(operation.equals("div"))
 {
 int div = num1/num2;
 if(num1>=num2)
 out.println("division is: "+div);
 else
 out.println("The division cannot be performed");
 }
%>
    </body>
</html>
