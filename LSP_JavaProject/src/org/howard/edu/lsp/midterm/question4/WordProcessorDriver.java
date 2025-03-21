package org.howard.edu.lsp.midterm.question4;

import java.util.List;

/**
 * WordProcessorDriver class tests the functionality of the WordProcessor class.
 * It runs various test cases to ensure proper handling of longest words,
 * including whitespace handling and word extraction.
 * 
 * This implementation is for Midterm Question 4.
 * 
 * Author: [Oshione Adams]
 * Date: March 20, 2025
 * Version: 1.0
 */
public class WordProcessorDriver {
    public static void main(String[] args) {
        // Test case 1: Sentence with a single longest word
        WordProcessor wp1 = new WordProcessor("This is a test with amazing results, amazing achievements!");
        List<String> longestWords1 = wp1.findLongestWords();
        System.out.println("Test 1 - Longest words: " + longestWords1);  
        // Expected Output: ["achievements"]

        // Test case 2: Sentence where multiple longest words exist
        WordProcessor wp2 = new WordProcessor("Java is a powerful  tool!");
        List<String> longestWords2 = wp2.findLongestWords();
        System.out.println("Test 2 - Longest words: " + longestWords2);  
        // Expected Output: ["powerful"]

        // Test case 3: Sentence with words of the same maximum length
        WordProcessor wp3 = new WordProcessor("cat dog bird fish lion");
        List<String> longestWords3 = wp3.findLongestWords();
        System.out.println("Test 3 - Longest words: " + longestWords3);  
        // Expected Output: ["bird", "fish", "lion"]

        // Test case 4: Sentence with single-character words (should return all words as they are of equal length)
        WordProcessor wp4 = new WordProcessor("A B C D E");
        List<String> longestWords4 = wp4.findLongestWords();
        System.out.println("Test 4 - Longest words: " + longestWords4);  
        // Expected Output: ["A", "B", "C", "D", "E"]

        // Test case 5: Edge case - Empty string input (should return an empty list)
        WordProcessor wp5 = new WordProcessor("");
        List<String> longestWords5 = wp5.findLongestWords();
        System.out.println("Test 5 - Longest words: " + longestWords5);  
        // Expected Output: []
    }
}

/**
 * References:
 * - Java List documentation: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
 * - Java ArrayList class reference: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 * - Java String.split() documentation: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-
 * - Java whitespace handling best practices: https://www.w3schools.com/java/ref_string_trim.asp
 * - Midterm Question 4 expected test cases and structure.
 */
