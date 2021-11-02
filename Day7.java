//1. Create a encapsulation class with employee details name,id,designation, experience and do the following operations
// 1. Read and display all the data 
// 2. Update the experience of employee 
// 3. Pass the values from main method 
class Employee{
    private String name,designation;
    private int id, experience;

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Designation: "+designation);
        System.out.println("ID: "+id);
        System.out.println("Experience: "+experience);
    }
    public void setExperience(int experience){
        this.experience=experience;
        name="Harsha";
        designation="Software Engineer";
        id=1;
    }
}

class Main{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.setExperience(5);
        e1.display();

}
}

// 2.Create a program where login credentials are hidden and secure it by not providing access for other classes to modify or read the data directly.

class LoginCredentials
{
    private String username;
    private String password;
    
    public LoginCredentials(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
}
class Login
{
    public static void main(String[] args)
    {
        LoginCredentials credentials = new LoginCredentials("admin", "admin");
        System.out.println("Username: " + credentials.getUsername());
        System.out.println("Password: " + credentials.getPassword());
    }
}

// 3. Create a class monkey with jump ( ) and bite ( ) methods
// Create a class human whichinherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods 
class Monkey{
    public void jump(){
        System.out.println("Monkey is jumping");
    }
    public void bite(){
        System.out.println("Monkey is biting");
    }
}
interface basicanimal{
    public void eat();
    public void sleep();
}
class Human extends Monkey implements basicanimal{ 
    public void eat(){
        System.out.println("Human is eating");
    }
    public void sleep(){
        System.out.println("Human is sleeping");
    }
}
class Main{
    public static void main(String[] args){
        Human h = new Human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();
    }
}

// 4.Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods
// create another class smart telephone and demonstrate polymorphism
abstract class telephone{
    abstract public void lift();
    abstract public void disconnected();
}
class SmartPhone1{
    public void lift(){
        System.out.println("SmartPhone1 is lifting");
    }
    public void disconnected(){
        System.out.println("SmartPhone1 is disconnected");
    }
    //overloading
    public void lift(String s){
        System.out.println("SmartPhone is lifting "+s);
    }
    public void disconnected(String s){
        System.out.println("SmartPhone is disconnected "+s);
    }
}

class Smartphone2 extends SmartPhone1{
    @Override
        public void lift(){
            System.out.println("SmartPhone2 is lifting");
        }
        @Override
        public void disconnected(){
            System.out.println("SmartPhone2 is disconnected");
        }
    }
class Main{
    public static void main(String[] args){
        SmartPhone1 s1 = new Smartphone2();
        s1.lift();
        s1.disconnected();
        s1.lift("Hello");
        s1.disconnected("Hello");
        Smartphone2 s2 = new Smartphone2();
        s2.lift();
        s2.disconnected();
        s2.lift("Hello");
        s2.disconnected("Hello");

    }
}
