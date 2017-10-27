package com.javahelps.jerseydemo.app;

import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author eduardo.castillo
 */
public class HelloWorldApplication extends ResourceConfig {
    
    public HelloWorldApplication(){
        packages("org.ipn.escom.rest");
    }
    
}
