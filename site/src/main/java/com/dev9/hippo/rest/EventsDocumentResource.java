/*
 * Copyright 2014 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dev9.hippo.rest;

import com.dev9.hippo.beans.EventsDocument;
import com.dev9.hippo.beans.PageableEventDocument;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.onehippo.cms7.essentials.components.paging.Pageable;
import org.onehippo.cms7.essentials.components.rest.BaseRestResource;
import org.onehippo.cms7.essentials.components.rest.ctx.DefaultRestContext;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * @version "$Id$"
 */

@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_FORM_URLENCODED})
@Path("/EventsDocument/")
@Api(value = "/EventsDocument", description = "EventDocument REST Operations")
public class EventsDocumentResource extends BaseRestResource {


    @GET
    @Path("/")
    @ApiOperation(value = "Get all EventDocument beans.", response = PageableEventDocument.class)
    public Pageable<EventsDocument> index(@Context HttpServletRequest request) {
        return findBeans(new DefaultRestContext(this, request), EventsDocument.class);
    }


    @GET
    @Path("/page/{page}")
    @ApiOperation(value = "Get page of EventDocument beans.", response = PageableEventDocument.class)
    public Pageable<EventsDocument> page(@Context HttpServletRequest request, @PathParam("page") int page) {
        return findBeans(new DefaultRestContext(this, request, page, DefaultRestContext.PAGE_SIZE), EventsDocument.class);
    }


    @GET
    @Path("/page/{page}/{pageSize}")
    @ApiOperation(value = "Get page of EventDocument beans with specified page size.", response = PageableEventDocument.class)
    public Pageable<EventsDocument> pageForSize(@Context HttpServletRequest request, @PathParam("page") int page, @PathParam("pageSize") int pageSize) {
        return findBeans(new DefaultRestContext(this, request, page, pageSize), EventsDocument.class);
    }


}
