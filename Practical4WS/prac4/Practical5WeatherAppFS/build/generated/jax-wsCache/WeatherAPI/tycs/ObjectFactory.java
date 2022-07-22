
package tycs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tycs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FetchWeatherResponse_QNAME = new QName("http://ty/", "fetchWeatherResponse");
    private final static QName _FetchWeather_QNAME = new QName("http://ty/", "fetchWeather");
    private final static QName _HelloResponse_QNAME = new QName("http://ty/", "helloResponse");
    private final static QName _Hello_QNAME = new QName("http://ty/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tycs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link FetchWeather }
     * 
     */
    public FetchWeather createFetchWeather() {
        return new FetchWeather();
    }

    /**
     * Create an instance of {@link FetchWeatherResponse }
     * 
     */
    public FetchWeatherResponse createFetchWeatherResponse() {
        return new FetchWeatherResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchWeatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ty/", name = "fetchWeatherResponse")
    public JAXBElement<FetchWeatherResponse> createFetchWeatherResponse(FetchWeatherResponse value) {
        return new JAXBElement<FetchWeatherResponse>(_FetchWeatherResponse_QNAME, FetchWeatherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchWeather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ty/", name = "fetchWeather")
    public JAXBElement<FetchWeather> createFetchWeather(FetchWeather value) {
        return new JAXBElement<FetchWeather>(_FetchWeather_QNAME, FetchWeather.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ty/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ty/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
