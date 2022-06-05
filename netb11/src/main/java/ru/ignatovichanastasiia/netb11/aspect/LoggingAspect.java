/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb11.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author ignatovichanastasiia
 */
@Component
@Aspect
public class LoggingAspect {
    
    @Before("execution(public void getBook())")
    public void beforeGetBookMethodAdvice(){
        System.out.println("Before getBook meth. advice");
    }
    
}
