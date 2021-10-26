import java.util.Scanner;
class A{
    public void swap(int x, int y) {
        System.out.println("Before--->\nx is : "+x+"\ny is : "+y);
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("After--->\nx is : "+x+"\ny is : "+y);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A obj= new A();
        obj.swap(sc.nextInt(),sc.nextInt());
    }
}
