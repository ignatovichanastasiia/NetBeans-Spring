/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb09.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author ignatovichanastasiia
 */
@Component("mother")
public class Mother implements Parent{
    private Child child;

    public Mother(){
    }
    
    @Override
    public Child getChild() {
        return child;
    }

    @Override
    @Autowired
    @Qualifier("son")
    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Mother{" + "child=" + child + '}';
    }
    
    
}
