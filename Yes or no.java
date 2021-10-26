import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int a=sc.nextInt();
    for(int i=5;i<7;i++){
        if(a==i){
            System.out.print("yes");
            break;
        }
        else if(i==6){
            System.out.print("no");
        }
    }
    }
}
