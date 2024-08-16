package org.assignment2;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        System.out.println("This program calculates users future investment value"); //Intro

        //Declaring and Initializing variables

        double investmentAmount = 1000;
        double monthlyInterestRate = 3.25/12; //Dividing by 12 because it is monthly Interest rate
        int numberOfYears = 1;

        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate),(numberOfYears * 12));

        System.out.println("The Future Investment Value is " +  Math.ceil(futureInvestmentValue));
    }


}
