package org.ipn.escom.rest;

import java.time.LocalDateTime;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/holaIpn")
public class HelloWorldService {
    
    @GET
    @Path("/{name}")
    public Response saludar(@PathParam("name") String name){
        String salida = "Hola mundo con  JAX-RS " + name + " :) son las:  " + LocalDateTime.now();
        return Response.status(200).entity(salida).build();
    }
}
