package com.integration.ws.soap;

import java.io.InputStream;

public class SOAPResponse {

	/** The data response as a stream */ 
    private InputStream data; 
 
    /** The HTTP status code as returned by the request */ 
    private int httpStatus; 
 
    /**
     * Creates a new response 
     * 
     * @param data 
     *            The data of the response. 
     * @param httpStatus 
     *            The HTTP request code. 
     */ 
    public SOAPResponse(InputStream data, int httpStatus) { 
        this.data = data; 
        this.httpStatus = httpStatus; 
    } 
 
    /**
     * Gets the data in the response as a stream 
     * 
     * @return the data in the response as a stream 
     */ 
    public InputStream getData() { 
        return data; 
    } 
 
    /**
     * Gets the HTTP status code of the response 
     * 
     * @return The status code as an int. 
     */ 
    public int getHttpStatus() { 
        return httpStatus; 
    } 
}
