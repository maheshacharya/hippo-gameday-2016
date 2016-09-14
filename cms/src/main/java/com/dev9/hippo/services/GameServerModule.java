package com.dev9.hippo.services;

import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.onehippo.repository.jaxrs.RepositoryJaxrsEndpoint;
import org.onehippo.repository.jaxrs.RepositoryJaxrsService;
import org.onehippo.repository.modules.DaemonModule;

public class GameServerModule implements DaemonModule {

    @Override
    public void initialize(final Session session) throws RepositoryException {
        RepositoryJaxrsService.addEndpoint(
                new RepositoryJaxrsEndpoint("/server").singleton(new  ServerResource()));
    }

    @Override
    public void shutdown() {
        RepositoryJaxrsService.removeEndpoint("/server");
    }


}