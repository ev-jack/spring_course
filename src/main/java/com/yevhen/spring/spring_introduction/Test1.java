package com.yevhen.spring.spring_introduction;

public class Test1 {
    public static void main(String[] args) {
        Pet pet = new Dog();
        System.out.println(pet.getClass());

        Pet pet1 = new Cat();
        pet1.say();


    }
}
