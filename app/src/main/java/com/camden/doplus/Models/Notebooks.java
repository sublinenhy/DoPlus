package com.camden.doplus.Models;

import java.util.UUID;

public class Notebooks {

    private String notebookName;
    private String notebookCoverImg;
    private String uuid;

    public Notebooks(String notebookCoverImg) {
        this.notebookCoverImg = notebookCoverImg;
        uuid = UUID.randomUUID().toString();
    }

    public String getNotebookName() {
        return notebookName;
    }

    public String getNotebookCoverImg() {
        return notebookCoverImg;
    }

    public String getUuid() {
        return uuid;
    }

    public void setNotebookName(String notebookName) {
        this.notebookName = notebookName;
    }

    public void setNotebookCoverImg(String notebookCoverImg) {
        this.notebookCoverImg = notebookCoverImg;
    }

}
