package com.integration.ws.soap;

import javax.xml.namespace.QName;

import com.integracion.ws.security.SecConstants;
import com.integration.ws.soap.interfaces.SOAPConstants;


public class SOAP12Constants implements SOAPConstants{

	/**
     *  
     */ 
    private static final long serialVersionUID = 3784866613259361834L; 
    private static QName headerQName = new QName(SecConstants.URI_SOAP12_ENV, SecConstants.ELEM_HEADER); 
    private static QName bodyQName   = new QName(SecConstants.URI_SOAP12_ENV, SecConstants.ELEM_BODY); 
    private static QName roleQName   = new QName(SecConstants.URI_SOAP12_ENV, SecConstants.ATTR_ROLE); 
     
    // Public constants for SOAP 1.2 
     
    /**
     * MessageContext property name for webmethod 
     */ 
    public static final String PROP_WEBMETHOD = "soap12.webmethod"; 
 
    public String getEnvelopeURI() { 
        return SecConstants.URI_SOAP12_ENV; 
    } 
 
    public QName getHeaderQName() { 
        return headerQName; 
    } 
 
    public QName getBodyQName() { 
        return bodyQName; 
    } 
 
    /**
     * Obtain the QName for the role attribute (actor/role) 
     */ 
    public QName getRoleAttributeQName() { 
        return roleQName; 
    } 
 
    /**
     * Obtain the "next" role/actor URI 
     */ 
    public String getNextRoleURI() { 
        return SecConstants.URI_SOAP12_NEXT_ROLE; 
    } 
 
    /**
     * Obtain the MustUnderstand string 
     */ 
    public String getMustUnderstand() { 
        return "true"; 
    } 
}
