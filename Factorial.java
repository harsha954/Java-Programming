import java.util.Scanner;
class A {
    public int Factorial(int x) {
        if(x==0)
        return 1;
        else
        return x* Factorial(x-1);
}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A obj = new A();
        System.out.println(obj.Factorial(sc.nextInt()));
        sc.close();
    }
}
