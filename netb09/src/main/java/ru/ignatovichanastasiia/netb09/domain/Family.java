/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb09.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author ignatovichanastasiia
 */

@Component("family")
public class Family {
    private String surname;
    private Parent parent1;
    private Parent parent2;
    private Child child;

    public Family() {
    }

    public String getSurname() {
        return surname;
    }

    @Value("Smirnovy")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    public Parent getParent1() {
        return parent1;
    }

    @Autowired
    @Qualifier("father")
    public void setParent1(Parent parent1) {
        this.parent1 = parent1;
    }

    public Parent getParent2() {
        return parent2;
    }

    @Autowired
    @Qualifier("mother")
    public void setParent2(Parent parent2) {
        this.parent2 = parent2;
    }

    public Child getChild() {
        return child;
    }

    @Autowired
    @Qualifier("son")
    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Family{" + "surname=" + surname + ", parent1=" + parent1 + ", parent2=" + parent2 + ", child=" + child + '}';
    }
    
    
}
