package com.example.newsaggregator;

public class Articles {
    private String title;
    private String Description;
    private String urlToImage;
    private String url;
    private String content;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public Articles(String title, String description, String urlToImage, String url, String content) {
        this.title = title;
        Description = description;
        this.urlToImage = urlToImage;
        this.url = url;
        this.content = content;
    }

}
