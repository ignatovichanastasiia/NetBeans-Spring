/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ru.ignatovichanastasiia.netb07;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ignatovichanastasiia.netb07.domain.Person;
import ru.ignatovichanastasiia.netb07.domain.Somebody;

/**
 *
 * @author ignatovichanastasiia
 */
public class Netb07 {

    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringXMLConfig.xml")){
            Person person = context.getBean("person", Person.class);
            System.out.println("name: " +person.getName()+", surname: " +person.getSurname()+ ", age: " +person.getAge());
            Somebody human = context.getBean("somebody",Somebody.class);
            human.setType("human");
            human.setName("Artem");
            human.setAge(37);
            Somebody human2 = context.getBean("somebody",Somebody.class);
            human2.setType("human");
            human2.setName("Vika");
            human2.setAge(39);
            System.out.println("Two people: " + human.toString() + ";\n " + human2.toString());
                    
        }
    }
}
