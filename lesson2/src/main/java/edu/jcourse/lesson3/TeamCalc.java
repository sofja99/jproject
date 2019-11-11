package edu.jcourse.lesson3;

public class TeamCalc {
    public static void main(String[] args) {

        if(args.length !=0) {
            double value1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double value2 = Double.parseDouble(args[2]);
            double result=0;
            if("+".equals(operator)) {
                result = value1 + value2;
            }
            if("*".equals(operator)){
                result=value1*value2;
            }
            if("-".equals(operator)){
                result=value1-value2;
            }
            if("/".equals(operator)){
                result=value1/value2;
            }
            System.out.println("Result: " + result);
            int i=0;
            System.out.println(++i);
            int a =10, b=10;
            a+=b;
            System.out.println(a);
        } else {
            System.out.println("Incorrect format:\nFor example: 10 + 20");
        }
    }
}
