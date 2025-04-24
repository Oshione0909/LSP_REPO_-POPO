package org.howard.edu.lsp.assignment5;

/**
 * Driver class to test the functionality of the IntegerSet class.
 */
public class Driver {
    public static void main(String[] args) {
        // Create and test adding items to Set1
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Set1: " + set1.toString());
        System.out.println("Set1 Length: " + set1.length());

        // Testing smallest and largest
        System.out.println("Smallest in Set1: " + set1.smallest());
        System.out.println("Largest in Set1: " + set1.largest());

        // Check for value presence
        System.out.println("Set1 contains 2? " + set1.contains(2));
        System.out.println("Set1 contains 5? " + set1.contains(5));

        // Try adding a duplicate
        set1.add(2);
        System.out.println("Set1 after adding duplicate 2: " + set1.toString());

        // Remove a value
        set1.remove(2);
        System.out.println("Set1 after removing 2: " + set1.toString());

        // Create Set2 and perform union
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Set2: " + set2.toString());
        set1.union(set2);
        System.out.println("Set1 after union with Set2: " + set1.toString());

        // Intersect test
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.clear();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        set1.intersect(set2);
        System.out.println("Set1 after intersect with Set2: " + set1);

        // Difference test
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.clear();
        set2.add(3);
        set2.add(4);
        set1.diff(set2);
        System.out.println("Set1 after difference with Set2: " + set1);

        // Complement test
        set1.clear();
        set1.add(1);
        set1.add(2);
        set2.clear();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set1.complement(set2);
        System.out.println("Set1 after complement with Set2: " + set1);

        // Equals test
        IntegerSet set3 = new IntegerSet();
        set3.add(3);
        set3.add(4);
        System.out.println("Set1: " + set1);
        System.out.println("Set3: " + set3);
        System.out.println("Set1 equals Set3? " + set1.equals(set3));

        // isEmpty test
        System.out.println("Is Set1 empty? " + set1.isEmpty());
        set1.clear();
        System.out.println("Set1 after clear: " + set1);
        System.out.println("Is Set1 empty now? " + set1.isEmpty());
    }
}

/**
 * References:
 * - Oracle Java SE Documentation: https://docs.oracle.com/en/java/javase/
 * - Java Tutorials (equals, toString): https://docs.oracle.com/javase/tutorial/java/IandI/objectclass.html
 */

