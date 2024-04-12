package com.epam.conditions;



public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean isValidTriangle = (firstSide < secondSide + thirdSide) &&
                (secondSide < firstSide + thirdSide) &&
                (thirdSide < firstSide + secondSide);

        // Выводим результат
        if (isValidTriangle) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }
}
