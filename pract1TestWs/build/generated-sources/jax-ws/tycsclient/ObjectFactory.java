
package tycsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tycsclient package. 
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

    private final static QName _CtoF_QNAME = new QName("http://tycs/", "CtoF");
    private final static QName _CtoFResponse_QNAME = new QName("http://tycs/", "CtoFResponse");
    private final static QName _FtoC_QNAME = new QName("http://tycs/", "FtoC");
    private final static QName _FtoCResponse_QNAME = new QName("http://tycs/", "FtoCResponse");
    private final static QName _Hello_QNAME = new QName("http://tycs/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://tycs/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tycsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CtoF }
     * 
     */
    public CtoF createCtoF() {
        return new CtoF();
    }

    /**
     * Create an instance of {@link CtoFResponse }
     * 
     */
    public CtoFResponse createCtoFResponse() {
        return new CtoFResponse();
    }

    /**
     * Create an instance of {@link FtoC }
     * 
     */
    public FtoC createFtoC() {
        return new FtoC();
    }

    /**
     * Create an instance of {@link FtoCResponse }
     * 
     */
    public FtoCResponse createFtoCResponse() {
        return new FtoCResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CtoF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tycs/", name = "CtoF")
    public JAXBElement<CtoF> createCtoF(CtoF value) {
        return new JAXBElement<CtoF>(_CtoF_QNAME, CtoF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CtoFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tycs/", name = "CtoFResponse")
    public JAXBElement<CtoFResponse> createCtoFResponse(CtoFResponse value) {
        return new JAXBElement<CtoFResponse>(_CtoFResponse_QNAME, CtoFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FtoC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tycs/", name = "FtoC")
    public JAXBElement<FtoC> createFtoC(FtoC value) {
        return new JAXBElement<FtoC>(_FtoC_QNAME, FtoC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FtoCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tycs/", name = "FtoCResponse")
    public JAXBElement<FtoCResponse> createFtoCResponse(FtoCResponse value) {
        return new JAXBElement<FtoCResponse>(_FtoCResponse_QNAME, FtoCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tycs/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tycs/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
