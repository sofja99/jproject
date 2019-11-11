package edu.jcourse.lesson5;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void sayHello() {
        System.out.println(getName() + " Gaw");
    }

    protected void finalize(){
        System.out.println("Finalize class");
    }
}

