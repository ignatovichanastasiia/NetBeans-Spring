/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ru.ignatovichanastasiia.netb08;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ignatovichanastasiia.netb08.domain.Cat;
import ru.ignatovichanastasiia.netb08.domain.FirstSystem;
import ru.ignatovichanastasiia.netb08.domain.Planet;
import ru.ignatovichanastasiia.netb08.domain.SecondSystem;
import ru.ignatovichanastasiia.netb08.domain.ThirdSystem;

/**
 *
 * @author ignatovichanastasiia
 */
public class Netb08 {

    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("newSpringXMLConfig.xml")){
            Cat cat = context.getBean(Cat.class, "cat");
            cat.say();
            cat.getBow().see();
            
            Planet pl1 = context.getBean("jupiter", Planet.class);
            System.out.println("Jupiter speed is "+pl1.getSpeed());
            Planet pl2 = context.getBean("venus", Planet.class);
            System.out.println("Venus speed is "+pl2.getSpeed());
            Planet pl3 = context.getBean("mercury", Planet.class);
            System.out.println("Mercury speed is "+pl3.getSpeed());           
            FirstSystem system1 = context.getBean(FirstSystem.class, "system1");
            System.out.println(system1.toString());
            SecondSystem system2 = context.getBean(SecondSystem.class, "system2");
            System.out.println(system2.toString());
            ThirdSystem system3 = context.getBean(ThirdSystem.class, "system3");
            System.out.println(system3.toString());
            
            
        }
    }
}
