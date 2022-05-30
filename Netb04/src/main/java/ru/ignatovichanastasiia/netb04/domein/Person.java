/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb04.domein;

import ru.ignatovichanastasiia.netb04.domein.intf.Petable;
import ru.ignatovichanastasiia.netb04.domein.intf.Sayzable;

/**
 *
 * @author ignatovichanastasiia
 */
public class Person implements Sayzable{
    private Petable pet;

    public Person() {
    }

    public Petable getPet() {
        return pet;
    }

    public void setPet(Petable pet) {
        this.pet = pet;
    }
    

    @Override
    public void say() {
        System.out.println("Hello");
    }

    public void playWithPet(){
        if (this.pet!=null) System.out.println("Person play with pet");
    }
    
}
