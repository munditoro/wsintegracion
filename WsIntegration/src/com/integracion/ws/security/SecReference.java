package com.integracion.ws.security;

import javax.xml.namespace.QName; 

import org.w3c.dom.Document; 
import org.w3c.dom.Element; 

public class SecReference {

	public static final QName TOKEN = new QName(SecConstants.WSSE_NS, "Reference"); 
    protected Element element = null; 
     
    /**
     * Constructor. 
     *  
     * @param elem The Reference element 
     * @throws Exception  
     */ 
    public SecReference(Element elem) throws Exception { 
 
     if (elem == null) throw new Exception("[Invalid Security] No reference element provided."); 
 
     element = elem; 
         
     QName el = new QName(element.getNamespaceURI(), element.getLocalName()); 
        if (!el.equals(TOKEN)) throw new Exception("[Security Failure] Invalid reference element."); 
 
        String uri = getURI(); 
 
        // Reference URI cannot be null or empty 
        if (uri == null || "".equals(uri))throw new Exception("[Invalid Security] Bad reference URI."); 
 
    } 
 
    public SecReference(Document doc) { 
        element = doc.createElementNS(SecConstants.WSSE_NS, "wsse:Reference"); 
    } 
 
    /**
     * Get the DOM element. 
     *  
     * @return the DOM element 
     */ 
    public Element getElement() { 
        return element; 
    } 
 
    /**
     * Get the ValueType attribute. 
     *  
     * @return the ValueType attribute 
     */ 
    public String getValueType() { 
        return element.getAttribute("ValueType"); 
    } 
 
    /**
     * Get the URI. 
     *  
     * @return the URI 
     */ 
    public String getURI() { 
        return element.getAttribute("URI"); 
    } 
 
    /**
     * Set the Value type. 
     *  
     * @param valueType the ValueType attribute to set 
     */ 
    public void setValueType(String valueType) { 
        element.setAttributeNS(null, "ValueType", valueType); 
    } 
 
    /**
     * Set the URI. 
     *  
     * @param uri the URI to set 
     */ 
    public void setURI(String uri) { 
        element.setAttributeNS(null, "URI", uri); 
    } 
     
    @Override 
    public int hashCode() { 
        int result = 17; 
        String uri = getURI(); 
        if (uri != null) { 
            result = 31 * result + uri.hashCode(); 
        } 
        String valueType = getValueType(); 
        if (valueType != null) { 
            result = 31 * result + valueType.hashCode(); 
        } 
        return result; 
    } 
     
    @Override 
    public boolean equals(Object object) { 
        if (!(object instanceof SecReference)) { 
            return false; 
        } 
        SecReference reference = (SecReference)object; 
        if (!compare(getURI(), reference.getURI())) { 
            return false; 
        } 
        if (!compare(getValueType(), reference.getValueType())) { 
            return false; 
        } 
        return true; 
    } 
     
    private boolean compare(String item1, String item2) { 
        if (item1 == null && item2 != null) {  
            return false; 
        } else if (item1 != null && !item1.equals(item2)) { 
            return false; 
        } 
        return true; 
    }
}
