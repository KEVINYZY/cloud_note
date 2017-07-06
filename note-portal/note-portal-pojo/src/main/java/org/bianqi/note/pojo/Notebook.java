package org.bianqi.note.pojo;

import java.io.Serializable;
import java.util.Date;

public class Notebook implements Serializable{
    private Long nbId;

    private String nbName;

    private Date nbCreated;

    private Integer nbStatus;

    private String nbList;

    private String userId;

    public Long getNbId() {
        return nbId;
    }

    public void setNbId(Long nbId) {
        this.nbId = nbId;
    }

    public String getNbName() {
        return nbName;
    }

    public void setNbName(String nbName) {
        this.nbName = nbName == null ? null : nbName.trim();
    }

    public Date getNbCreated() {
        return nbCreated;
    }

    public void setNbCreated(Date nbCreated) {
        this.nbCreated = nbCreated;
    }

    public Integer getNbStatus() {
        return nbStatus;
    }

    public void setNbStatus(Integer nbStatus) {
        this.nbStatus = nbStatus;
    }

    public String getNbList() {
        return nbList;
    }

    public void setNbList(String nbList) {
        this.nbList = nbList == null ? null : nbList.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}