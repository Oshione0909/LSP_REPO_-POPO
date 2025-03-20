package org.howard.edu.lsp.midterm.question3;

/**
 * VotingMachineTest class tests the functionality of the VotingMachine class.
 * It simulates adding candidates, casting votes, checking for invalid votes,
 * and determining the winner based on the highest vote count.
 * 
 * This implementation is for Midterm Question 3.
 * 
 * Author: [Your Name]
 * Date: March 20, 2025
 * Version: 1.0
 */
public class VotingMachineTest {
    public static void main(String[] args) {
        // Create a new instance of VotingMachine
        VotingMachine vm = new VotingMachine();

        // Adding candidates to the election
        vm.addCandidate("Alice");    // Alice is added to the candidate list
        vm.addCandidate("Bob");      // Bob is added to the candidate list
        vm.addCandidate("Charlie");  // Charlie is added to the candidate list

        // Casting votes for valid candidates
        vm.castVote("Alice");   // Alice gets 1 vote
        vm.castVote("Alice");   // Alice gets 2 votes
        vm.castVote("Bob");     // Bob gets 1 vote
        vm.castVote("Charlie"); // Charlie gets 1 vote
        vm.castVote("Charlie"); // Charlie gets 2 votes
        vm.castVote("Charlie"); // Charlie gets 3 votes

        // Attempting to vote for a non-existent candidate
        boolean success = vm.castVote("Eve"); // Should be false, as Eve is not a candidate
        System.out.println("Vote for Eve successful? " + success); // Expected Output: false

        // Displaying the election results
        System.out.println("Winner: " + vm.getWinner()); // Expected Output: Charlie WINS with 3 votes!!
    }
}

/**
 * References:
 * - Java HashMap class documentation: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
 * - Java boolean return values: https://www.w3schools.com/java/ref_keyword_boolean.asp
 * - Java System.out.println usage: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/print.html
 * - Midterm exam instructions and example test cases.
 */
