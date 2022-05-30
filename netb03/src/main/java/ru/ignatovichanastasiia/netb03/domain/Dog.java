/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb03.domain;

/**
 *
 * @author ignatovichanastasiia
 */
public class Dog implements Sayzable{

    public Dog() {
    }
    
     
    @Override
    public void say(){
        System.out.println("Guv");
    }
    
}
