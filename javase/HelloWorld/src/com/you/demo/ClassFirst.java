package com.you.demo;

public class ClassFirst {
    public static void main(String[] args)
    {
        Person ming = new Person();
        ming.name = "xiao ming";
        ming.age = 12;
        System.out.print(ming.age);
    }
}

class Person {
    public String name;
    public int age;
}
