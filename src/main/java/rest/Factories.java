/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import model.DataFactory;

/**
 *
 * @author josephawwal
 * 
 * 
 */

@Path("factories")
public class Factories {
    
    @Context
    private UriInfo context;
    
    public Factories(){
        
        
    }
    
    @GET
    @Produces("application/json")
    @Path("/members")
    public String getJson(){
        
        DataFactory f = new DataFactory();
        return f.getMembersAsJson();
    }
    
    @PUT
    @Consumes("application/json")
    public void putJson(String content){
        
    }
}
