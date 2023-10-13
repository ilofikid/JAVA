// Question 1

//class MyClass {
//    private int num;
//
//    public MyClass(int num) {
//        this.num = num;
//    }
//
//    public void display() {
//        System.out.println("Value of num: " + this.num);
//    }
//
//    public static void main(String[] args) {
//        MyClass obj = new MyClass(42);
//        obj.display();
//    }
//}


// Question 3
//
//class Student {
//    String name;
//    int age;
//
//    Student() {
//        name = "Unknown";
//        age = 0;
//    }
//
//    Student(String name) {
//        this.name = name;
//    }
//
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }
//
//    public static void main(String[] args) {
//        Student student1 = new Student();
//        Student student2 = new Student("Alice");
//        Student student3 = new Student("Bob", 25);
//
//        student1.display();
//        student2.display();
//        student3.display();
//    }
//}

//Question 5

//class Grandparent {
//    void grandparentMethod() {
//        System.out.println("Grandparent Method");
//    }
//}
//
//class Parent extends Grandparent {
//    void parentMethod() {
//        System.out.println("Parent Method");
//    }
//}
//
//class Child extends Parent {
//    void childMethod() {
//        System.out.println("Child Method");
//    }
//
//    public static void main(String[] args) {
//        Child child = new Child();
//        child.grandparentMethod();
//        child.parentMethod();
//        child.childMethod();
//    }
//}


// Question 6

//class Superclass {
//    int value;
//
//    Superclass(int value) {
//        this.value = value;
//    }
//}
//
//class Subclass extends Superclass {
//    Subclass(int value) {
//        super(value);
//    }
//
//    void display() {
//        System.out.println("Value: " + value);
//    }
//
//    public static void main(String[] args) {
//        Subclass obj = new Subclass(42);
//        obj.display();
//    }
//}

//// Question 7
//
//abstract class Shape {
//    abstract double area();
//}
//
//class Triangle extends Shape {
//    double base;
//    double height;
//
//    Triangle(double base, double height) {
//        this.base = base;
//        this.height = height;
//    }
//
//    @Override
//    double area() {
//        return 0.5 * base * height;
//    }
//}
//
//class Rectangle extends Shape {
//    double length;
//    double width;
//
//    Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    @Override
//    double area() {
//        return length * width;
//    }
//}
//
//class Circle extends Shape {
//    double radius;
//
//    Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    double area() {
//        return Math.PI * radius * radius;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Shape triangle = new Triangle(5, 7);
//        Shape rectangle = new Rectangle(4, 6);
//        Shape circle = new Circle(3);
//
//        System.out.println("Area of Triangle: " + triangle.area());
//        System.out.println("Area of Rectangle: " + rectangle.area());
//        System.out.println("Area of Circle: " + circle.area());
//    }
//}


// Question 8
//
//interface Shape {
//    double area();
//}
//
//class Triangle implements Shape {
//    double base;
//    double height;
//
//    Triangle(double base, double height) {
//        this.base = base;
//        this.height = height;
//    }
//
//    @Override
//    public double area() {
//        return 0.5 * base * height;
//    }
//}
//
//class Rectangle implements Shape {
//    double length;
//    double width;
//
//    Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    @Override
//    public double area() {
//        return length * width;
//    }
//}
//
//class Circle implements Shape {
//    double radius;
//
//    Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double area() {
//        return Math.PI * radius * radius;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Shape triangle = new Triangle(5, 7);
//        Shape rectangle = new Rectangle(4, 6);
//        Shape circle = new Circle(3);
//
//        System.out.println("Area of Triangle: " + triangle.area());
//        System.out.println("Area of Rectangle: " + rectangle.area());
//        System.out.println("Area of Circle: " + circle.area());
//    }
//}


// Question 9
//
//interface A {
//    void methodA();
//}
//
//interface B {
//    void methodB();
//}
//
//class MultipleInheritance implements A, B {
//    @Override
//    public void methodA() {
//        System.out.println("Method A");
//    }
//
//    @Override
//    public void methodB() {
//        System.out.println("Method B");
//    }
//
//    public static void main(String[] args) {
//        MultipleInheritance obj = new MultipleInheritance();
//        obj.methodA();
//        obj.methodB();
//    }
//}


// Question 11

//
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Calendar calendar = new GregorianCalendar();
//        System.out.println("Current time is " + new Date());
//        System.out.println("Date : " + calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR) );
//
//        System.out.println("Time : " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) +":" + calendar.get(Calendar.SECOND) );
//
//        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
//
//        System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
//
//        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
//
//        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
//
//        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
//
//        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
//
//        Calendar calendar1 = new GregorianCalendar(1997, 11, 25);
//        String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//        System.out.println("December 25, 1997 is a " + dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);
//    }
//}


// Question 12


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        Calendar calendar = new GregorianCalendar(year, month - 1, 1);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= daysInMonth; i++) {
            if (i < 10) {
                System.out.print("   " + i);
            } else {
                System.out.print("  " + i);
            }
            if ((i + calendar.get(Calendar.DAY_OF_WEEK) - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
