import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers in each line:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println((int)Math.pow(a,b));
    }
}
