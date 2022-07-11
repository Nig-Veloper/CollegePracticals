/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ty;

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
    @WebMethod(operationName = "add")
    public Float add(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        //TODO write your implementation code here:
        return a+b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sub")
    public Float sub(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        //TODO write your implementation code here:
        return a - b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mul")
    public Float mul(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        //TODO write your implementation code here:
        return a * b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "div")
    public Float div(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        //TODO write your implementation code here:
        return a/b;
    }
    
    
}
