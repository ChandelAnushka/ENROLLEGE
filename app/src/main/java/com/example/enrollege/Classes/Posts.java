package com.example.enrollege.Classes;


import java.util.HashMap;
import java.util.Map;

public class Posts {

    private String textViewName;
    private String textViewTime;
    private String textViewDate;
    private String textViewUserName;


    public String getTextViewName() {
        return textViewName;
    }

    public void setTextViewName(String textViewName) {
        this.textViewName = textViewName;
    }


    public String getTextViewTime() {
        return textViewTime;
    }

    public void setTextViewTime(String textViewTime) {
        this.textViewTime = textViewTime;
    }

    public String getTextViewDate() {
        return textViewDate;
    }

    public void setTextViewDate(String textViewDate) {
        this.textViewDate = textViewDate;
    }

    public String getTextViewUserName() {
        return textViewUserName;
    }

    public void setTextViewUserName(String textViewUserName) {
        this.textViewUserName = textViewUserName;
    }

    public Posts(String textViewDate, String textViewTime, String textViewName, String textViewUserName) {

        this.textViewDate = textViewDate;
        this.textViewTime = textViewTime;
        this.textViewName = textViewName;
        this.textViewUserName=textViewUserName;
    }
    public Posts()
    {

    }
}
