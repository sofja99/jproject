package edu.jcourse.lesson5;

public class Circle {

    private float radius;
    private final float PI = 3.14F;

    public float area() {
        return PI * (radius * radius);
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
