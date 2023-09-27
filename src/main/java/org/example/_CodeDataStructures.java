package org.example;

import java.util.*;

import static java.lang.Double.valueOf;
import static java.lang.Integer.valueOf;
import static org.example.StackDemo.pop;
import static org.example.StackDemo.push;

class StackDemo {

    static void push(Stack st, int a) {
        st.push(valueOf(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void pop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

}
public class _CodeDataStructures {

    //BitSet class implements a group of bits or flags that can be set and cleared individually.

    //Vector class (same array), except that it can grow as necessary to accommodate new elements

    //Stack class implements a last-in-first-out (LIFO) stack of elements.

    //Dictionary class defines a data st
    // ructure for mapping keys to values

    //Hashtable class organize data based on user-defined key structure

    //Properties is a subclass of Hashtable.
    //It is used to maintain lists of values in which the key is a String and the value is also a String
    public static void main(String[] args) {

        //BITSET:: useful when to keep up with a set of Boolean values
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // set some bits
        for(int i = 0; i < 16; i++) {
            if((i % 2) == 0) bits1.set(i);
            if((i % 5) != 0) bits2.set(i);
        }

        // AND bits
        bits2.and(bits1);

        // OR bits
        bits2.or(bits1);

        // XOR bits
        bits2.xor(bits1);





        //VECTOR

        // initial size is 3, increment is 2
        Vector v = new Vector(3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        v.addElement(valueOf(1));
        v.addElement(valueOf(2));

        //v.contains(1)

        // enumerate the elements in the vector.
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");

        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");



        //STACK
        Stack st = new Stack();
        System.out.println("stack: " + st);
        push(st, 42);
        push(st, 66);
        pop(st);
        pop(st);
        //next pop will throw an error - stack is empty



        //DICTIONARY
        Dictionary<String, Integer> dict = new Hashtable<>();
        dict.put("Lulu", 25);
        dict.put("Timmy", 30);
        dict.put("Tara", 35);

        // Getting values from the dictionary
        int valueA = dict.get("Lulu");
        System.out.println("Value of Lulu: " + valueA);

        // Removing elements from the dictionary
        dict.remove("Tara");

        Enumeration<String> k = dict.keys();
        while (k.hasMoreElements()) {
            String key = k.nextElement();
            System.out.println("Key: " + key + ", Value: " + dict.get(key));
        }




        //HASHTABLE
        Hashtable balance = new Hashtable();

        balance.put("Zara", valueOf(3434.34));
        balance.put("Ayan", valueOf(1378.00));
        balance.put("Daisy",valueOf(99.22));

        String str;
        Enumeration names = balance.keys();
        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }








        //PROPERTIES
        Properties capitals = new Properties();

        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");

        Set states = capitals.keySet();   // get set-view of keys
        Iterator itr = states.iterator();

        while(itr.hasNext()) {
            str = (String) itr.next();
            System.out.println("The capital of " + str + " is " +
            capitals.getProperty(str) + ".");
        }
    }
}
