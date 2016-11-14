package com.integracion.ws.security.interfaces;

import java.util.List; 
import org.w3c.dom.Element; 

public interface CallbackLookup {

	/**
     * Get the DOM element that corresponds to the given id and ValueType reference. The Id can  
     * be a wsu:Id or else an Id attribute, or a SAML Id when the ValueType refers to a SAML 
     * Assertion. 
     * @param id The id of the element to locate 
     * @param valueType The ValueType attribute of the element to locate (can be null) 
     * @param checkMultipleElements If true then go through the entire tree and return  
     *        null if there are multiple elements with the same Id 
     * @return the located element 
     * @throws WSSecurityException 
     */ 
    public Element getElement(String id, String valueType, boolean checkMultipleElements) throws Exception; 
     
    /**
     * Get the DOM element(s) that correspond to the given localname/namespace.  
     * @param localname The localname of the Element(s) 
     * @param namespace The namespace of the Element(s) 
     * @return the located element(s) 
     * @throws WSSecurityException 
     */ 
    public List<Element> getElements(String localname, String namespace) throws Exception; 
}
