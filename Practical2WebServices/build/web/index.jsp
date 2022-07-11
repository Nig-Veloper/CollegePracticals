<%-- 
    Document   : index
    Created on : 11 Jul, 2022, 11:31:57 AM
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
        <form action="indexaction.jsp" method="POST">
            <input type="text" name="txt1" value="" />  
            <input type="text" name="txt2" value="" />
            
            <input type="submit" value="add" name="add" />            
            <input type="submit" value="sub" name="sub" />
            <input type="submit" value="mul" name="mul" />
            <input type="submit" value="div" name="div" />
        </form>
    </body>
</html>
