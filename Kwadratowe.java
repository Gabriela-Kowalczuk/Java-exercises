package com.company;
import java.util.Scanner;


public class Kwadratowe{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program rozwiązuje równanie kwadratowe ax^2+bx+c = 0");
        System.out.println("Wpisz pierwszy współczynnik rzeczywisty a, który jest różny od zera");

        String pierwszy = scan.nextLine();
        double a = Double.parseDouble(pierwszy);

        if (a == 0) {
            System.out.println("To niedozwolona wartość współczynnika a");
        } else {
            System.out.println("Wpisz drugi współczynnik rzeczywisty b");
            String drugi = scan.nextLine();
            double b = Double.parseDouble(drugi);

            System.out.println("Wpisz trzeci współczynnik rzeczywisty c");
            String trzeci = scan.nextLine();
            double c = Double.parseDouble(trzeci);

            int delta=(int) (b * b - 4 * a * c);
            if (Integer.signum(delta) < 0) {
                System.out.println("brak rozwiązania");
            } else {
                if (Integer.signum(delta) == 0) {
                    double x1 = -b / (2 * a);
                    System.out.print(" Dla a = " + a);
                    System.out.print(" Dla b = " + b);
                    System.out.println(" Dla c = " + c);
                    System.out.println("trójmian ma jeden pierwiastek x1 = "+ x1);

                } else {
                    double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b + Math.sqrt(delta)) / (2 * a);

                    System.out.print(" Dla a = " + a);
                    System.out.print(" Dla b = " + b);
                    System.out.println(" Dla c = " + c);
                    System.out.println("trójmian ma dwa pierwiastki:");
                    System.out.print("x1 = " + x1);
                    System.out.print(" x2 = " + x2);
                }


            }
        }
    }
}