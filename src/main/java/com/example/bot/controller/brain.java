package com.example.bot.controller;

import java.util.ArrayList;

public class brain {
    apiresp resp;
    ArrayList<String> list;
    brain(){
    list=new ArrayList<>();
    list.add("1234567890");
    list.add("9876543210");
    list.add("0987654321");

    }
    public apiresp getData(String id){

        for(String s:list){
        if(id.equals(s)){
        resp=new apiresp();
        resp.setData("This is dummy data");
        resp.setExists("true");
        resp.setStatuscode("200");
        return resp;
        }
    }
    resp=new apiresp();
        resp.setData("Data is not available");
        resp.setExists("false");
        resp.setStatuscode("404");
        return resp;

    
}
}
