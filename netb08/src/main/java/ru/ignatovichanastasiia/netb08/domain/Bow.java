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
@Component("bow")
public class Bow {

    public Bow() {
        System.out.println("Bow is created");
    }
     
    public void see(){
        System.out.println("You see a red bow ");
    }
}
