/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ru.ignatovichanastasiia.xmlvebinar;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ignatovichanastasiia.xmlvebinar.quoters.Quote;

/**
 *
 * @author ignatovichanastasiia
 */
public class XMLvebinar {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringXMLConfig.xml");
        context.getBean(Quote.class).sayQuote();
    }
}
