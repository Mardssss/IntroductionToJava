package org.mardsss.exercise8;

public class CheckIfYearIsLeapOrNot {
    public static void checkLeapYear(){
        int leapYear = 2012;
        if(leapYear%4 == 0 ){
            System.out.println(leapYear+" is a leap year");
        } else {
            System.out.println(leapYear+" is not a leap year");
        }
    }
}
