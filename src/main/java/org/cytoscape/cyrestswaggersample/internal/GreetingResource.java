package org.cytoscape.cyrestswaggersample.internal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;

@Api
@Path("/swaggergreeting")
public interface GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public SimpleMessage greeting();
}