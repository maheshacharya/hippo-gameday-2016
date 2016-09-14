package com.dev9.hippo.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import java.util.List;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;

@HippoEssentialsGenerated(internalName = "gamedayproject:productdocument")
@Node(jcrType = "gamedayproject:productdocument")
public class ProductDocument extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "gamedayproject:title")
    public String getTitle() {
        return getProperty("gamedayproject:title");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:price")
    public Double getPrice() {
        return getProperty("gamedayproject:price");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:description")
    public HippoHtml getDescription() {
        return getHippoHtml("gamedayproject:description");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:image")
    public List<HippoGalleryImageSet> getImage() {
        return getLinkedBeans("gamedayproject:image",
                HippoGalleryImageSet.class);
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:tags")
    public String[] getTags() {
        return getProperty("gamedayproject:tags");
    }
}
