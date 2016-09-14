package com.dev9.hippo.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;

@HippoEssentialsGenerated(internalName = "gamedayproject:htmldocument")
@Node(jcrType = "gamedayproject:htmldocument")
public class HtmlDocument extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "gamedayproject:html")
    public String getHtml() {
        return getProperty("gamedayproject:html");
    }
}
