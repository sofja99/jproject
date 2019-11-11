package edu.jcourse.lesson3;

public class HomeWork {

    public static void main(String[] args) {

        int arraySize=10;
        int a[]=new int[arraySize];
        for(int i=0;i<arraySize;i++)
            a[i]=i;
        for(int i=arraySize-1;i>=0;i--)
            System.out.println(a[i]);

        int sum=0;
        int array[]=new int[arraySize];
        for(int i=0;i<arraySize;i++) {
            array[i] = (i+1) * 7;
            sum += array[i];
        }
        for(int i=0;i<arraySize;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is "+ sum/10);
    }
}
