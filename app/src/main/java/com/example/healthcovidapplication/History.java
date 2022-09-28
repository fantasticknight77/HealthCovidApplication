package com.example.healthcovidapplication;

import java.sql.Time;
import java.util.Date;

public class History {

    private String name, location, telephone, risk;
    private Date date;
    private Time time;

    public History(String name, String location, String telephone, String risk, Date date, Time time) {
        this.name = name;
        this.location = location;
        this.telephone = telephone;
        this.risk = risk;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
