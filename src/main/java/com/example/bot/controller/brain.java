package com.example.bot.controller;

public class brain {
    apiresp resp;
    public apiresp getData(){
        resp=new apiresp();
        resp.setData("This is dummy data");
        resp.setExists("true");
        resp.setStatuscode("200");
        return resp;
    }
}
