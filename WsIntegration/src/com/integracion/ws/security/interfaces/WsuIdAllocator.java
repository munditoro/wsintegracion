package com.integracion.ws.security.interfaces;

public interface WsuIdAllocator {

	String createId(String prefix, Object o); 
    
    String createSecureId(String prefix, Object o);
}
