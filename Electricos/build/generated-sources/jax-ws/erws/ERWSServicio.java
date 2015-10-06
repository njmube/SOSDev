
package erws;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ERWSServicio", targetNamespace = "urn:ERWS", wsdlLocation = "http://easyretail.com.mx/wsn/metodos.wsdl")
public class ERWSServicio
    extends Service
{

    private final static URL ERWSSERVICIO_WSDL_LOCATION;
    private final static WebServiceException ERWSSERVICIO_EXCEPTION;
    private final static QName ERWSSERVICIO_QNAME = new QName("urn:ERWS", "ERWSServicio");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://easyretail.com.mx/wsn/metodos.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ERWSSERVICIO_WSDL_LOCATION = url;
        ERWSSERVICIO_EXCEPTION = e;
    }

    public ERWSServicio() {
        super(__getWsdlLocation(), ERWSSERVICIO_QNAME);
    }

    public ERWSServicio(WebServiceFeature... features) {
        super(__getWsdlLocation(), ERWSSERVICIO_QNAME, features);
    }

    public ERWSServicio(URL wsdlLocation) {
        super(wsdlLocation, ERWSSERVICIO_QNAME);
    }

    public ERWSServicio(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ERWSSERVICIO_QNAME, features);
    }

    public ERWSServicio(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ERWSServicio(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ERWSPort
     */
    @WebEndpoint(name = "ERWSPort")
    public ERWSPort getERWSPort() {
        return super.getPort(new QName("urn:ERWS", "ERWSPort"), ERWSPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ERWSPort
     */
    @WebEndpoint(name = "ERWSPort")
    public ERWSPort getERWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:ERWS", "ERWSPort"), ERWSPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ERWSSERVICIO_EXCEPTION!= null) {
            throw ERWSSERVICIO_EXCEPTION;
        }
        return ERWSSERVICIO_WSDL_LOCATION;
    }

}
