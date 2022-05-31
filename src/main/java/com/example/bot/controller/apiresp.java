package com.example.bot.controller;

import com.example.bot.model.Data;

public class apiresp {
    private String statuscode;
    private String exists;
    public Data data;


    public String getStatuscode() {
        return statuscode;
    }
    public String getExists() {
        return exists;
    }
    public void setExists(String exists) {
        this.exists = exists;
    }
    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }
    
}
