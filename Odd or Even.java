//odd nums followed by even nums:
public class Main{
    public static void main(String[] args){
        System.out.println("Even Numbers");
        for(int i=1;i<15;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("Even Numbers");
        for(int i=1;i<=15;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
