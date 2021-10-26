import java.util.Scanner;
class A {
    public void PerfectNum(int x) {
        int sum=0;
        for(int i = 1; i<x;i++){
            if(x%i==0)
            sum+=i;
        }
        if(sum==x)
        System.out.println("Perfect Number");
        else
        System.out.println("Not perfect Number");
}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A obj = new A();
        obj.PerfectNum(sc.nextInt());
        sc.close();
    }
}
