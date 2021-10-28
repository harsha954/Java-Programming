// 1. Write a program to print the names of students by creating a Student class.
// If no name is passed while creating an object of Student class, then the name should be "Unknown", 
// otherwise the name should be equal to the String value passed while creating object of Student class.
import java.util.Scanner;
class Student{
  public Student(){
    System.out.println("The student Name is Unknown");
  }
  public Student(String studentName){
    System.out.println("The student Name is: "+studentName);
  }
}
public class Main {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		Student std=new Student(sc.nextLine());
    Student std1=new Student();
    sc.close();
    }
}
// 2. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
//   First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea'
//   returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
import java.util.Scanner;
class Rectangle{
  int length;
  int bredth;
  int area;
  public void setDim(int length,int bredth){
    this.length=length;
    this.bredth=bredth;
  }
  public int getArea(){
    area=this.length*this.bredth;
    return area;
  }
}
public class Main {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Rectangle rt=new Rectangle();
    System.out.println("Enter length and breadth in each line:");
    rt.setDim(sc.nextInt(), sc.nextInt());
    System.out.println("The Area of rectangle is: "+rt.getArea());
    sc.close();
    }
}
// 3.
// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
//   Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
import java.util.Scanner;
class Student{
  String studentName;
  int rollNo;
  public Student(String studentName, int rollNo){
    this.rollNo=rollNo;
    this.studentName=studentName;
    System.out.println("The student Name is: "+studentName);
    System.out.println("The student RollNo is: "+rollNo);
  }
}
public class Main {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter student Name and RollNo :");
		Student john=new Student(sc.nextLine(),sc.nextInt());

    sc.close();
    }
}
// 4.
// Assign and print the roll number, phone number and address of two students having names "Sam" and "John"
//   respectively by creating two objects of class 'Student'.
import java.util.Scanner;
class Student{
  String Address;
  int rollNo;
  long phoneNumber;
  public Student(String Address, int rollNo,long phoneNumber){
    this.rollNo=rollNo;
    this.Address=Address;
    this.phoneNumber=phoneNumber;
    System.out.println("The student Name is: "+Address);
    System.out.println("The student RollNo is: "+rollNo);
    System.out.println("The student phoneNumber is: "+phoneNumber);
  }
}
public class Main {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter student Address, RollNo and phoneNumber seperated by each line:");
		Student sam=new Student(sc.nextLine(),sc.nextInt(),sc.nextLong());
    Student john=new Student(sc.nextLine(),sc.nextInt(),sc.nextLong());
    sc.close();
    }
}
// 5.Write a constructor in the Car class given below that initializes the brand class field with the string “Ford”.
// Call the getBrand() method in the main method of the Sample class  and store the value of the brand in a variable, and print the value.
import java.util.Scanner;
class Car{
  String brand;
  public Car(){
    this.brand="Ford";
  }
  public String getBrand(){
    return this.brand;
  }
}
public class Main {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Car car=new Car();
    String getValue=car.getBrand();
    System.out.println("The brand of a car is: "+getValue);
    sc.close();
    }
}

