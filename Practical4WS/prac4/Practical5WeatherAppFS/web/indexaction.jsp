<%-- 
    Document   : indexaction
    Created on : 18 Jul, 2022, 11:48:50 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Weather Shit</title>
    </head>
    <body>
        <center>
<%
tycs.WeatherAPI_Service obj=new tycs.WeatherAPI_Service(); //obj of service
tycs.WeatherAPI port=obj.getWeatherAPIPort(); //port for service
String x=request.getParameter("city"); //took input from DropdownList name(city)
out.println("Result: "+port.fetchWeather(x)); //calling webservice method(fetchinfo) by passing our selected
%>
</center>
    </body>
</html>
