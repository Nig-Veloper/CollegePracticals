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
@WebService(serviceName = "TempConverter")
public class TempConverter {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "CtoF")
    public Double CtoF(@WebParam(name = "c") double c) {
        //TODO write your implementation code here:
        Double f = (c *9/5) + 32 ;
        return f;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FtoC")
    public Double FtoC(@WebParam(name = "f") double f) {
        //TODO write your implementation code here:
        Double c = (f-32) * 5/9 ;
        return c;
    }
}
