package edu.step.shape;
import java.util.Scanner;
public class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}


