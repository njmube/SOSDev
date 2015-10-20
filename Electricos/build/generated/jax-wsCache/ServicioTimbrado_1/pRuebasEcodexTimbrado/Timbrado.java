
package pRuebasEcodexTimbrado;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Timbrado", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Timbrado {


    /**
     * 
     * @param parameters
     * @return
     *     returns pRuebasEcodexTimbrado.RespuestaTimbraXML
     * @throws TimbradoTimbraXMLFallaServicioFaultFaultMessage
     * @throws TimbradoTimbraXMLFallaSesionFaultFaultMessage
     * @throws TimbradoTimbraXMLFallaValidacionFaultFaultMessage
     */
    @WebMethod(operationName = "TimbraXML", action = "http://Ecodex.WS.Model/2011/CFDI/Timbrado/TimbraXML")
    @WebResult(name = "RespuestaTimbraXML", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
    public RespuestaTimbraXML timbraXML(
        @WebParam(name = "SolicitudTimbraXML", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
        SolicitudTimbraXML parameters)
        throws TimbradoTimbraXMLFallaServicioFaultFaultMessage, TimbradoTimbraXMLFallaSesionFaultFaultMessage, TimbradoTimbraXMLFallaValidacionFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns pRuebasEcodexTimbrado.RespuestaCancelaTimbrado
     * @throws TimbradoCancelaTimbradoFallaServicioFaultFaultMessage
     * @throws TimbradoCancelaTimbradoFallaValidacionFaultFaultMessage
     * @throws TimbradoCancelaTimbradoFallaSesionFaultFaultMessage
     */
    @WebMethod(operationName = "CancelaTimbrado", action = "http://Ecodex.WS.Model/2011/CFDI/Timbrado/CancelaTimbrado")
    @WebResult(name = "RespuestaCancelaTimbrado", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
    public RespuestaCancelaTimbrado cancelaTimbrado(
        @WebParam(name = "SolicitudCancelaTimbrado", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
        SolicitudCancelaTimbrado parameters)
        throws TimbradoCancelaTimbradoFallaServicioFaultFaultMessage, TimbradoCancelaTimbradoFallaSesionFaultFaultMessage, TimbradoCancelaTimbradoFallaValidacionFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns pRuebasEcodexTimbrado.RespuestaEstatusTimbrado
     * @throws TimbradoEstatusTimbradoFallaServicioFaultFaultMessage
     * @throws TimbradoEstatusTimbradoFallaSesionFaultFaultMessage
     * @throws TimbradoEstatusTimbradoFallaValidacionFaultFaultMessage
     */
    @WebMethod(operationName = "EstatusTimbrado", action = "http://Ecodex.WS.Model/2011/CFDI/Timbrado/EstatusTimbrado")
    @WebResult(name = "RespuestaEstatusTimbrado", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
    public RespuestaEstatusTimbrado estatusTimbrado(
        @WebParam(name = "SolicitudEstatusTimbrado", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
        SolicitudEstatusTimbrado parameters)
        throws TimbradoEstatusTimbradoFallaServicioFaultFaultMessage, TimbradoEstatusTimbradoFallaSesionFaultFaultMessage, TimbradoEstatusTimbradoFallaValidacionFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns pRuebasEcodexTimbrado.RespuestaObtenerTimbrado
     * @throws TimbradoObtenerTimbradoFallaServicioFaultFaultMessage
     * @throws TimbradoObtenerTimbradoFallaValidacionFaultFaultMessage
     * @throws TimbradoObtenerTimbradoFallaSesionFaultFaultMessage
     */
    @WebMethod(operationName = "ObtenerTimbrado", action = "http://Ecodex.WS.Model/2011/CFDI/Timbrado/ObtenerTimbrado")
    @WebResult(name = "RespuestaObtenerTimbrado", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
    public RespuestaObtenerTimbrado obtenerTimbrado(
        @WebParam(name = "SolicitudObtenerTimbrado", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
        SolicitudObtenerTimbrado parameters)
        throws TimbradoObtenerTimbradoFallaServicioFaultFaultMessage, TimbradoObtenerTimbradoFallaSesionFaultFaultMessage, TimbradoObtenerTimbradoFallaValidacionFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns pRuebasEcodexTimbrado.RespuestaObtenerQRTimbrado
     * @throws TimbradoObtenerQRTimbradoFallaServicioFaultFaultMessage
     * @throws TimbradoObtenerQRTimbradoFallaValidacionFaultFaultMessage
     * @throws TimbradoObtenerQRTimbradoFallaSesionFaultFaultMessage
     */
    @WebMethod(operationName = "ObtenerQRTimbrado", action = "http://Ecodex.WS.Model/2011/CFDI/Timbrado/ObtenerQRTimbrado")
    @WebResult(name = "RespuestaObtenerQRTimbrado", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
    public RespuestaObtenerQRTimbrado obtenerQRTimbrado(
        @WebParam(name = "SolicitudObtenerQRTimbrado", targetNamespace = "http://Ecodex.WS.Model/2011/CFDI", partName = "parameters")
        SolicitudObtenerQRTimbrado parameters)
        throws TimbradoObtenerQRTimbradoFallaServicioFaultFaultMessage, TimbradoObtenerQRTimbradoFallaSesionFaultFaultMessage, TimbradoObtenerQRTimbradoFallaValidacionFaultFaultMessage
    ;

}
