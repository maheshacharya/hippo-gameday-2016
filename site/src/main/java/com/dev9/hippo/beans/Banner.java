package com.dev9.hippo.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import com.dev9.hippo.beans.Featured;
import com.dev9.hippo.beans.GamedayImageset;

@HippoEssentialsGenerated(internalName = "gamedayproject:bannerdocument")
@Node(jcrType = "gamedayproject:bannerdocument")
public class Banner extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "gamedayproject:title")
    public String getTitle() {
        return getProperty("gamedayproject:title");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:content")
    public HippoHtml getContent() {
        return getHippoHtml("gamedayproject:content");
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:link")
    public HippoBean getLink() {
        return getLinkedBean("gamedayproject:link", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:image")
    public GamedayImageset getImage() {
        return getLinkedBean("gamedayproject:image", GamedayImageset.class);
    }
}
