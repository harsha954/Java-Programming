class Ax implements Runnable{
    public void run() {
        for(int i = 0; i <5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Bx extends Ax {
    public void run() {
        for(int i = 0; i <5;i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class MultiThreading2 {
    public static void main(String[] args) {
        Ax o1=new Ax();
        Bx b1=new Bx();
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(b1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t1.start();
    }
}
