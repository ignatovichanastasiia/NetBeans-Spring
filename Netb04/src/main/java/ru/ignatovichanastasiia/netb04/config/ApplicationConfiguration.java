/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.ignatovichanastasiia.netb04.domein.Cat;
import ru.ignatovichanastasiia.netb04.domein.Dog;
import ru.ignatovichanastasiia.netb04.domein.Person;
import ru.ignatovichanastasiia.netb04.domein.intf.Petable;
import ru.ignatovichanastasiia.netb04.domein.intf.Sayzable;

/**
 *
 * @author ignatovichanastasiia
 */

@Configuration
public class ApplicationConfiguration {
    
    @Bean(name="SomeoneSay")
    public Sayzable someone(){ 
        return new Cat();
    }
    
    @Bean(name = "Pet")
    public Petable somePet(){
        return new Dog();
    }
    
    @Bean(name = "Person")
    public Person somePerson(){
        return new Person();
    }
}
