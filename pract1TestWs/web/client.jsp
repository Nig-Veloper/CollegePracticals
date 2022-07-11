<%-- 
    Document   : client
    Created on : 4 Jul, 2022, 11:02:58 AM
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
         Enter Temperature CtoF <input type="text" name="Temp" value="" />
         <input type="submit" value="ConvetTemparature" />  
                  Enter Temperature FtoC <input type="text" name="Tempf" value="" />
         <input type="submit" value="ConvetTemparature" />   
        </form>
    </body>
</html>
