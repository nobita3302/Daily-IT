package com.example.mynsapilly;

public class ModelClass {
    private String title;
    private String description;
    private String publishedAt;
    private String author;
    private String url;
    private String urlToImage;


    public ModelClass(String title, String description, String publishedAt, String author, String url, String urlToImage) {
        this.title = title;
        this.description = description;
        this.publishedAt = publishedAt;
        this.author = author;
        this.url = url;
        this.urlToImage = urlToImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublished_at(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }
}
