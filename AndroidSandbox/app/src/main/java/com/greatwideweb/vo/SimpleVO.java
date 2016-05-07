package com.greatwideweb.vo;

/**
 * Created by Dave on 5/7/2016.
 */
public class SimpleVO {

    private final String title;
    private final String description;
    private final String url;
    private final String details;

    public SimpleVO(String title, String description) {
        this.title = title;
        this.description = description;
        this.url = null;
        this.details = null;
    }

    public  SimpleVO(String title, String description, String url, String details) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getDetails() {
        return details;
    }
}
