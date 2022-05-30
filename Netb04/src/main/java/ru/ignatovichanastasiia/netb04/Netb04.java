/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ru.ignatovichanastasiia.netb04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ignatovichanastasiia.netb04.config.ApplicationConfiguration;
import ru.ignatovichanastasiia.netb04.domein.Person;
import ru.ignatovichanastasiia.netb04.domein.intf.Petable;
import ru.ignatovichanastasiia.netb04.domein.intf.Sayzable;

/**
 *
 * @author ignatovichanastasiia
 */
public class Netb04 {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)){

            Sayzable someone = context.getBean("SomeoneSay", Sayzable.class);
            someone.say();
            Person artem = context.getBean("Person", Person.class);
            artem.setPet(context.getBean("Pet", Petable.class));
            artem.getPet().play();
            artem.playWithPet();
            
            
        }
        
        
        
    }
}
