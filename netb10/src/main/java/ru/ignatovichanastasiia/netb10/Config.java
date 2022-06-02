/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author ignatovichanastasiia
 */
@Configuration
public class Config {
    
    @Bean
    @Scope("singleton")
    public Cat beanCat(){
        Cat cat = new Cat();
        cat.setName("Clara");
        return cat;
    }
    
    @Bean
    public Milk beanMilk(){
        return new Milk();
    }
    
    @Bean
    public Plate beanPlate(){
        Plate plate = new Plate();
        plate.setMilk(beanMilk());
        return plate;
    }
    
}
