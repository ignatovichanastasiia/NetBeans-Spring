/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ru.ignatovichanastasiia.netb10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author ignatovichanastasiia
 */
public class Netb10 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Cat cat = context.getBean("beanCat", Cat.class);
        System.out.println(cat.getName()+" say: ");
        cat.say();
        
        context.close();
    }
}
