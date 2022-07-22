
package tycs;

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
 * JAX-WS RI 2.2.6b20 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherAPI", targetNamespace = "http://ty/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherAPI {


    /**
     * 
     * @param cityName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fetchWeather", targetNamespace = "http://ty/", className = "tycs.FetchWeather")
    @ResponseWrapper(localName = "fetchWeatherResponse", targetNamespace = "http://ty/", className = "tycs.FetchWeatherResponse")
    @Action(input = "http://ty/WeatherAPI/fetchWeatherRequest", output = "http://ty/WeatherAPI/fetchWeatherResponse")
    public String fetchWeather(
        @WebParam(name = "cityName", targetNamespace = "")
        String cityName);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ty/", className = "tycs.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ty/", className = "tycs.HelloResponse")
    @Action(input = "http://ty/WeatherAPI/helloRequest", output = "http://ty/WeatherAPI/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
