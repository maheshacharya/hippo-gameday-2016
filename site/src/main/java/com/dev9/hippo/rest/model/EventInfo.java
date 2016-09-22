package com.dev9.hippo.rest.model;

import com.dev9.hippo.beans.EventsDocument;



import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class EventInfo implements Serializable {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
    private SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");

    private String title;
    private String startDate;
    private String endDate;
    private String startTime;
    private String endTime;
    private List<String> speakers = new ArrayList();
    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @param doc
     */
    public EventInfo(EventsDocument doc) {
        title = doc.getTitle();
        startDate = dateFormat.format(doc.getDate());
        startTime = timeFormat.format(doc.getDate().getTime());
        endDate = dateFormat.format(doc.getEndDate().getTime());
        endTime = timeFormat.format(doc.getEndDate().getTime());


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    public List<String> getSpeakers() {
        return speakers;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


}
