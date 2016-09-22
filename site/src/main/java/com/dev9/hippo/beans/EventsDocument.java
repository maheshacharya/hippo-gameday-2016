package com.dev9.hippo.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import com.dev9.hippo.beans.Featured;
import com.dev9.hippo.beans.GamedayImageset;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onehippo.cms7.essentials.components.rest.adapters.HippoHtmlAdapter;

@XmlRootElement(name = "eventsdocument")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "gamedayproject:eventsdocument")
@Node(jcrType = "gamedayproject:eventsdocument")
public class EventsDocument extends HippoDocument {
    /** 
     * The document type of the events document.
     */
    public final static String DOCUMENT_TYPE = "gamedayproject:eventsdocument";
    private final static String TITLE = "gamedayproject:title";
    private final static String DATE = "gamedayproject:date";
    private final static String INTRODUCTION = "gamedayproject:introduction";
    private final static String IMAGE = "gamedayproject:image";
    private final static String CONTENT = "gamedayproject:content";
    private final static String LOCATION = "gamedayproject:location";
    private final static String END_DATE = "gamedayproject:enddate";

    /** 
     * Get the title of the document.
     * @return the title
     */
    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:title")
    public String getTitle() {
        return getProperty(TITLE);
    }

    /** 
     * Get the date of the document, i.e. the start date of the event.
     * @return the (start) date
     */
    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:date")
    public Calendar getDate() {
        return getProperty(DATE);
    }

    /** 
     * Get the introduction of the document.
     * @return the introduction
     */
    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:introduction")
    public String getIntroduction() {
        return getProperty(INTRODUCTION);
    }

    /** 
     * Get the main content of the document.
     * @return the content
     */
    @XmlJavaTypeAdapter(HippoHtmlAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    /** 
     * Get the location of the document.
     * @return the location
     */
    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:location")
    public String getLocation() {
        return getProperty(LOCATION);
    }

    /** 
     * Get the end date of the document, i.e. the end date of the event.
     * @return the end date
     */
    @XmlElement
    @HippoEssentialsGenerated(internalName = "gamedayproject:enddate")
    public Calendar getEndDate() {
        return getProperty(END_DATE);
    }

    @HippoEssentialsGenerated(internalName = "gamedayproject:image")
    public GamedayImageset getImage() {
        return getLinkedBean("gamedayproject:image", GamedayImageset.class);
    }
}
