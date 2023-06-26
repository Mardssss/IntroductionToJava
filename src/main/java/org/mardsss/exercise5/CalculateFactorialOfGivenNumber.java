package org.mardsss.exercise5;

public class CalculateFactorialOfGivenNumber {
    public static void calculateFactorial(){
        double i,fact=1.0;
        double factorial=65.0;//It is the number to calculate factorial
        for(i=1.0;i<=factorial;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+factorial+" is: "+fact);
    }
}