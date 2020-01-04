package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");

    Square s = new Square(8);

    Rectangle r = new Rectangle(5, 8);

    System.out.println("Площадь стороны квадрата со стороной" + s.l + "=" + s.area());
    System.out.println("Площадь стороны прямоугольника со стороной " + r.a + " и " + r.b + " = " + r.area());
  }

  public static void hello(String s) {
    System.out.println("Hello, " + s + "!");
  }

}


