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
@Component("system3")
public class ThirdSystem {
    private Planet planet;
    
    public ThirdSystem(@Autowired @Qualifier("jupiter") Planet planet){
        System.out.println("System3 is created");
        this.planet = planet;
        
    }

    public Planet getPlanet() {
        return planet;
    }

    @Override
    public String toString() {
        return "ThirdSystem{" + "planet with speed=" + planet.getSpeed() + '}';
    }
    
    
        
}
