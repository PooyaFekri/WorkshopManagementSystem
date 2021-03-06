package com.project.workshopmanagment.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class ContactPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Data cannot be empty")
    private String data;

    @NotBlank(message = "Type cannot be empty")
    private String type;

    @NotNull(message = "User cannot be empty")
    @ManyToOne
    @JoinColumn(name = "user_id", updatable = false)
    private User user;

    public ContactPoint() {
    }

    public ContactPoint(Long id, String data, String type, User user) {
        this.id = id;
        this.data = data;
        this.type = type;
        this.user = user;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
