/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.ignatovichanastasiia.netb07.domain;

/**
 *
 * @author ignatovichanastasiia
 */
public class Somebody {
    private String type;
    private String name;
    private int age;
    
    public void init(){
        System.out.println("Somebody class init");
    }
    
    public void destroy(){
        System.out.println("Somebode class destroy");
    }
    
    public Somebody() {
        System.out.println("Somebody class constructor");           
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Somebody{" + "type=" + type + ", name=" + name + ", age=" + age + '}';
    }
    
}
