package com.integracion.ws.security;

import java.util.List; 

import javax.xml.namespace.QName; 
import org.w3c.dom.Element; 
import org.w3c.dom.Node;

public class SecDataRef {

	/**
     * wsu:Id of the protected element 
     */ 
    private String wsuId; 
     
    /**
     * QName of the protected element 
     */ 
    private QName name; 
     
    /**
     * An xpath expression pointing to the data element 
     */ 
    private String xpath; 
     
    /**
     * Algorithm used to encrypt/sign the element 
     */ 
    private String algorithm; 
     
    /**
     * A list of algorithms used to transform the element before digest 
     */ 
    private List<String> transformAlgorithms; 
     
    /**
     * If this reference represents signed content, this field 
     * represents the digest algorithm applied to the content. 
     */ 
    private String digestAlgorithm; 
     
    private boolean content; 
     
    /**
     * The protected DOM node 
     */ 
    private Node protectedNode; 
 
    /**
     * @return Id of the protected element 
     */ 
    public String getWsuId() { 
        return wsuId; 
    } 
 
    /**
     * @param wsuId Id of the protected element 
     */ 
    public void setWsuId(String wsuId) { 
        this.wsuId = wsuId; 
    } 
 
    /**
     * @return QName of the protected element 
     */ 
    public QName getName() { 
        return name; 
    } 
 
    /**
     * @param name QName of the protected element 
     */ 
    public void setName(QName name) { 
        this.name = name; 
    } 
     
    /**
     * @param element The protected DOM node to set 
     */ 
    public void setProtectedNode(Node node) { 
      
        protectedNode = node; 
        if (protectedNode.getNodeType() == Node.TEXT_NODE) return; 
         
        Element elem = (Element)node; 
         
        String prefix = elem.getPrefix(); 
        if (prefix == null) { 
            name = new QName(elem.getNamespaceURI(), elem.getLocalName()); 
         
        } else { 
            name = new QName(elem.getNamespaceURI(), elem.getLocalName(), prefix); 
         
        } 
    } 
     
    /**
     * @return the protected DOM node 
     */ 
    public Node getProtectedNode() { 
        return protectedNode; 
    } 
 
    /**
     * @return the xpath 
     */ 
    public String getXpath() { 
        return xpath; 
    } 
 
    /**
     * @param xpath the xpath to set 
     */ 
    public void setXpath(String xpath) { 
        this.xpath = xpath; 
    } 
 
    /**
     * @return the content 
     */ 
    public boolean isContent() { 
        return content; 
    } 
 
    /**
     * @param content the content to set 
     */ 
    public void setContent(boolean content) { 
        this.content = content; 
    } 
     
    /**
     * @return the algorithm used for encryption/signature 
     */ 
    public String getAlgorithm() { 
        return algorithm; 
    } 
 
    /**
     * @param algo algorithm used for encryption 
     */ 
    public void setAlgorithm(String algo) { 
        algorithm = algo; 
    } 
     
    /**
     * @return if this reference represents signed content,  
     * the digest algorithm applied to the content. 
     */ 
    public String getDigestAlgorithm() { 
        return this.digestAlgorithm; 
    } 
 
    /**
     * @param digestAlgorithm if this reference represents  
     * signed content, the digest algorithm applied to the content. 
     */ 
    public void setDigestAlgorithm(String digestAlgorithm) { 
        this.digestAlgorithm = digestAlgorithm; 
    } 
     
    /**
     * Set the Transform algorithm URIs used to transform the element before digest 
     */ 
    public void setTransformAlgorithms(List<String> transformAlgorithms) { 
        this.transformAlgorithms = transformAlgorithms; 
    } 
     
    /**
     * Get the Transform algorithm URIs used to transform the element before digest 
     */ 
    public List<String> getTransformAlgorithms() { 
        return transformAlgorithms; 
    }
}
