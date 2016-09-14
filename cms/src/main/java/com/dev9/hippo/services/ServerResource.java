package com.dev9.hippo.services;


import org.hippoecm.frontend.session.UserSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.Session;
import javax.ws.rs.*;
import java.io.File;


/**
 * Created by maheshacharya on 7/26/16.
 */
public class ServerResource {
    private static Logger logger = LoggerFactory.getLogger(ServerResource.class);

    private Session getSession() {
        return UserSession.get().getJcrSession();
    }


    @Path("/createVirtualHostGroup")
    @GET
    public String createVirtualHostgroup() {


        return "OK";
    }


}