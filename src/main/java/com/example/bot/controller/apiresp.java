package com.example.bot.controller;
public class apiresp {
    private String statuscode;
    private String exists;
    private String data;
    public String getStatuscode() {
        return statuscode;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
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
