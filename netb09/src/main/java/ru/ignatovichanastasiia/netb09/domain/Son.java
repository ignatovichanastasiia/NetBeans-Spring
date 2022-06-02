/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb09.domain;

import org.springframework.stereotype.Component;

/**
 *
 * @author ignatovichanastasiia
 */
@Component("son")
public class Son implements Child{
    
    @Override
    public void comeToParent(){
        System.out.println("Child came to his parent.");
    }

    @Override
    public String toString() {
        return "Son{" + '}';
    }
    
    
    
}
