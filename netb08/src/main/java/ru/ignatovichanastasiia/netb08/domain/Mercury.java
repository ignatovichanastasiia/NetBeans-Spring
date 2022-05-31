/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb08.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author ignatovichanastasiia
 */
@Component("mercury")
public class Mercury implements Planet{
    @Value("10892")
    private double speed;

    public Mercury() {
    }

    @Override
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
        @PostConstruct
    public void init(){
        System.out.println("Mercury init method");
    }
    
    @PreDestroy    
    public void destroy(){
        System.out.println("Mercury destroy method");
    }
}
