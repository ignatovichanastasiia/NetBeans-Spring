/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb07.domain;

/**
 *
 * @author ignatovichanastasiia
 */
public class Person {
    private String name; 
    private String surname;
    private int age;
    
    public void init(){
        System.out.println("Person class init");
    }
    
    public void destroy(){
        System.out.println("Person class destroy");
    }

    public Person() {
        System.out.println("Person class constructor");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
