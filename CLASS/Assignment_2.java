import java.util.*;
class Assignment_2
{
	public static void main (String[] args)
	{	
//Question -1
	
		/*
		Scanner obj=new Scanner(System.in);
		String s;
		System.out.println("Enter the your name: ");
		s=obj.next();
		System.out.println("Your name: "+s);
		*/
		
		
//Question -2
	
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


//Question-3

/*
float l,b,area;
Scanner obj=new Scanner(System.in);
System.out.print("Enter the length of rectangle: ");
l=obj.nextFloat();
System.out.print("Enter the breadth of rectangle: ");
b=obj.nextFloat();
area=l*b;
System.out.println("Area of Rectangle is: "+area);
*/


//Question - 4

/*
float r,area;
Scanner obj=new Scanner(System.in);
System.out.print("Enter the radius of circle: ");
r=obj.nextFloat();
area=3.14F*r*r;
System.out.println("Area of Circle is: "+area);
*/	


//Question - 5

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

//Question - 6

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


//Question -7


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


//Question - 8

/*
	String name,sex;
	int age;
	float salary;
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter your name: ");
	name=obj.next();
	System.out.print("Enter your gender: ");
	sex=obj.next();
	System.out.print("Enter your age: ");
	age=obj.nextInt();
	System.out.print("Enter your Salary: ");
	salary=obj.nextFloat();
	System.out.print("Your name is: "+name);
	System.out.println("Your gender is: "+sex);
	System.out.println("Your age is: "+age);
	System.out.println("Your salary is: "+salary);
*/

//Question -9 

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


//Question -10

/*
		Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
*/

//Question - 11




//Question -12

/*
		int num;
		System.out.println("Enter the Number 1 :-");
		num=sc.nextInt();
		
		if (num%2==0)
		{
			System.out.println(num+"is Even");
		}
		else
		{
			System.out.println(num+"is Odd");
		}
*/

//Question -13

/* 
		int num;
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
		}
*/

//Question - 14

/*
		int num;
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
		
//Question 15

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

//Question-16

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

//Question -17 

/*
	int n,n1,n2;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number: ");
	n=obj.nextInt();
	System.out.println("Enter the number: ");
	n1=obj.nextInt();
	System.out.println("Enter the number: ");
	n2=obj.nextInt();
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

//Question -18

/*
	int n,n1,n2;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number: ");
	n=obj.nextInt();
	System.out.println("Enter the number: ");
	n1=obj.nextInt();
	System.out.println("Enter the number: ");
	n2=obj.nextInt();
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

//Question -19

/*
for (int i=0;i<=10;i++)
{
	System.out.println("Bhumi Krishnani");
}
*/

//Question -20

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

//Question -21 && Question -22 && Question -23 && Question -24
/*

		int a1,a2,a3,a4,a5;
		int intarr[]= {1,2,3,4,5,6,7,8,9,10};
		float floatarr[]={1.1f,1.2f,1.3f,1.4f,1.5f};
		double doublearr[]={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8};
		short shortarr[]={10,20,30,40};
		byte bytearr[]={1,2,3,4,5};
		
		//1
		System.out.println("Int array of 10\n");
		for (a1=0;a1<10;a1++)
		{
			System.out.print(intarr[a1]+"\t");
		}
		//2
		System.out.println("\nFloat array of 5\n");
		for (a2=0;a2<5;a2++)
		{
			System.out.print(floatarr[a2]+"\t");
		}
		//3
		System.out.println("\nDouble array of 8\n");
		for (a3=0;a3<8;a3++)
		{
			System.out.print(doublearr[a3]+"\t");
		}
		//4
		System.out.println("\nShort array of 4\n");
		for (a4=0;a4<4;a4++)
		{
			System.out.print(shortarr[a4]+"\t");
		}
		//5
		System.out.println("\nByte array of 5\n");
		for (a5=0;a5<5;a5++)
		{
			System.out.print(bytearr[a5]+"\t");
		}
		
		//For Each Loop
		
		//1
		System.out.print("\n*For Each Loop*\n");
		System.out.println("\nInt array of 10");
		for(int i:intarr)
		{
			System.out.print(i+"\t");
		}
		
		
		//2
		System.out.println("\nFloat array of 5\n");
		for(float i: floatarr)
		{
			System.out.print(i+"\t");
		}
		
		
		//3
		System.out.println("\nDouble array of 8\n");
		for(double i: doublearr)
		{
			System.out.print(i+"\t");
		}
		
		
		//4
		System.out.println("\nShort array of 4\n");
		for(short i: shortarr)
		{
			System.out.print(i+"\t");
		}
		
		
		//5
		System.out.println("\nByte array of 5\n");
		for(byte i: bytearr)
		{
			System.out.print(i+"\t");
		}
		
		//While Loop
		System.out.print("\n*While Loop*\n");
		System.out.println("\nInt array of 10");
		int i=0;
		while(i<10)
		{
            System.out.print(intarr[i]+"\t");  
            i++;
        }
		
		System.out.println("\nFloat array of 5\n");
		float j=0;
		while(j<5)
		{
            System.out.print(floatarr[j]+"\t");  
            j++;
        }
		
		System.out.println("\nDouble array of 8\n");
		double d=0;
		while(d<8)
		{
            System.out.print(doublearr[d]+"\t");  
            d++;
        }
		
		System.out.println("\nShort array of 4\n");
		short s=0;
		while(s<4)
		{
            System.out.print(shortarr[s]+"\t");  
            s++;
        }
		
		System.out.println("\nByte array of 5\n");
		byte k=0;
		while(k<5)
		{
            System.out.print(bytearr[k]+"\t");  
            k++;
        }
		
	*/
		
//Question -25
		/*
		int intarr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		float floatarr[]={1.1f,1.2f,1.3f,1.4f,1.5f};
		double doublearr[]={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8};
		short shortarr[]={10,20,30,40};
		byte bytearr[]={1,2,3,4,5};

        
		
        int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		int index4 = 0;
		int index5 = 0;
		
		//1
		System.out.println("Int array of 10\n");
        for (int i1 = index1; i1 < intarr.length; i1 += 2)
			{
            System.out.print(intarr[i1] + " ");
			}
		//2
		System.out.println("\nFloat array of 5\n");
		for (int i2 = index2; i2 < floatarr.length; i2 += 2)
		{
			System.out.print(floatarr[i2] + " ");
		}
		//3
		System.out.println("\nDouble array of 8\n");
		for (int i3 = index3; i3 < doublearr.length; i3 += 2)
		{
			System.out.print(doublearr[i3] + " ");
		}
		//4
		System.out.println("\nShort array of 4\n");
		for (int i4 = index4; i4 < shortarr.length; i4 += 2)
		{
			System.out.print(shortarr[i4] + " ");
		}
		//5
		System.out.println("\nByte array of 5\n");
		for (int i5 = index5; i5 < bytearr.length; i5 += 2)
		{
			System.out.print(bytearr[i5] + " ");
		}
	*/
		
//Question -26
	/*
	char nameArray[] = {'B', 'H', 'U', 'M','I'};
        
        for (char ch : nameArray)
        {
            System.out.print(ch);
        }
	*/

//Question-27
	/*
		 int twoDArray[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int row[] : twoDArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }
	*/
	
	
//Question-28
	
	/*
		int[][] jaggedArray = 
		 {
            {1, 2},
            {3, 4, 5, 6, 7},
            {8, 9, 10},
            {11}
         };

        for (int[] row : jaggedArray)
			{
            for (int num : row) 
			{
                System.out.print(num + " ");
            }
            System.out.println("\n");
			}
	*/	
		
//Question-29
		
		 int[] integers = {1, 2, 3, 4, 5};
        int index = 10; // Trying to access element at index 10, which is out of bounds

        try 
		{
            System.out.println(integers[index]);
        }
		catch (ArrayIndexOutOfBoundsException e)
		{
            System.out.println("Error: " + e.getMessage());
        }



	}
}