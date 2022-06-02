/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ru.ignatovichanastasiia.netb09;

import ru.ignatovichanastasiia.netb09.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ignatovichanastasiia.netb09.domain.Family;
import ru.ignatovichanastasiia.netb09.domain.Father;
import ru.ignatovichanastasiia.netb09.domain.Mother;
import ru.ignatovichanastasiia.netb09.domain.Parent;
import ru.ignatovichanastasiia.netb09.domain.Son;

/**
 *
 * @author ignatovichanastasiia
 */
public class Netb09 {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)){
            Family family = context.getBean("family", Family.class);
            System.out.println(family.toString());
            Parent father = context.getBean("father", Father.class);
            father.getChild().comeToParent();
            System.out.println(father.toString());
            Mother mother = context.getBean("mother", Mother.class);
            mother.getChild().comeToParent();
            System.out.println(mother.toString());
            Son son = context.getBean("son", Son.class);
            son.comeToParent();
            
            
            
        }
    }
}
