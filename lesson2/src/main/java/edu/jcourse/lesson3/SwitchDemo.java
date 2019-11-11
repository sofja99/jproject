package edu.jcourse.lesson3;

public class SwitchDemo {

    public static void main(String[] args) {
        double value1=Double.parseDouble(args[0]);
        String operator=args[1];
        double value2=Double.parseDouble(args[2]);
        double result=0;
        switch(operator){
            case "+":
                result=value1+value2;
                break;
            case "-":
                result=value1-value2;
                break;
            case "*":
                result=value1*value2;
                break;
               case "/":
                result=value1/value2;
                break;
            default:
                System.out.println("Default");
        }
        System.out.println("Result: "+ result);
    }
}
