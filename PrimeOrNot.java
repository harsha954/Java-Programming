import java.util.Scanner;
class A {
    public void PrimeOrNot(int x) {
        boolean result = true;
        if(x<2){
            System.out.println("Not a prime");
        }
        else{
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                result = false;
                break;
            }
        }
        if (result == false) 
            System.out.println("Not a prime");
        else
            System.out.println("Its a prime");
    }
}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A obj = new A();
        obj.PrimeOrNot(sc.nextInt());
        sc.close();
    }
}
