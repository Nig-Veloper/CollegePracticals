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
@WebService(serviceName = "TEMP")
public class TEMP {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FtoC")
    public Double FtoC(@WebParam(name = "Temperature") double Temperature) {
        //TODO write your implementation code here:
        Double c = (Temperature-32)*1.8;
        return c;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CtoF")
    public Double CtoF(@WebParam(name = "Temparature") double Temparature) {
        //TODO write your implementation code here:
        Double f = (Temparature*1.8)+ 32;
        return f;
    }

    
}
