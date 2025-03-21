package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * VotingMachine class manages candidate voting and determines the election winner.
 * It ensures only registered candidates receive votes and tracks vote counts.
 * This implementation is for Midterm Question 3.
 *
 * Author: Oshione Adams
 * Date: March 20, 2025
 * Version: 1.0
 */
public class VotingMachine {
    // Map to store candidate names and their vote counts
    private Map<String, Integer> candidates;

    /**
     * Constructor initializes the candidate map.
     * The HashMap is used for efficient lookup and modification of candidate votes.
     */
    public VotingMachine() {
        candidates = new HashMap<>(); // Initializes an empty candidate list
    }

    /**
     * Adds a new candidate to the voting machine.
     * If the candidate is already present, this method does nothing to prevent overwriting vote counts.
     * 
     * @param name The name of the candidate.
     */
    public void addCandidate(String name) {
        candidates.putIfAbsent(name, 0); // Ensures candidate starts with 0 votes and prevents duplicates
    }

    /**
     * Casts a vote for a given candidate if they exist.
     * If the candidate is not found, the vote is rejected.
     * 
     * @param name The candidate's name.
     * @return true if the vote was successful, false if the candidate does not exist.
     */
    public boolean castVote(String name) {
        if (candidates.containsKey(name)) { // Checks if candidate exists in the voting system
            candidates.put(name, candidates.get(name) + 1); // Increments the vote count
            return true;
        }
        return false; // Vote rejected if candidate is not in the system
    }

    /**
     * Determines and returns the winner of the election.
     * Iterates through the candidate map to find the one with the highest vote count.
     * 
     * @return A string announcing the winner and their vote count.
     */
    public String getWinner() {
        String winner = null;
        int maxVotes = 0;

        // Iterate through each candidate to find the one with the highest votes
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        // Return result message
        return winner != null ? winner + " WINS with " + maxVotes + " votes!!" : "No winner";
    }
}

/**
 * References:
 * - Java Map documentation: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
 * - Java HashMap reference: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
 * - putIfAbsent method: https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#putIfAbsent-K-V-
 * - Java Collections Framework best practices: https://www.oracle.com/java/technologies/javase/collections-overview.html
 * - Midterm exam instructions and structure provided in class.
 */
