package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
   // double l = 5;
    //double a = 5;
    //double b = 8;
    Square s = new Square(6);
    //s.l=5;
    Rectangle r = new Rectangle(5, 8);
   // r.a= 5; r.b=8;
    System.out.println("Площадь стороны квадрата со стороной" + s.l + "=" + s.area());
    System.out.println("Площадь стороны прямоугольника со стороной " + r.a + " и " + r.b + " = " + r.area());
  }


  public static void hello(String s) {
    System.out.println("Hello, " + s + "!");
  }

   //public static double area(Square s) {
    //return s.l * s.l;
   //}

  //public static double area(Rectangle r) {
    //return r.a * r.b;
  //}
}


