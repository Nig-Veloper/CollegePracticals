<%-- 
    Document   : indexaction
    Created on : 11 Jul, 2022, 11:37:03 AM
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
        <%
            tycs.Calculator_Service obj = new tycs.Calculator_Service();
            
            tycs.Calculator port = obj.getCalculatorPort();
            
            String num1 = request.getParameter("txt1");
            String num2 = request.getParameter("txt2");
            
            float val1 = Float.parseFloat(num1);
            float val2 = Float.parseFloat(num2);
            
            String ad = request.getParameter("add");
            String su=request.getParameter("sub"); 
            String mu=request.getParameter("mul"); 
            String di=request.getParameter("div");
            
            if(ad!=null){
                float result = port.add(val1, val2);
                out.println("Addition => "+result);
            }
            else if(su!=null)
            {
         float result=port.sub(val1, val2); //calling webservice method2
         out.println("Subtraction => "+result);
            }
           else if(mu!=null)
            {
            float result=port.mul(val1, val2); //calling webservice method3
            out.println("Multiplication: "+result);
            }
        else
        {
        float result=port.div(val1, val2); //calling webservice method4
        out.println("Division: "+result);
 
        }

        %>
    </body>
</html>
