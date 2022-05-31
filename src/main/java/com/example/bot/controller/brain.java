package com.example.bot.controller;

import java.util.ArrayList;

import com.example.bot.model.Data;

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
        resp.setExists("true");
        resp.setStatuscode("200");
        Data data=new Data();
        data.setMaturityDate("31/12/2020");
        data.setNpiNumber("0987658767");
        data.setSsnNumber("347-3274132");
        data.setUserName("Mr. Dummy");
        resp.data=data;
        return resp;
        }
    }
    resp=new apiresp();
        resp.setExists("false");
        resp.setStatuscode("404");
        return resp;

    
}
}
