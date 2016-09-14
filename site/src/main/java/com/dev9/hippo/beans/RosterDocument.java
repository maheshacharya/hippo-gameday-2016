package com.dev9.hippo.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import com.dev9.hippo.beans.Featured;
import com.dev9.hippo.beans.GamedayImageset;

@HippoEssentialsGenerated(internalName = "gamedayproject:rosterdocument")
@Node(jcrType = "gamedayproject:rosterdocument")
public class RosterDocument extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "gamedayproject:name")
    public String getName() {
        return getProperty("gamedayproject:name");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:number")
    public Long getNumber() {
        return getProperty("gamedayproject:number");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:position")
    public String getPosition() {
        return getProperty("gamedayproject:position");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:description")
    public HippoHtml getDescription() {
        return getHippoHtml("gamedayproject:description");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:image")
    public GamedayImageset getImage() {
        return getLinkedBean("gamedayproject:image", GamedayImageset.class);
    }
}
