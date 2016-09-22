package com.dev9.hippo.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import com.dev9.hippo.beans.Featured;
import com.dev9.hippo.beans.GamedayImageset;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onehippo.cms7.essentials.components.rest.adapters.HippoHtmlAdapter;

@XmlRootElement(name = "rosterdocument")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "gamedayproject:rosterdocument")
@Node(jcrType = "gamedayproject:rosterdocument")
public class RosterDocument extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:name")
    public String getName() {
        return getProperty("gamedayproject:name");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:number")
    public Long getNumber() {
        return getProperty("gamedayproject:number");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:position")
    public String getPosition() {
        return getProperty("gamedayproject:position");
    }

    @XmlJavaTypeAdapter(HippoHtmlAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:description")
    public HippoHtml getDescription() {
        return getHippoHtml("gamedayproject:description");
    }

    public List<HippoGalleryImageSet> getImage() {
        return getLinkedBeans("gamedayproject:image",
                HippoGalleryImageSet.class);
    }
}
