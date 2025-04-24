package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * IntegerSet class represents a set of integers with common set operations.
 * Duplicates are not allowed. The internal structure uses an ArrayList.
 */
public class IntegerSet {
    // Internal list to store the elements of the set
    private List<Integer> set = new ArrayList<Integer>();

    /**
     * Default constructor initializes an empty set.
     */
    public IntegerSet() {}

    /**
     * Constructor that accepts an ArrayList and initializes the set
     * without allowing duplicates.
     * @param set an ArrayList of integers
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>();
        for (int num : set) {
            if (!this.set.contains(num)) {
                this.set.add(num);
            }
        }
    }

    /**
     * Clears all elements from the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * @return number of elements
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if another object is equal to this set.
     * Two sets are equal if they contain the same elements, regardless of order.
     * @param o another object
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet other = (IntegerSet) o;
        return set.containsAll(other.set) && other.set.containsAll(set);
    }

    /**
     * Checks whether a specific value is present in the set.
     * @param value integer to check
     * @return true if value is in set, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest value in the set.
     * Throws an exception if the set is empty.
     * @return largest integer
     */
    public int largest() {
        if (set.isEmpty()) throw new RuntimeException("Set is empty");
        return Collections.max(set);
    }

    /**
     * Returns the smallest value in the set.
     * Throws an exception if the set is empty.
     * @return smallest integer
     */
    public int smallest() {
        if (set.isEmpty()) throw new RuntimeException("Set is empty");
        return Collections.min(set);
    }

    /**
     * Adds an item to the set if it is not already present.
     * @param item integer to add
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if it exists.
     * @param item integer to remove
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * Performs the union operation with another IntegerSet.
     * Modifies the current set to include all elements from both sets.
     * @param intSetb another IntegerSet
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            this.add(item);
        }
    }

    /**
     * Performs the intersection operation with another IntegerSet.
     * Modifies the current set to only keep elements also found in intSetb.
     * @param intSetb another IntegerSet
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs the set difference operation (this set - intSetb).
     * Removes elements found in intSetb from this set.
     * @param intSetb another IntegerSet
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Performs the complement operation.
     * Modifies this set to contain only the elements that are in intSetb but not in this set.
     * @param intSetb another IntegerSet
     */
    public void complement(IntegerSet intSetb) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                result.add(item);
            }
        }
        set = result;
    }

    /**
     * Checks if the set is empty.
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * Overrides the default toString method from Object.
     * @return string representation
     */
    @Override
    public String toString() {
        return set.toString();
    }
}

/**
 * References:
 * - Java Collections Framework: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 * - Java SE Documentation: https://docs.oracle.com/en/java/javase/
 * - Java Object Methods (equals, toString): https://docs.oracle.com/javase/tutorial/java/IandI/objectclass.html
 * - Eclipse Javadoc Guide: https://www.eclipse.org/documentation/
 */