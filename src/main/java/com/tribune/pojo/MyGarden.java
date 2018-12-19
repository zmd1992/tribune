package com.tribune.pojo;

import java.util.Date;

public class MyGarden {
    private Integer id;
    private String content;
    private Date createdAt;
    private int createdPersonId;

    public MyGarden() {
    }

    public MyGarden(Integer id, String content, Date createdAt, int createdPersonId) {
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
        this.createdPersonId = createdPersonId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String conent) {
        this.content = conent;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getCreatedPersonId() {
        return createdPersonId;
    }

    public void setCreatedPersonId(int createdPersonId) {
        this.createdPersonId = createdPersonId;
    }

    @Override
    public String toString() {
        return "MyGarden{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", createdPersonId='" + createdPersonId + '\'' +
                '}';
    }
}
