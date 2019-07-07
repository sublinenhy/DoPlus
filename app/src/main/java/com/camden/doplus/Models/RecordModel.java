package com.camden.doplus.Models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class RecordModel {
    private String title;
    private int type;
    private String uuid;
    private String tag;
    private String notebook;
    private String createTime;
    private String imageUrl;
    private String content;

    public RecordModel(int type) {

        this.type = type;

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date curDate = new Date(System.currentTimeMillis());//获取当前时间
        createTime  = formatter.format(curDate);

        uuid = UUID.randomUUID().toString();

    }

    public String getTitle() {
        return title;
    }

    public int getType() {
        return type;
    }

    public String getUuid() {
        return uuid;
    }

    public String getTag() {
        return tag;
    }

    public String getNotebook() {
        return notebook;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(int type) {
        this.type = type;
    }


    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setNotebook(String notebook) {
        this.notebook = notebook;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
