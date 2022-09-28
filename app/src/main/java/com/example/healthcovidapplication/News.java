package com.example.healthcovidapplication;

import java.sql.Time;
import java.sql.Timestamp;

public class News {

    private int profileImageID, newsImageID;
    private String name, title;
    private Timestamp time;

    public News(int profileImageID, int newsImageID, String name, String title, Timestamp time) {
        this.profileImageID = profileImageID;
        this.newsImageID = newsImageID;
        this.name = name;
        this.title = title;
        this.time = time;
    }

    public int getProfileImageID() {
        return profileImageID;
    }

    public void setProfileImageID(int profileImageID) {
        this.profileImageID = profileImageID;
    }

    public int getNewsImageID() {
        return newsImageID;
    }

    public void setNewsImageID(int newsImageID) {
        this.newsImageID = newsImageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
