package com.epam.langSyntax;


public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousandsDigit = number / 1000;
        int hundredsDigit = (number % 1000)/ 100;
        int tensDigit = (number % 100) / 10;
        int unitsDigit = number % 10;
        System.out.println(thousandsDigit + hundredsDigit + tensDigit + unitsDigit);
    }
}
