
package tycsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TempConverter", targetNamespace = "http://tycs/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TempConverter {


    /**
     * 
     * @param f
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "FtoC")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "FtoC", targetNamespace = "http://tycs/", className = "tycsclient.FtoC")
    @ResponseWrapper(localName = "FtoCResponse", targetNamespace = "http://tycs/", className = "tycsclient.FtoCResponse")
    @Action(input = "http://tycs/TempConverter/FtoCRequest", output = "http://tycs/TempConverter/FtoCResponse")
    public Double ftoC(
        @WebParam(name = "f", targetNamespace = "")
        double f);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://tycs/", className = "tycsclient.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://tycs/", className = "tycsclient.HelloResponse")
    @Action(input = "http://tycs/TempConverter/helloRequest", output = "http://tycs/TempConverter/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param c
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "CtoF")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CtoF", targetNamespace = "http://tycs/", className = "tycsclient.CtoF")
    @ResponseWrapper(localName = "CtoFResponse", targetNamespace = "http://tycs/", className = "tycsclient.CtoFResponse")
    @Action(input = "http://tycs/TempConverter/CtoFRequest", output = "http://tycs/TempConverter/CtoFResponse")
    public Double ctoF(
        @WebParam(name = "c", targetNamespace = "")
        double c);

}
