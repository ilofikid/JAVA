import java.util.*;
import java.lang.String;
class Assigment_3
{
	public static void main(String[] args)
	{
//Question-1
	
	/*
		String string = "Big black bug bit a big black dog on his big black nose";    
        int count;       
        string = string.toLowerCase();        
        String words[] = string.split(" ");    
            
        System.out.println("Duplicate words in a given string : ");     
        for(int i = 0; i < words.length; i++) {    
            count = 1;    
            for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                    count++;      
                    words[j] = "0";    
                }    
            }    
            if(count > 1 && words[i] != "0")    
                System.out.println(words[i]);    
        }
	*/

//Question-2
	
	/*
		String s="This is assignment-3 of java programming...!..:)";
		System.out.println(s);
		int count=1;
		String words[] = s.split(" ");
		for(int i = 0; i < words.length; i++) 
		{    
            count+=count; 
		}
		System.out.print("Number words in string are: "+count);
		
	*/
	
//Question-3

	/*
		String str = "Java Examples Java Code Java Program";
		System.out.println(str);
        
        String strFind = "Java";
        int count = 0, fromIndex = 0;
        
        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){
 
            System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;
            
        }
        
        System.out.println("Total occurrences: " + count);

	*/

//Question -4
		
	/*	
		String str;  
		int i, len;  
		int counter[] = new int[256];  
		Scanner obj = new Scanner(System.in);  
		System.out.print("Please enter a string: ");  
		str = obj.nextLine();   
		len = str.length();    
		for (i = 0; i < len; i++)   
		{  
		counter[(int) str.charAt(i)]++;  
		}    
		for (i = 0; i < 256; i++)   
		{  
		if (counter[i] != 0)   
		{       
		System.out.println((char) i + " = " + counter[i]);  
		}  
		}  

	*/
	
	
//Question-5
		
	/*
 
 
		String s1[]={"Hello Hii"};
		String s2[]={"Hey"};
		int size=s1.length+s2.length;
		String s3[]=new String[size];
		int i3=0;
		for(int i=0;i<s1.length;i++)
		{
			s3[i3]=s1[i];
			i3++;
		}
		for(int j=0;j<s1.length;j++)
		{
			s3[i3]=s2[j];
			i3++;
		}
		for(String i:s3)
		{
			System.out.print(i+"\t");
		}
  

	*/
	
	
//Question-6

//Question-7
		
		
		String s1="hello";
		String rev="";
		for(int i=s1.length();i>0;i--)
		{
			rev[]=s1[i];
		}
		
		System.out.print(rev);
	
		
		
	}
}