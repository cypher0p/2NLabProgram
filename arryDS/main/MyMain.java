package arryDS.main;

import arryDS.implementation.MyArrayImplementation;

public class MyMain {
    public static void main(String[] args) {
        int size = 5;
        MyArrayImplementation numbers = new MyArrayImplementation(size);
        System.out.println("insert = " + numbers.insert(2));
        System.out.println("insert = " + numbers.insert(22));
        System.out.println("insert = " + numbers.insert(7));
        System.out.println("insert = " + numbers.insert(6));
        System.out.println("insert = " + numbers.insert(5));

        numbers.traverse();
        numbers.delete();
        numbers.traverse();
        System.out.println("sorted:");
        numbers.sort();
        numbers.traverse();
        System.out.println("Searching 22 in array");
        System.out.println("Found = " + numbers.search(22));
    }
}
