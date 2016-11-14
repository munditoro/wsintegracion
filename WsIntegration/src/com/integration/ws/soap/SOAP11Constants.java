package com.integration.ws.soap;

import javax.xml.namespace.QName;

import com.integracion.ws.security.SecConstants;
import com.integration.ws.soap.interfaces.SOAPConstants;

public class SOAP11Constants implements SOAPConstants{

	/**
     *  
     */ 
    private static final long serialVersionUID = 3809268485386395322L; 
    private static QName headerQName = new QName(SecConstants.URI_SOAP11_ENV, SecConstants.ELEM_HEADER); 
    private static QName bodyQName   = new QName(SecConstants.URI_SOAP11_ENV, SecConstants.ELEM_BODY); 
    private static QName roleQName   = new QName(SecConstants.URI_SOAP11_ENV, SecConstants.ATTR_ACTOR); 
 
    public String getEnvelopeURI() { 
        return SecConstants.URI_SOAP11_ENV; 
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
        return SecConstants.URI_SOAP11_NEXT_ACTOR; 
    } 
 
    /**
     * Obtain the MustUnderstand string 
     */ 
    public String getMustUnderstand() { 
        return "1"; 
    } 
}
