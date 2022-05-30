/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.xmlvebinar.quoters;

/**
 *
 * @author ignatovichanastasiia
 */
public class TerminaterQuoter implements Quote{
    private String message; 
    
    @Override
    public void sayQuote() {
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
