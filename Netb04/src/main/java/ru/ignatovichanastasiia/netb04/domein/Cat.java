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
public class Cat implements Sayzable, Petable{

    @Override
    public void say() {
        System.out.println("Myau");
    }

    @Override
    public void play() {
        System.out.println("Cat play a game");
    }
    
}
