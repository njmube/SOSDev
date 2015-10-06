
package princip;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "servLic", targetNamespace = "http://princip/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServLic {


    /**
     * 
     * @param mac
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "givmac", targetNamespace = "http://princip/", className = "princip.Givmac")
    @ResponseWrapper(localName = "givmacResponse", targetNamespace = "http://princip/", className = "princip.GivmacResponse")
    @Action(input = "http://princip/servLic/givmacRequest", output = "http://princip/servLic/givmacResponse")
    public String givmac(
        @WebParam(name = "mac", targetNamespace = "")
        String mac);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pruebcon", targetNamespace = "http://princip/", className = "princip.Pruebcon")
    @ResponseWrapper(localName = "pruebconResponse", targetNamespace = "http://princip/", className = "princip.PruebconResponse")
    @Action(input = "http://princip/servLic/pruebconRequest", output = "http://princip/servLic/pruebconResponse")
    public String pruebcon();

    /**
     * 
     * @param ser
     * @param key
     * @param mac
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "revsis", targetNamespace = "http://princip/", className = "princip.Revsis")
    @ResponseWrapper(localName = "revsisResponse", targetNamespace = "http://princip/", className = "princip.RevsisResponse")
    @Action(input = "http://princip/servLic/revsisRequest", output = "http://princip/servLic/revsisResponse")
    public String revsis(
        @WebParam(name = "ser", targetNamespace = "")
        String ser,
        @WebParam(name = "key", targetNamespace = "")
        String key,
        @WebParam(name = "mac", targetNamespace = "")
        String mac);

    /**
     * 
     * @param ser
     * @param key
     * @param mac
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "serkey", targetNamespace = "http://princip/", className = "princip.Serkey")
    @ResponseWrapper(localName = "serkeyResponse", targetNamespace = "http://princip/", className = "princip.SerkeyResponse")
    @Action(input = "http://princip/servLic/serkeyRequest", output = "http://princip/servLic/serkeyResponse")
    public String serkey(
        @WebParam(name = "ser", targetNamespace = "")
        String ser,
        @WebParam(name = "key", targetNamespace = "")
        String key,
        @WebParam(name = "mac", targetNamespace = "")
        String mac);

    /**
     * 
     * @param mac
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "avis", targetNamespace = "http://princip/", className = "princip.Avis")
    @ResponseWrapper(localName = "avisResponse", targetNamespace = "http://princip/", className = "princip.AvisResponse")
    @Action(input = "http://princip/servLic/avisRequest", output = "http://princip/servLic/avisResponse")
    public String avis(
        @WebParam(name = "mac", targetNamespace = "")
        String mac);

    /**
     * 
     * @param mac
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "msjmac", targetNamespace = "http://princip/", className = "princip.Msjmac")
    @ResponseWrapper(localName = "msjmacResponse", targetNamespace = "http://princip/", className = "princip.MsjmacResponse")
    @Action(input = "http://princip/servLic/msjmacRequest", output = "http://princip/servLic/msjmacResponse")
    public String msjmac(
        @WebParam(name = "mac", targetNamespace = "")
        String mac);

    /**
     * 
     * @param ser
     * @param msj
     * @param mac
     * @param key
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "regmsj", targetNamespace = "http://princip/", className = "princip.Regmsj")
    @ResponseWrapper(localName = "regmsjResponse", targetNamespace = "http://princip/", className = "princip.RegmsjResponse")
    @Action(input = "http://princip/servLic/regmsjRequest", output = "http://princip/servLic/regmsjResponse")
    public String regmsj(
        @WebParam(name = "mac", targetNamespace = "")
        String mac,
        @WebParam(name = "msj", targetNamespace = "")
        String msj,
        @WebParam(name = "ser", targetNamespace = "")
        String ser,
        @WebParam(name = "key", targetNamespace = "")
        String key);

}
