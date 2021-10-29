// 1. Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
// The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
// In case the radius parameter is less than 0 it needs to set the radius field value to 0.
// Write the following methods (instance methods):
// Method named getRadius without any parameters, it needs to return the value of radius field.
// Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.

//  Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable) with name height of type double.
// The class needs to have one constructor with two parameters radius and height both of type double. It needs to call parent constructor and initialize a height field.
// In case the height parameter is less than 0 it needs to set the height field value to 0.
// Write the following methods (instance methods):
// Method named getHeight without any parameters, it needs to return the value of height field.
// Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.

// Sample OUTPUT
// circle.radius= 3.75
// circle.area= 44.178646691106465
// cylinder.radius= 5.55
// cylinder.height= 7.25
// cylinder.area= 96.76890771219959
// cylinder.volume= 701.574580913447
class Circle{
    double radius;
    Circle(double radius){
        if(radius<=0){
            this.radius=0;
        }
        else{
            this.radius=radius;
        }
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    double height;
    Cylinder(double radius,double height){
        super(radius);
        if(height<=0){
            this.height=0;
        }
        else{
            this.height=height;
        }
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return this.getArea()*this.height;
    }
}
public class Main{
    public static void main(String[] args){
        Circle circle=new Circle(3.75);
        System.out.println("Radius: "+circle.getRadius());
        System.out.println("Area: "+circle.getArea());
        Cylinder cylinder=new Cylinder(5.55,7.25);
        System.out.println("Radius: "+cylinder.getRadius());
        System.out.println("Height: "+cylinder.getHeight());
        System.out.println("Area: "+cylinder.getArea());
        System.out.println("Volume: "+cylinder.getVolume());
    }
}
// Program 2

// The Swimming Company has asked you to write an application that calculates the volume of cuboid shaped pools.
// 1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name width and length both of type double.
// The class needs to have one constructor with parameters width and length both of type double and it needs to initialize the fields.
// In case the width parameter is less than 0 it needs to set the width field value to 0.
// In case the length parameter is less than 0 it needs to set the length field value to 0.
// Write the following methods (instance methods):
// Method named getWidth without any parameters, it needs to return the value of width field.
// Method named getLength without any parameters, it needs to return the value of length field.
// Method named getArea without any parameters, it needs to return the calculated area (width * length)
// 2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field (instance variable) with name height of type double.
// The class needs to have one constructor with three parameters width, length, and height all of type double. It needs to call parent constructor and initialize a height field.
// In case the height parameter is less than 0 it needs to set the height field value to 0.
// Write the following methods (instance methods):
// Method named getHeight without any parameters, it needs to return the value of height field.
// Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.
// → OUTPUT
// rectangle.width= 5.0
// rectangle.length= 10.0
// rectangle.area= 50.0
// cuboid.width= 5.0
// cuboid.length= 10.0
// cuboid.area= 50.0
// cuboid.height= 5.0
// cuboid.volume= 250.0
class Rectangle{
    double width,length;
    public Rectangle(double width, double length){
        if (width<0)
        this.width = 0;
        if (length<0)
        this.length = 0;
        else{
        this.width = width;
        this.length = length;
        }
    }
        public double getWidth(){
            return this.width;
        }
        public double getLength(){
            return this.length;
        }
        public double getArea(){
            return this.width*this.length;
        }
    }
class Cuboid extends Rectangle{
    double height;
    public Cuboid(double width, double length, double height){
        super(width,length);
        if (height<0)
        this.height = 0;
        else{
            this.height = height;
        }
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return this.getArea()*getHeight();
    }
}
class Main{
    public static void main(String[] args){
        Cuboid cuboid = new Cuboid(5.0,10.0,50.0);
        System.out.println("The volume of the cuboid is "+cuboid.getVolume());
        Rectangle rectangle = new Rectangle(5.0,10.0);
        System.out.println("The area of the rectangle is "+rectangle.getArea());
    }
}
// Program 3
// Create a Shape interface having methods area () and perimeter ().
// Create 2 subclasses, Circle and Rectangle that implement the Shape interface.
// Create a class Sample with main method and demonstrate the area and perimeters of both the shape classes.
// You need to handle the values of length, breath, and radius in respective classes to calculate their area and perimeter.
interface Shape{
    public double getArea();
    public double getPerimeter();
}
class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}
class Rectangle implements Shape{
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
class Main{
    public static void main(String[] args){
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5, 10);
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());
        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter());
    }
}
