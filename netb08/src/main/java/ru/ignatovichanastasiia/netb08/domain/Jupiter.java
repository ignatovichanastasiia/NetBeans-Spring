/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb08.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author ignatovichanastasiia
 */
@Component("jupiter")
@Scope("prototype")
public class Jupiter implements Planet{
    @Value("45300")
    private double speed;

    public Jupiter() {
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
        System.out.println("Jupiter init method");
    }
    
    @PreDestroy    
    public void destroy(){
        System.out.println("Jupiter destroy method"); //Jupiter is prototype, so this method don't work.
    }
    
    
    
}
