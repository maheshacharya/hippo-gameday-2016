package com.dev9.hippo.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import java.util.List;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onehippo.cms7.essentials.components.rest.adapters.HippoHtmlAdapter;

@XmlRootElement(name = "productdocument")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "gamedayproject:productdocument")
@Node(jcrType = "gamedayproject:productdocument")
public class ProductDocument extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:title")
    public String getTitle() {
        return getProperty("gamedayproject:title");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:price")
    public Double getPrice() {
        return getProperty("gamedayproject:price");
    }

    @XmlJavaTypeAdapter(HippoHtmlAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:description")
    public HippoHtml getDescription() {
        return getHippoHtml("gamedayproject:description");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:image")
    public List<HippoGalleryImageSet> getImage() {
        return getLinkedBeans("gamedayproject:image",
                HippoGalleryImageSet.class);
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:tags")
    public String[] getTags() {
        return getProperty("gamedayproject:tags");
    }
}
