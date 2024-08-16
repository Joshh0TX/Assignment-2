package org.assignment2;

import javax.sound.midi.SysexMessage;

public class AreaOfATriangle {
    //This program prints the area of a Triangle

    //Declaring and Initializing variables
    //Triangle points
    int x1 = 1;
    int y1 = 1;

    int x2 = 2;
    int y2 = 2;

    int x3 = 3;
    int y3= 3;

    //length of sides
    double side1 = 5;
    double side2 = 7;
    double side3 = 9;


    double sides = (side1 + side2 +side3)/2;

    double beforeRoot = (sides - side1)*(sides - side2)*(sides -side3);

    double afterRoot = sides * beforeRoot;

    double areaTotal =  Math.sqrt(afterRoot);

    //Using Method
    public double getAreaTotal() {
        return  areaTotal;
    }

    public static void main(String[] args) {
        AreaOfATriangle triangle = new AreaOfATriangle();
        System.out.println("The area is equal to " + triangle.getAreaTotal() + " cm^2");
    }
}
