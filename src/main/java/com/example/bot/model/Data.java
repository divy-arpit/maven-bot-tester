package com.example.bot.model;

public class Data {
    private String userName;
    private String maturityDate;
    private String npiNumber;
    private String ssnNumber;
    
    public String getUserName() {
        return userName;
    }
    public String getSsnNumber() {
        return ssnNumber;
    }
    public void setSsnNumber(String ssnNumber) {
        this.ssnNumber = ssnNumber;
    }
    public String getNpiNumber() {
        return npiNumber;
    }
    public void setNpiNumber(String npiNumber) {
        this.npiNumber = npiNumber;
    }
    public String getMaturityDate() {
        return maturityDate;
    }
    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
