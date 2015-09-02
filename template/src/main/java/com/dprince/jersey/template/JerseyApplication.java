package com.dprince.jersey.template;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class JerseyApplication extends ResourceConfig {
    public JerseyApplication() {
    	System.out.println("Launching JErsey Application");
        packages(" com.dprince.jersey.template.endpoints");
    }
}