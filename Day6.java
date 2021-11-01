// 1. sort a linked list in Java? 
// remove duplicates from a sorted linked list

class LinkedListNode {
    int data;
    LinkedListNode next;
    LinkedListNode(int d) {
        data = d;
        next = null;
    }
}
class LinkedList {
    LinkedListNode head;
    LinkedListNode tail;
    LinkedList() {
        head = null;
        tail = null;
    }
    void add(int d) {
        LinkedListNode newNode = new LinkedListNode(d);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    void print() {
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void sort() {
        LinkedListNode temp = head;
        LinkedListNode prev = null;
        LinkedListNode next = null;
        while (temp != null) {
            next = temp.next;
            while (next != null) {
                if (temp.data > next.data) {
                    int tempData = temp.data;
                    temp.data = next.data;
                    next.data = tempData;
                }
                next = next.next;
            }
            prev = temp;
            temp = temp.next;
        }
    }
    void removeDuplicates() {
        LinkedListNode temp = head;
        while (temp != null) {
            LinkedListNode runner = temp;
            while (runner.next != null) {
                if (runner.next.data == temp.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            temp = temp.next;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(14);
        ll.add(52);
        ll.add(63);
        ll.add(34);
        ll.add(775);
        ll.add(34);
        ll.print();
        ll.sort();
        ll.removeDuplicates();
        ll.print();

    } 
}
// 2. find the length of a singly linked list?

import java.util.*;
import java.util.LinkedList;   
public class Abc {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(24);
        list.add(53);
        list.add(94);
        System.out.println(list.size());
    }
// }
// 3. remove Nth Node from the end of a linked list?
  
import java.util.*;
import java.util.LinkedList;   
public class Abc {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(24);
        list.add(53);
        list.add(94);
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=list.size()-n;
        list.remove(a);
        System.out.println(list);
        sc.close();
    }
}
// 4.Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message'
//   that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.
  
abstract class Parent{
    public abstract void message();
}
class A extends Parent{
    public void message(){
        System.out.println("This is sub-class 1");
    }
}
class B extends Parent{
    public void message(){
        System.out.println("This is sub-class 2");
    }
}

class Main{
    public static void main(String[] args){
        Parent p = new A();
        p.message();
        p = new B();
        p.message();
    }
}
// 5. Create a list and add 10 values to the list . Perform edit any element, add new element , remove an element and print the final list
  
  import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.set(4, 40);
        list.add(2, 20);
        list.remove(3);
        System.out.println(list);

    }
}
