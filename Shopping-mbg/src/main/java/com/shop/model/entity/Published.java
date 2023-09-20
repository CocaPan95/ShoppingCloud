package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class Published implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private String Version;

    private String Name;

    private String Content;

    private Integer Retries;

    private LocalDateTime Added;

    private LocalDateTime ExpiresAt;

    private String StatusName;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public Integer getRetries() {
        return Retries;
    }

    public void setRetries(Integer Retries) {
        this.Retries = Retries;
    }

    public LocalDateTime getAdded() {
        return Added;
    }

    public void setAdded(LocalDateTime Added) {
        this.Added = Added;
    }

    public LocalDateTime getExpiresAt() {
        return ExpiresAt;
    }

    public void setExpiresAt(LocalDateTime ExpiresAt) {
        this.ExpiresAt = ExpiresAt;
    }

    public String getStatusName() {
        return StatusName;
    }

    public void setStatusName(String StatusName) {
        this.StatusName = StatusName;
    }

    @Override
    public String toString() {
        return "Published{" +
        "Id=" + Id +
        ", Version=" + Version +
        ", Name=" + Name +
        ", Content=" + Content +
        ", Retries=" + Retries +
        ", Added=" + Added +
        ", ExpiresAt=" + ExpiresAt +
        ", StatusName=" + StatusName +
        "}";
    }
}
