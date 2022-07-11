<%-- 
    Document   : client
    Created on : 4 Jul, 2022, 10:51:05 AM
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
        <h1>Hello World!</h1>
        <form action="indexaction.jsp" method="POST">
         Enter Temperature <input type="text" name="Temp" value="" />
         <input type="submit" value="ConvetTemparature" />   
        </form>
    </body>
</html>
