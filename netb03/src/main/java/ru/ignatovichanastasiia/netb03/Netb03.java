/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ru.ignatovichanastasiia.netb03;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ignatovichanastasiia.netb03.domain.Sayzable;

/**
 *
 * @author ignatovichanastasiia
 */
public class Netb03 {

    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringXMLConfig.xml")){
        Sayzable pet = context.getBean("pet",Sayzable.class);
        pet.say();

        }
    }
}
