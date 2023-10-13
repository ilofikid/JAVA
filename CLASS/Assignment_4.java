import java.util.*;

//Question-1

/*
class Test 
{
  private int age;
  private String name;
  
  public void setAge(int age) 
  {
    this.age = age;
 }
  
  public void setName(String name) 
  {
    this.name = name;
  }
  
  public int getAge() 
  {
    return this.age;
  }

  public String getName() 
  {
    return this.name;
  }

}


class Assignment_4 
{
  public static void main(String[] args) 
  {
	  int a;
	  String n;
	  Scanner obj=new Scanner(System.in);
	  System.out.print("Enter your name: ");
	  n=obj.next();
	  System.out.print("\nEnter your age: ");
	  a=obj.nextInt();
	  Test test = new Test();
	  test.setAge(a);
	  test.setName(n);
	  System.out.println("Name: " + test.getName());
	  System.out.println("Age: " + test.getAge());
	  
  }
}
*/

//Question-3
/*
public class Student{  
	int id;  
	String name;  
  
	Student(){  
	System.out.println("this a default constructor");  
	}  
  
	Student(int i, String n){  
	id = i;  
	name = n;  
	}  
 class Assisgnment_4
 {
	 public static void main(String[] args)
	 {  
		Student s = new Student();  
		System.out.println("\nDefault Constructor values: \n");  
		System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
		System.out.println("\nParameterized Constructor values: \n");  
		Student student = new Student(10, "David");  
		System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
	}  
}  
*/

//Question-4

/*
abstract class Employee 
{
	abstract void calculateSalary();
}

class Contractor extends Employee 
{
	void calculateSalary() 
	{
		String name;
		int age;
		float working,per_hour=50f,salary;
        Scanner obj=new Scanner(System.in);
	    System.out.print("Enter your name: ");
	    name=obj.next();
	    System.out.print("\nEnter your age: ");
	    age=obj.nextInt();
		System.out.print("\nEnter your woring hours: ");
		working=obj.nextFloat();
		salary=working*per_hour;
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("salary "+salary);

	}

}

class FullTimeEmployee extends Employee 
{
	void calculateSalary() 
	{
		String name;
		int age;
		float working,per_hour=500f,salary;
        Scanner obj=new Scanner(System.in);
	    System.out.print("Enter your name: ");
	    name=obj.next();
	    System.out.print("\nEnter your age: ");
	    age=obj.nextInt();
		System.out.print("\nEnter your woring hours: ");
		working=obj.nextFloat();
		salary=working*per_hour;
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("salary "+salary);

	}

}
class Assignment_4 
{
	public static void main(String args[]) 
	{
		System.out.println("now class is Contractor");
		Employee s = new Contractor();
		s.calculateSalary();
		System.out.println("now class is FullTimeEmployee");
		Employee s1 = new FullTimeEmployee();
		s1.calculateSalary();
	}
}
*/

//Question-5
/*
class Animal
{  
	void eat()
	{
		System.out.println("eating...");
	}  
} 
 
class Dog extends Animal
{  
	void bark()
	{
		System.out.println("barking...");
	}  
}  

class BabyDog extends Dog
{  
	void weep()
	{
		System.out.println("weeping...");
	}  
} 
 
class Assignment_4
{  
	public static void main(String args[])
	{  
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  
	}
}  
*/

//Question-6

/*
class SuperClass
{
    int x;
    SuperClass(int a)
    {
        x=a;
        System.out.println("Super Class : " +x);
    }
}

class SubClass extends SuperClass
{
    int y;
    SubClass(int l,int m)
    {
        super(l);
        y=m;
        System.out.println("Sub class : "+y);
    }
}

class Assignment_4
{
    public static void main(String arg[])
    {
        SubClass s=new SubClass(5,4);
    }
}
*/

//Question-7
/*
abstract class Shape 
{
	abstract void area();
}

class Rectangle extends Shape 
{
	void area() 
	{
		System.out.println("Rectangle");
		int l,b,total;
        Scanner obj=new Scanner(System.in);
	    System.out.print("Enter the length: ");
	    l=obj.nextInt();
	    System.out.print("\nEnter the breadth: ");
	    b=obj.nextInt();
		total=l*b;
		System.out.println("Length: "+l);
		System.out.println("Breadth: "+b);
		System.out.println("Total area: "+total);

	}

}

class Triangle extends Shape 
{
	void area() 
	{
		System.out.println("Triangle");
		int h,b;
		float total;
        Scanner obj=new Scanner(System.in);
	    System.out.print("Enter the base: ");
	    b=obj.nextInt();
	    System.out.print("\nEnter the height: ");
	    h=obj.nextInt();
		total=0.5f*b*h;
		System.out.println("Base: "+b);
		System.out.println("Height: "+h);
		System.out.println("Total area: "+total);

	}

}

class Circle extends Shape 
{
	void area() 
	{
		System.out.println("Circle");
		float r,total;
        Scanner obj=new Scanner(System.in);
	    System.out.print("Enter the radius: ");
	    r=obj.nextFloat();
		total=3.14f*r*r;
		System.out.println("Radius: "+r);
		System.out.println("Total area: "+total);

	}

}

class Assignment_4 
{
	public static void main(String args[]) 
	{
		Shape s = new Rectangle();
		s.area();
		Shape s1 = new Triangle();
		s1.area();
		Shape s2 = new Circle();
		s2.area();
	}
}
*/


//Question-9
/*
interface Walkable 
{
	void walk();
}

interface Swimmable 
{
	void swim();
}

class Duck implements Walkable, Swimmable 
{
	public void walk()
	{
		System.out.println("Duck is walking.");
	}

	public void swim()
	{
		System.out.println("Duck is swimming.");
	}
}

class Assignment_4 
{
	public static void main(String[] args)
	{
		Duck duck = new Duck();
		duck.walk();
		duck.swim();
	}
}

*/

//Qustion-10

public class Assignment_4 {
	/*
    public static void main(String[] args) {
        double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;

        System.out.printf("The absolute value " + "of %.3f is %.3f%n", 
                          a, Math.abs(a));

        System.out.printf("The ceiling of " + "%.2f is %.0f%n", 
                          b, Math.ceil(b));

        System.out.printf("The floor of " + "%.2f is %.0f%n", 
                          b, Math.floor(b));

        System.out.printf("The rint of %.2f " + "is %.0f%n", 
                          b, Math.rint(b));

        System.out.printf("The max of %d and " + "%d is %d%n",
                          c, d, Math.max(c, d));

        System.out.printf("The min of of %d " + "and %d is %d%n",
                          c, d, Math.min(c, d));
    }
}


	public static void main(String[] args) {
        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of " + "e is %.4f%n",
                          Math.E);

        System.out.printf("exp(%.3f) " + "is %.3f%n",
                          x, Math.exp(x));

        System.out.printf("log(%.3f) is " + "%.3f%n",
                          x, Math.log(x));

        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n",
                          x, y, Math.pow(x, y));

        System.out.printf("sqrt(%.3f) is " + "%.3f%n",
                          x, Math.sqrt(x));
    }
}
*/
	public static void main(String[] args) {
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);
        
        System.out.format("The value of pi " + "is %.4f%n",
                           Math.PI);

        System.out.format("The sine of %.1f " + "degrees is %.4f%n",
                          degrees, Math.sin(radians));

        System.out.format("The cosine of %.1f " + "degrees is %.4f%n",
                          degrees, Math.cos(radians));

        System.out.format("The tangent of %.1f " + "degrees is %.4f%n",
                          degrees, Math.tan(radians));

        System.out.format("The arcsine of %.4f " + "is %.4f degrees %n", 
                          Math.sin(radians), 
                          Math.toDegrees(Math.asin(Math.sin(radians))));

        System.out.format("The arccosine of %.4f " + "is %.4f degrees %n", 
                          Math.cos(radians),  
                          Math.toDegrees(Math.acos(Math.cos(radians))));

        System.out.format("The arctangent of %.4f " + "is %.4f degrees %n", 
                          Math.tan(radians), 
                          Math.toDegrees(Math.atan(Math.tan(radians))));
    }
}

//Question -11
/*
public class Assignment_4
{
	public static void main(String[] args) 
	{
		 Calendar calendar = Calendar.getInstance();
		System.out.println("Current time is " + new Date());
		System.out.println("YEAR: "+ calendar.get(Calendar.YEAR)); 
		System.out.println("MONTH: "+ calendar.get(Calendar.MONTH)); 
		System.out.println("DATE: " + calendar.get(Calendar.DATE)); 
		System.out.println("HOUR: "+ calendar.get(Calendar. HOUR)); 
		System.out.println("HOUR_OF_DAY:"+calendar.get(Calendar. HOUR_OF_DAY));

		System.out.println("MINUTE: "+calendar.get(Calendar.MINUTE));
		 System.out.println("SECOND: "+ calendar.get(Calendar.SECOND));
		 System.out.println("DAY_OF_WEEK:"+ calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_MONTH:" +calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_YEAR: "+calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: "+calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println("WEEK_OF_YEAR: "+calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
		Calendar calendar1 = new GregorianCalendar (1997, 11, 25);
		String[] dayNameOfWeek= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		System.out.println("December 25, 1997 is a "+dayNameOfWeek [calendar1.get(Calendar.DAY_OF_WEEK) - 1]);
	}
}   
*/      