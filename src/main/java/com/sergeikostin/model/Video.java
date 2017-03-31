package com.sergeikostin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String artistName;
    private String videoName;
    private long numOfViews;
    private String imageUrl;

    public Video(){}

    public Video(String artistName, String videoName, long numOfViews, String imageUrl) {
        this.artistName = artistName;
        this.videoName = videoName;
        this.numOfViews = numOfViews;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public long getNumOfViews() {
        return numOfViews;
    }

    public void setNumOfViews(long numOfViews) {
        this.numOfViews = numOfViews;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
