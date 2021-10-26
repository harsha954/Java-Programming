class A{
    public boolean show(int ...a){
        return a[0]+a[1]==a[2];
}
}
public class Main{
    public static void main(String[] args){
        A obj=new A();
        System.out.println(obj.show(5,6,10));
    }
}
