package org.bianqi.note.pojo;

import java.io.Serializable;

public class Share implements Serializable{
    private Integer shareId;

    private String shareNote;

    private String shareUser;

    private byte[] shareContent;

    public Integer getShareId() {
        return shareId;
    }

    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    public String getShareNote() {
        return shareNote;
    }

    public void setShareNote(String shareNote) {
        this.shareNote = shareNote == null ? null : shareNote.trim();
    }

    public String getShareUser() {
        return shareUser;
    }

    public void setShareUser(String shareUser) {
        this.shareUser = shareUser == null ? null : shareUser.trim();
    }

    public byte[] getShareContent() {
        return shareContent;
    }

    public void setShareContent(byte[] shareContent) {
        this.shareContent = shareContent;
    }
}