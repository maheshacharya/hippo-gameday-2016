package com.dev9.hippo.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import com.dev9.hippo.beans.Featured;
import com.dev9.hippo.beans.GamedayImageset;

@HippoEssentialsGenerated(internalName = "gamedayproject:newsdocument")
@Node(jcrType = "gamedayproject:newsdocument")
public class NewsDocument extends HippoDocument {
    /** 
     * The document type of the news document.
     */
    public final static String DOCUMENT_TYPE = "gamedayproject:newsdocument";
    private final static String TITLE = "gamedayproject:title";
    private final static String DATE = "gamedayproject:date";
    private final static String INTRODUCTION = "gamedayproject:introduction";
    private final static String IMAGE = "gamedayproject:image";
    private final static String CONTENT = "gamedayproject:content";
    private final static String LOCATION = "gamedayproject:location";
    private final static String AUTHOR = "gamedayproject:author";
    private final static String SOURCE = "gamedayproject:source";

    /** 
     * Get the title of the document.
     * @return the title
     */
    @HippoEssentialsGenerated(internalName = "gamedayproject:title")
    public String getTitle() {
        return getProperty(TITLE);
    }

    /** 
     * Get the date of the document.
     * @return the date
     */
    @HippoEssentialsGenerated(internalName = "gamedayproject:date")
    public Calendar getDate() {
        return getProperty(DATE);
    }

    /** 
     * Get the introduction of the document.
     * @return the introduction
     */
    @HippoEssentialsGenerated(internalName = "gamedayproject:introduction")
    public String getIntroduction() {
        return getProperty(INTRODUCTION);
    }

    /** 
     * Get the main content of the document.
     * @return the content
     */
    @HippoEssentialsGenerated(internalName = "gamedayproject:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    /** 
     * Get the location of the document.
     * @return the location
     */
    @HippoEssentialsGenerated(internalName = "gamedayproject:location")
    public String getLocation() {
        return getProperty(LOCATION);
    }

    /** 
     * Get the author of the document.
     * @return the author
     */
    @HippoEssentialsGenerated(internalName = "gamedayproject:author")
    public String getAuthor() {
        return getProperty(AUTHOR);
    }

    /** 
     * Get the source of the document.
     * @return the source
     */
    @HippoEssentialsGenerated(internalName = "gamedayproject:source")
    public String getSource() {
        return getProperty(SOURCE);
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:image")
    public GamedayImageset getImage() {
        return getLinkedBean("gamedayproject:image", GamedayImageset.class);
    }
}
