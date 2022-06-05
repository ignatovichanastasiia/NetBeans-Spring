/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb11.domain;

import java.util.ArrayList;
import org.springframework.stereotype.Component;



/**
 *
 * @author ignatovichanastasiia
 */
@Component("beanLibrary")
public class Library {
    ArrayList<String> list = new ArrayList();
    
    Library(){
        for(int x = 0; x < 6; x++){
        list.add("Book"+x);
        }
    }
    
    public void getBook(){
        String book = list.get((list.size())-1);
        System.out.println(book + " is taken");
    }
}
