package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //i need an object of class alien onl hence we use component
@Scope(value="prototype")

public class alien {
    private int aid;
    private String aname;
    private String tech;
    @Autowired//sear hes by type
    @Qualifier("lap1")// searches by name
    private laptop lap;
    public alien()
    {
        super();
        System.out.println("object created..");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
    public void show()
    {
        System.out.println("in show");
    }

    public laptop getLap() {
        return lap;
    }

    public void setLap(laptop lap) {
        this.lap = lap;
    }
}