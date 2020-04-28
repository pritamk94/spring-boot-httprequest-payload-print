package com.spring.main.util;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import javax.servlet.http.HttpServletRequest;

@Component
public class CustomRequestPrintLogger extends CommonsRequestLoggingFilter {

    public CustomRequestPrintLogger(){
        super.setIncludeClientInfo(true); // Add if required client info
        super.setIncludeQueryString(true); //Add if required query string
        super.setIncludePayload(true); // Set to true for printing the payload
        super.setMaxPayloadLength(10000); // Increase the size as per your requirement to print entire payload
    }
    @Override
    protected boolean shouldLog(HttpServletRequest request) {
        return true; //Should be true for printing the logs
    }

    @Override
    protected void afterRequest(HttpServletRequest request, String message) {
        System.out.println(message); //Use your logger to print the request
    }

}
