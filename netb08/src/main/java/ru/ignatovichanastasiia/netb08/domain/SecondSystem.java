/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb08.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author ignatovichanastasiia
 */
@Component("system2")
public class SecondSystem {
    
    private Planet planet;
       
    
    public SecondSystem() {
        System.out.println("System2 is created");
    }

    public Planet getPlanet() {
        return planet;
    }

    @Autowired
    @Qualifier("mercury")
    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    @Override
    public String toString() {
        return "SecondSystem{" + "planet with speed=" + planet.getSpeed() + '}';
    }
    
    
    
    
}
