package org.bianqi.note.pojo;

import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable{
    private Long nId;

    private String nName;

    private Date nCreated;

    private Integer nStatus;

    private String nContent;

    private Long notebookId;

    private String nTitle;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName == null ? null : nName.trim();
    }

    public Date getnCreated() {
        return nCreated;
    }

    public void setnCreated(Date nCreated) {
        this.nCreated = nCreated;
    }

    public Integer getnStatus() {
        return nStatus;
    }

    public void setnStatus(Integer nStatus) {
        this.nStatus = nStatus;
    }

    public String getnContent() {
        return nContent;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent == null ? null : nContent.trim();
    }

    public Long getNotebookId() {
        return notebookId;
    }

    public void setNotebookId(Long notebookId) {
        this.notebookId = notebookId;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle == null ? null : nTitle.trim();
    }
}