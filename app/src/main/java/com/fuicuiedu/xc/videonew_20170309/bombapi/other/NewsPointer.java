package com.fuicuiedu.xc.videonew_20170309.bombapi.other;


//        "__type":"Pointer",
//        "className":"News",
//        "objectId":新闻Id

import com.google.gson.annotations.SerializedName;

public class NewsPointer {
    @SerializedName("__type")
    private String type;
    private String className;
    private String objectId;

    public NewsPointer(String newsId) {
        type = "Pointer";
        className = "News";
        this.objectId = newsId;
    }
}
