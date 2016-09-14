package com.dev9.hippo.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "gamedayproject:gamedayImageset")
@Node(jcrType = "gamedayproject:gamedayImageset")
public class GamedayImageset extends HippoGalleryImageSet {
    @HippoEssentialsGenerated(internalName = "gamedayproject:featured")
    public HippoGalleryImageBean getFeatured() {
        return getBean("gamedayproject:featured", HippoGalleryImageBean.class);
    }
}
