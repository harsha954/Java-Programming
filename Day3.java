//1.Write a Java program to calculate the average value of array elements
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int avg=0;
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        avg=sum/array.length;
        System.out.println(avg);
    }
}
// 2.Write a Java program to test if an array contains a specific value. 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array = {1,2,3,4,5,6};
        int input=sc.nextInt();
        Boolean find=false;
        for(int i: array){
            if (i==input){
                find=true;
                break;
        }
    }
    System.out.println(find);
    sc.close();
// 3.Write a Java program to remove a specific element from an array.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array = {1,2,3,4,5,6};
        System.out.println("Enter index value to be removed ?");
        int input=sc.nextInt();
        for(int i = 0; i < array.length; i++){
            if(array[i] == input){
              for(int j = i; j < array.length - 1; j++){
                  array[j] = array[j+1];
              }
              break;
            }
          }
        System.out.println(Arrays.toString(array));
    sc.close();
}
}
// 4. Write a Java program to find the common elements between two arrays (string values)
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] array={"apple","ball","mango","pen"};
        String[] array1={"ball","pen","kite","pig"};
        for(String i: array){
            for(String j: array1){
                if(i==j){
                    System.out.println(i);
                    break;
                }
            }
        }
}
}
// 5.Write a Java program to find the second largest element in an array.
public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[1]);

    }
}
//6. Check if the string is palindrome or not
class Main{
    public static void main(String[] args){
        String s="mom";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        System.out.println(s.equals(s1));
    }
}      
	    
// 7. Reverse the string 
	    public class Main {
	public static void main(String[] args)
	{
		String str = "Hello World...";
		StringBuffer s = new StringBuffer(str);
		s.reverse();
		System.out.println(s);
	}
}

//8. Print the pattern 1
// **
// **
// **
// **

import java.util.*
;class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("**");
        }
        sc.close();
    }
}
// 9. Print the pattern 2
// *
// **
// *
import java.util.*
;class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0)
            System.out.println("*");
            else
            System.out.println("**");
        }
        sc.close();
    }
}
	    
// 11.print the pattern 4
// 1234
// 123
// 12
//1
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        sc.close();
    }
}

// 12. Print the pattern 5
// *
// **
// *
// **
// **
// *
// **
// *
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        int i = 0;
        while (m < n) {
            if (i == 5) {
                i = 0;
            }
            if (i == 0) {
                System.out.println("*");
            }
            if (i == 1) {
                System.out.println("**");
            }
            if (i == 2) {
                System.out.println("*");
            }
            if (i == 3) {
                System.out.println("**");
            }
            if (i == 4) {
                System.out.println("**");
            }
            i += 1;
            m += 1;

        }
        sc.close();
    }
}
// 12. Print the pattern 5
// 1234
// 123
// 12
// 1
// 12
// 123
// 1234
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        sc.close();

    }
}
// 13. Print the pattern 6
// 1
// 2 3
// 4 5 6
// 7 8 9 10
import java.util.Scanner;
public class Main
{
	public static void printNums(int n)
	{
		int i, j, num=1;
		for(i=0; i<n; i++)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print(num+ " ");
				num = num + 1;
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); ;
		printNums(n);
        sc.close();
	}
}


// 14. Print the pattern 7 
// * * * $
// * * $ *
// * $ * *
// $ * * *

public class Main
{
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==m){
                    System.out.print("$");
                }
                else
                System.out.print("* ");
            }
            m-=1;
            System.out.print("\n");
            
        }
	}
}
// 15. Sort elements in array :

public class Main {
    public static void main(String args[]) {
        int[] arr = { 1, 23, 6, 25, 85 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}

// 16. Write a Java program to check if an array of integers contains two specified elements 6 and 25


public class Main
{
	public static void main(String args[])
	{
        int[] array = {1,23,6,25,85};
        int count=0;
        for(int i:array){
            if(i==6){
                count+=1;
            }
            if(i==25){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("array contains 6 and 25");
            
        }
        else
        System.out.println("array not contains 6 and 25");
	}
}

// 17. Write a program to find the product of all elements of an array.

public class Main
{
	public static void main(String args[])
	{
        int[] array ={1,3,4,8,6};
        int total=1;
        for(int i:array){
            total*=i;
        }
        System.out.println(total);
	}
}



// 18. Use 5 to 6 string inbuilt functions and write a program each 
// Eg : write separate program for toUpperCase()
public class Main
{
	public static void main(String args[])
	{
		String s1="Hello";
        String s2="World";
        System.out.println(s1.charAt(2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains(s2));
        System.out.println(s1.endsWith(s2));
        System.out.println(s1.startsWith(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.hashCode());
        System.out.println(s1.indexOf("wo"));
        System.out.println(s1.lastIndexOf("wo"));
        System.out.println(s1.isEmpty());
        System.out.println(s1.length());
        System.out.println(s1.replace("wo", "kk"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
	}
}

      
