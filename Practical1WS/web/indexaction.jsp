<%-- 
    Document   : indexaction
    Created on : 27 Jun, 2022, 12:17:10 PM
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
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	tycsclient.TempConversion_Service service = new tycsclient.TempConversion_Service();
	tycsclient.TempConversion port = service.getTempConversionPort();
	 // TODO initialize WS operation arguments here
	double c = Double.parseDouble(request.getParameter("Temp"));
	// TODO process result here
	java.lang.Double result = port.ctoF(c);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
    
    </body>
</html>
