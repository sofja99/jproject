package edu.jcourse.lesson3;

public class ArrayDemo {

    public static void main(String[] args) {
    int arraySize=10;
    int a[]=new int [arraySize];
//
 for(int i=0;i<a.length;i++){
       a[i]=i;
  }
//
//        for(int i=0;i<a.length;i++){
//            if(i==2) {continue;}
//        System.out.println(a[i]);
//    }
//        for (int i = 0; i <a.length; i++) {
//            a[i]=i;
//        }
        for (int i = a.length-1; i>-1 ; i--) {
            System.out.println(a[i]);
        }
    }
}


