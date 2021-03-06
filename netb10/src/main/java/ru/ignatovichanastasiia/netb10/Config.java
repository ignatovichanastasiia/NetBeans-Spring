/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author ignatovichanastasiia
 */
@Configuration
@PropertySource("classpath:bean_properties.properties")
public class Config {
    
    @Bean
    @Scope("singleton")
    @Value("${cat.name}")
    public Cat beanCat(String name){
        Cat cat = new Cat();
        cat.setName(name);
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
