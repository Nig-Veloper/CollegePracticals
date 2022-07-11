/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tycs;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addition")
    public Double addition(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        //TODO write your implementation code here:
        double res = num1 + num2;
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtraction")
    public Double subtraction(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        //TODO write your implementation code here:
        double res = num1 - num2;
        return res;
    }
    
    
    
    
}
