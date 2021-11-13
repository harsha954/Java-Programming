import java.io.*;
public class FileHandling {
    public static void main(String[]args) throws Exception{
        File f =new File("abc.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Hello World");
        dos.close();
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readUTF());
        dis.close();
    }
}
