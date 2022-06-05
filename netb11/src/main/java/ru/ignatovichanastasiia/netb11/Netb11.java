/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ru.ignatovichanastasiia.netb11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ignatovichanastasiia.netb11.domain.Library;


/**
 *
 * @author ignatovichanastasiia
 */
public class Netb11 {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)){
            Library library = context.getBean("beanLibrary", Library.class);
            library.getBook();
            
            
        }
        
    }
}
