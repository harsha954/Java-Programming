// 1.please try adding, removing, updating, retrieving particular item, retrieving every data, try adding null values.
import java.util.*;
class Main {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();// Creating arraylist
        list.add(0, "Ravi");// Adding object in arraylist
        list.add(1, "Vijay");
        list.add(2, "Ravi");
        list.add(3, "Ajay");
        list.add(1, "Ravi");
        list.add(" ");
        list.add(null);
        list.remove(2);// Removing object from arraylist
        // Traversing list through Iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

// Linked List

import java.util.*;

public class Main {
    public static void main(String args[]) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Ram");
        al.add("Varun");
        al.add("Ram");
        al.add("Arun");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

// vector
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Vector<String> v = new Vector<String>();
        v.add("Ashish");
        v.add("Arun");
        v.add("Ashish");
        v.add("Rahul");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

// stack
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

// PriorityQueue
import java.util.*;

public class Main {
    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}

// ArrayDeque

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        // Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}

// HashSet

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Creating HashSet and adding elements
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        // Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

// LinkedHashSet
import java.util.*;

public class Main {
    public static void main(String args[]) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

// TreeSet
import java.util.*;  
public class TestJavaCollection9{  
public static void main(String args[]){  
//Creating and adding elements  
TreeSet<String> set=new TreeSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
//traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}

