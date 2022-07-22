<%-- 
    Document   : index
    Created on : 18 Jul, 2022, 11:01:45 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Weather Info</title>
    </head>
    <body>
      <center>
<h1>Get Weather Info</h1>
<form action="indexaction.jsp" method="POST">
Select City:
<select name="city">
<option value="Mumbai">Mumbai</option>
<option value="Delhi">Delhi</option>
<option value="Uganda">Uganda</option>
<option value="Wakanda">Wakanda</option>
</select>

<br>
<input type="submit" value="Submit" />

</form>
</center>
    </body>
</html>
