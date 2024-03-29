
package tycs;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b20 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WeatherAPI", targetNamespace = "http://ty/", wsdlLocation = "http://localhost:12802/Practical5WeatherAppFS/WeatherAPI?wsdl")
public class WeatherAPI_Service
    extends Service
{

    private final static URL WEATHERAPI_WSDL_LOCATION;
    private final static WebServiceException WEATHERAPI_EXCEPTION;
    private final static QName WEATHERAPI_QNAME = new QName("http://ty/", "WeatherAPI");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:12802/Practical5WeatherAppFS/WeatherAPI?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEATHERAPI_WSDL_LOCATION = url;
        WEATHERAPI_EXCEPTION = e;
    }

    public WeatherAPI_Service() {
        super(__getWsdlLocation(), WEATHERAPI_QNAME);
    }

    public WeatherAPI_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEATHERAPI_QNAME, features);
    }

    public WeatherAPI_Service(URL wsdlLocation) {
        super(wsdlLocation, WEATHERAPI_QNAME);
    }

    public WeatherAPI_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEATHERAPI_QNAME, features);
    }

    public WeatherAPI_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherAPI_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WeatherAPI
     */
    @WebEndpoint(name = "WeatherAPIPort")
    public WeatherAPI getWeatherAPIPort() {
        return super.getPort(new QName("http://ty/", "WeatherAPIPort"), WeatherAPI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherAPI
     */
    @WebEndpoint(name = "WeatherAPIPort")
    public WeatherAPI getWeatherAPIPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ty/", "WeatherAPIPort"), WeatherAPI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEATHERAPI_EXCEPTION!= null) {
            throw WEATHERAPI_EXCEPTION;
        }
        return WEATHERAPI_WSDL_LOCATION;
    }

}
