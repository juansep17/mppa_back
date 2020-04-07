package com.example.mppa_back.entities;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {

    @Id
    @Column
    private int rolesPK;

    @Column
    private String rol;

    public int getRolesPK() {
        return rolesPK;
    }

    public void setRolesPK(int rolesPK) {
        this.rolesPK = rolesPK;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}