package org.bianqi.note.pojo;

import java.io.Serializable;
import java.util.Date;

public class Recycle implements Serializable{
    private Integer recycleId;

    private String recycleNote;

    private Date recycleCreate;

    private String userId;

    private byte[] recycleContent;

    public Integer getRecycleId() {
        return recycleId;
    }

    public void setRecycleId(Integer recycleId) {
        this.recycleId = recycleId;
    }

    public String getRecycleNote() {
        return recycleNote;
    }

    public void setRecycleNote(String recycleNote) {
        this.recycleNote = recycleNote == null ? null : recycleNote.trim();
    }

    public Date getRecycleCreate() {
        return recycleCreate;
    }

    public void setRecycleCreate(Date recycleCreate) {
        this.recycleCreate = recycleCreate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public byte[] getRecycleContent() {
        return recycleContent;
    }

    public void setRecycleContent(byte[] recycleContent) {
        this.recycleContent = recycleContent;
    }
}