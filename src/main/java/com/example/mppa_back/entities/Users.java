package com.example.mppa_back.entities;

import javax.persistence.*;
import com.example.mppa_back.entities.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @Column
    private int usersPK;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private Long document;

    @Column
    private String pass;

    @JoinColumn(name = "rolesFK", referencedColumnName = "rolesPK")
    @ManyToOne
    private Roles rolesFK;

    public int getUsersPK() {
        return usersPK;
    }

    public void setUsersPK(int usersPK) {
        this.usersPK = usersPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getDocument() {
        return document;
    }

    public void setDocument(Long document) {
        this.document = document;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Roles getRolesFK() {
        return rolesFK;
    }

    public void setRolesFK(Roles rolesFK) {
        this.rolesFK = rolesFK;
    }
}

