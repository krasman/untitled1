package com.company;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private int legsNumber;

    public void sayHello(){
        System.out.println("Hi, I'm animal. My name is " +this.name +" I'm "+ this.age +" years old " + "my weight is "+this.weight);
    }

    public Animal(String name, int age, int weight) {
        this.age=age;
        this.name =name;
        this.weight=weight;
    }

    public Animal( int age, int weight) {
        this.age=age;
        this.weight=weight;
        this.name = "poka net";
    }

    public Animal( int age, int legsNumber, int condition) {

        this.age=age;
        this.weight=weight;
        this.name = "poka net";
    }


    public String getName(){
        return this.name;
    }

}
