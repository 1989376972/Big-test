package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class artical {
    @SerializedName("shareUser")
    String uersername;
    @SerializedName("title")
    String title;
    @SerializedName("niceDate")
    String nicedata;



    public void setUersername(String uersername) {
        this.uersername = uersername;
    }

    public String getUersername() {
        return uersername;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setNicedata(String nicedata) {
        this.nicedata = nicedata;
    }

    public String getNicedata() {
        return nicedata;
    }
}
