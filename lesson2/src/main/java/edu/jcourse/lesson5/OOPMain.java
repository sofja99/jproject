package edu.jcourse.lesson5;

public class OOPMain {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Abstract animal");
        animal.sayHello();

        Cat cat = new Cat();
        cat.setAge(10);
        cat.setName("Pushok");
        cat.sayHello();
        cat.printAge();

        Dog dog = new Dog();
        dog.setName("Bobik");
        dog.setAge(5);
        dog.printAge();
        dog.sayHello();

        if(cat instanceof Animal) { //помогает определить родителя
            System.out.println("Cat is an Animal");
        }

        System.out.println(animal);
        System.out.println(cat);
    }
}
