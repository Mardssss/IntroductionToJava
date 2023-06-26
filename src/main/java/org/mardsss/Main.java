package org.mardsss;

import org.mardsss.exercise1.PrintNameToConsole;
import org.mardsss.exercise10.FindTheMaximumNumberOutOf3Numbers;
import org.mardsss.exercise2.calculateSumOfTwoNumbers;
import org.mardsss.exercise3.FindAverageOfThreeNumbers;
import org.mardsss.exercise4.CheckIfNumberIsEvenOrOdd;
import org.mardsss.exercise5.CalculateFactorialOfGivenNumber;
import org.mardsss.exercise6.CalculateTheAreaOfCircleByItsRadius;
import org.mardsss.exercise7.ConvertInchesToCentimeters;
import org.mardsss.exercise8.CheckIfYearIsLeapOrNot;
import org.mardsss.exercise9.PrintTheFirst10FibonacciNumbers;

import javax.sound.sampled.Line;
import java.text.BreakIterator;

public class Main {
    public static void main(String[] args) {
        PrintNameToConsole.printName();
        calculateSumOfTwoNumbers.calculateSum();
        FindAverageOfThreeNumbers.findAverage();
        CheckIfNumberIsEvenOrOdd.checkEvenOrOdd();
        CalculateFactorialOfGivenNumber.calculateFactorial();
        CalculateTheAreaOfCircleByItsRadius.calculateAreaByRadius();
        ConvertInchesToCentimeters.convertInchToCentimeters();
        CheckIfYearIsLeapOrNot.checkLeapYear();
        PrintTheFirst10FibonacciNumbers.fibonaciSeries();
        FindTheMaximumNumberOutOf3Numbers.findTheMaximum();
    }
}