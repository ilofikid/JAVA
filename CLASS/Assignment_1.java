import java.util.*;
import java.lang.Math;
class Assignment_1
{
public static void main(String[] argv)
{
//Question-1
/*
System.out.print("Welcome to java");
*/

//Question-2
/*
System.out.print("Welcome to java");
System.out.println("Welcome to java");
*/

//Question-3

/*
float p,r,n,total;
Scanner obj=new Scanner(System.in);
System.out.print("Enter the principal: ");
p=obj.nextFloat();
System.out.print("Enter the rate of interest: ");
r=obj.nextFloat();
System.out.print("Enter the time: ");
n=obj.nextFloat();
r=r/100;
total=p*r*n;
System.out.println("Simple Interesrt: "+total);
*/

//Question -4

/*
float a,area;
Scanner obj=new Scanner(System.in);
System.out.print("Enter the side of square: ");
a=obj.nextFloat();
area=a*a;
System.out.println("Area of Square is: "+area);
*/

//Question -5

/*
float r,area;
Scanner obj=new Scanner(System.in);
System.out.print("Enter the radius of circle: ");
r=obj.nextFloat();
area=3.14F*r*r;
System.out.println("Area of Square is: "+area);
*/

//Question-6

/*
int a,b,c;
Scanner obj=new Scanner(System.in);
System.out.print("Enter the number a: ");
a=obj.nextInt();
System.out.print("Enter the number a: ");
b=obj.nextInt();
c=a;
a=b;
b=c;
System.out.println("Number a:"+a);
System.out.println("Number b:"+b);
*/

//Question-7

/*
		float a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the a: ");
		a=obj.nextFloat();
		System.out.println("Enter the b: ");
		b=obj.nextFloat();
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println(" a: "+a);
		System.out.println(" b: "+b);
*/

//question-8

/*

		float weight,height,total;
		Scanner obj=new Scanner(System.in);
		System.out.println("BMI calculator");
		System.out.println("Enter the Weight: ");
		weight=obj.nextFloat();
		System.out.println("Enter the height: ");
		height=obj.nextFloat();
		height=height*2.0F;
		total=weight/height;
		System.out.println("Bmi is: "+total);
		
*/


//Question-9

/*
int num,num1,sum=0;
Scanner obj=new Scanner(System.in);
System.out.print("Enter the number num: ");
num=obj.nextInt();
System.out.print("Enter the number num1: ");
num1=obj.nextInt();
for (int i=1;i<=num1;i++)
{
	sum=sum+num;
}
System.out.println("Product: "+sum);
*/

//Question 10

/*
double a = 10;
double b = 2;
System.out.println(Math.pow(a, b));
*/

//question-11
/*
	int k;
	double d;
	float f;
	boolean istrue;
	String p;
		System.out.println("int default value = "+ k);
		System.out.println("double default value = "+ d);
		System.out.println("float default value = "+ f);
		System.out.println("boolean default value = "+ istrue);
		System.out.println("String default value = "+ p);
		
*/

//Question 12

/*
		Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
*/

 
//Question13

//Question 14
		
		/*int num;
		System.out.println("Enter the Number 1 :-");
		num=sc.nextInt();
		
		if (num%2==0)
		{
			System.out.println(num+"is Even");
		}
		else
		{
			System.out.println(num+"is Odd");
		}*/
		
//Question 15
		
		/*int num;
		System.out.println("Enter the Number 1 :-");
		num=sc.nextInt();
		
		if (num==0)
		{
			System.out.println(" Its Zero");
		}
		else if (num>0)
		{
			System.out.println("Number is Positive");
		}
		else if (num<0)
		{
			System.out.println("Number is Negative");
		}*/
		
//Question 16
		
		/*int num;
		System.out.println("Enter the Day Number from 1__7:-");
		num=sc.nextInt();
		
		if (num==1)
		{
			System.out.println("Monday");
		}
		else if (num==2)
		{
			System.out.println("Tuesday");
		}
		else if (num==3)
		{
			System.out.println("Wednesday");
		}
		else if (num==4)
		{
			System.out.println("Thursday");
		}
		else if (num==5)
		{
			System.out.println("Friday");
		}
		else if (num==6)
		{
			System.out.println("Saturday");
		}
		else if (num==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid Input please Enter between 1 to 7");
		}
		*/
		
//Question 17

/*
	int n;
	String m;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number for month name: ");
	n=obj.nextInt();
	switch(n)
	{
		case 1:
		m="Januaray";
		break;
		
		case 2:
		m="February";
		break;
		
		case 3:
		m="March";
		break;
		
		case 4:
		m="April";
		break;
		
		case 5:
		m="May";
		break;
		
		case 6:
		m="June";
		break;
		
		case 7:
		m="July";
		break;
		
		case 8:
		m="August";
		break;
		
		case 9:
		m="September";
		break;
		
		case 10:
		m="October";
		break;
		
		case 11:
		m="November";
		break;
		
		case 12:
		m="December";
		break;
		
		default:
		m="Invalid Input";

	}
	System.out.println("Your result is : "+m);
	
*/

//Question 18

/*
int n;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number for month name: ");
n=obj.nextInt();

if ((n%100==0 && n%400==0) || (n%100!=0 && n%4==0))
{
	System.out.println("Leap year");
}
else
{
System.out.println("Not a Leap year");
}
*/

//Question 19

/*
int n,n1,n2;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number: ");
n=obj.nextInt();
System.out.println("Enter the number: ");
n1=obj.nextInt();
System.out.println("Enter the number: ");
n2=obj.nextInt();

if(n>n1 && n>n2)
{
	System.out.println(n+" is Maximum Number");
}
else if(n1>n && n1>n2)
{
	System.out.println(n1+" is Maximum Number");
}
else
{
	System.out.println(n2+" is Maximum Number");
}
*/

//Question-20

//Question-21

/*
for (int i=0;i<=10;i++)
{
	System.out.println("Bhumi Krishnani");
}
*/

//Question-22

/*
for (int i=0;i<=10;i++)
{
	System.out.println(i);
}
*/

//Question -23

/*
for (int i=10;i>=0;i--)
{
	System.out.println(i);
}
*/

//Question 24

/*
int sum=0,n;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number for looping sum: ");
n=obj.nextInt();

for (int i=0;i<=n;i++)
{
	sum+=i;
}
System.out.println("Their sum is "+sum);
*/

//Question-25

/*
int i = 0;
while (i <=10) 
{
  System.out.println(i);
  i++;
}
*/

//Question -26

/*
int n,temp=1;
Scanner obj=new Scanner(System.in);
System.out.print("Enter the Number for factorial: ");
n=obj.nextInt();
for (int i=1;i<=n;i++)
{
	temp=i*temp;
}	
System.out.println("Factorial of "+n+" is: "+temp);    
*/

//Question-27

/*
float p,t;
Scanner obj=new Scanner(System.in);
System.out.print("Enter the principle: ");
p=obj.nextFloat();
System.out.print("Enter the time: ");
t=obj.nextFloat();
for(float i=1.0f;i<=10.0f;i++)
{
	float temp=i/100;
	System.out.println("Simple Interest of "+i+"% is: "+(p*t*temp));
}
*/

//Question-28


/*
for(int i=1;i<=10;i++)
{
	if(i>6 && i<=8)
	{
		continue;
	}
	System.out.println(i);
}
*/

//Question-29

/*
for (int i=1;i<=10;i++)
{
	if(i>=6)
	{
		break;
	}
	System.out.println(i);
}
*/

//Question-30

for(int i=1;i<=3;i++)
{
	for(int j=1;j<=3;j++)
	{
		System.out.println(i+" "+j);
	}
}
		

}
}
