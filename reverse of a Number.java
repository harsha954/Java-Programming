import java.util.Scanner;
class A {
    public int Reverse(int x) {
        int reverse=0;
        int a=0;
        while(x>0){
            a=x%10;
            reverse=reverse*10+a;
            x/=10;
        }
        return reverse;
}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A obj = new A();
        System.out.println(obj.Reverse(sc.nextInt()));
        sc.close();
    }
}
