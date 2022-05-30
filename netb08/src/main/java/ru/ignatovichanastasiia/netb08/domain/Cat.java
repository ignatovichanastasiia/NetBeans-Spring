/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb08.domain;

import org.springframework.stereotype.Component;

/**
 *
 * @author ignatovichanastasiia
 */
@Component("cat")
public class Cat {

    public Cat() {
        System.out.println("Cat is created");
    }
    
    public void say(){
        System.out.println("Myau!");
    }
}
