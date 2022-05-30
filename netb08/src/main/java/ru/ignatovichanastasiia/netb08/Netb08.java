/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ru.ignatovichanastasiia.netb08;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ignatovichanastasiia.netb08.domain.Cat;

/**
 *
 * @author ignatovichanastasiia
 */
public class Netb08 {

    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("newSpringXMLConfig.xml")){
            Cat cat = context.getBean(Cat.class, "cat");
            cat.say();
        }
    }
}
