package com.integration.ws.soap.interfaces;



import com.integration.ws.soap.SOAPMessage;
import com.integration.ws.soap.SOAPResponse;

public interface SOAPSender {

	/**
     * Performs a SOAP request 
     *  
     * @param envelope 
     *            The SOAP message to send 
     * @param targetUrl 
     *            The url of the SOAP web service to communicate with. 
     * @return An InputStream representing the 
     * @throws Exception  
     */ 
    public SOAPResponse doSoapRequest(SOAPMessage message, String targetUrl) throws Exception; 
 
    /**
     * Performs a SOAP request 
     *  
     * @param envelope 
     *            The SOAP message to send 
     * @param targetUrl 
     *            The url of the SOAP web service to communicate with. 
     * @param soapAction 
     *            The SOAP Action to perform - this is put in the 
     *            <code>SOAPAction</code> field of the outgoing HTTP post. 
     * @return An InputStream representing the 
     * @throws Exception  
     */ 
    public SOAPResponse doSoapRequest(SOAPMessage message, String targetUrl, String soapAction) throws Exception; 
 
    /**
     * Set the timeout for making connections to the server. 
     *  
     * @param timeout 
     *            Timeout time in milliseconds. 
     */ 
    public void setConnectionTimeout(int timeout); 
 
    /**
     * Set the timeout for receiving data from the server - note that this takes 
     * into account time to establish a connection, send the envelope, wait for 
     * the server to process and then recieve it. 
     *  
     * @param timeout 
     *            Timeout time in milliseconds. 
     */ 
    public void setSocketTimeout(int timeout); 
}
