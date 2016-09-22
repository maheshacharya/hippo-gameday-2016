package com.dev9.hippo.beans;


import org.onehippo.cms7.essentials.components.paging.DefaultPagination;

import java.util.List;

/**
 * Used for ApiDocumentation - Swagger has difficulty with generics
 */
public class PageableEventDocument extends DefaultPagination<EventsDocument> {
    public PageableEventDocument(List<EventsDocument> items) {
        super(items);
    }
}
