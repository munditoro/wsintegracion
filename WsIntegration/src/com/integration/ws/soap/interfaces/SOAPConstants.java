package com.integration.ws.soap.interfaces;

import javax.xml.namespace.QName;

import com.integration.ws.soap.SOAP11Constants;
import com.integration.ws.soap.SOAP12Constants;

import java.io.Serializable;

public interface SOAPConstants extends Serializable{

	/**
     * SOAP 1.1 constants - thread-safe and shared 
     */ 
    public SOAP11Constants SOAP11_CONSTANTS = new SOAP11Constants(); 
    /**
     * SOAP 1.2 constants - thread-safe and shared 
     */ 
    public SOAP12Constants SOAP12_CONSTANTS = new SOAP12Constants(); 
 
    /**
     * Obtain the envelope namespace for this version of SOAP 
     */ 
    public String getEnvelopeURI(); 
 
    /**
     * Obtain the QName for the Header element 
     */ 
    public QName getHeaderQName(); 
 
    /**
     * Obtain the QName for the Body element 
     */ 
    public QName getBodyQName(); 
 
    /**
     * Obtain the QName for the role attribute (actor/role) 
     */ 
    public QName getRoleAttributeQName(); 
 
    /**
     * Obtain the "next" role/actor URI 
     */ 
    public String getNextRoleURI(); 
 
    /**
     * Obtain the "next" role/actor URI 
     */ 
    public String getMustUnderstand();
}
