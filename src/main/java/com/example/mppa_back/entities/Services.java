package com.example.mppa_back.entities;

import javax.persistence.*;

@Entity
@Table(name = "services")
public class Services {

    @Id
    @Column
    private int servicesPK;

    @Column
    private String name;

    @Column
    private String cost;

    public int getServicesPK() {
        return servicesPK;
    }

    public void setServicesPK(int servicesPK) {
        this.servicesPK = servicesPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
