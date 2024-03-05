package edu.step.shape;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți latura pătratului:");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);

        System.out.println("Introduceți lungimea și lățimea dreptunghiului:");
        double rectangleLength = scanner.nextDouble();
        double rectangleWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);

        System.out.println("Suprafața și perimetrul pătratului:");
        System.out.println("Suprafața: " + square.getArea());
        System.out.println("Perimetrul: " + square.getPerimeter());

        System.out.println("Suprafața și perimetrul dreptunghiului:");
        System.out.println("Suprafața: " + rectangle.getArea());
        System.out.println("Perimetrul: " + rectangle.getPerimeter());

        scanner.close();
    }
}
