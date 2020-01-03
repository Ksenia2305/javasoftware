package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    double len =5;
    double a =5;
    double b=8;
    System.out.println("Площадь стороны квадрата со стороной"+len+"="+area(len));
    System.out.println("Площадь стороны прямоугольника со стороной "+a+" и "+b+" = "+area(a,b));
  }


  public static void hello(String s ) {
    System.out.println("Hello, " +s+"!");
  }

  public static double area (double l){
    return l*l;
  }
  public static double area (double a, double b) {
    return a * b;
  }
}


