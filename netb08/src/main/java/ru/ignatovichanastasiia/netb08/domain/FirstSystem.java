/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb08.domain;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

/**
 *
 * @author ignatovichanastasiia
 */

@Component("system1")
public class FirstSystem {
    @Autowired
    @Qualifier("venus")
    private Planet planet;
       
    
    public FirstSystem() {
        System.out.println("System1 is created");
    }

    @Override
    public String toString() {
        return "FirstSystem{" + "planet with speed=" + planet.getSpeed() + '}';
    }
    
    
    
}
