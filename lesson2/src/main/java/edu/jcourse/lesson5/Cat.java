package edu.jcourse.lesson5;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void sayHello() {
        System.out.println(getName() + " says Meow");
    }


    @Override
    public String toString() {
        return getName() + ", " + String.valueOf(getAge());
    }
}