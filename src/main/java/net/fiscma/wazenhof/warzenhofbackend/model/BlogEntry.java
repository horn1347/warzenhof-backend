package net.fiscma.wazenhof.warzenhofbackend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "BLOGENTRY")

public class BlogEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    @Column(name = "CONTENT")
    private String content;
    @Basic
    @Column(name = "CREATED")
    private Date created;
    @Basic
    @Column(name = "UPDATED")
    private Date updated;

    @Basic
    @Column(name = "title")
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
