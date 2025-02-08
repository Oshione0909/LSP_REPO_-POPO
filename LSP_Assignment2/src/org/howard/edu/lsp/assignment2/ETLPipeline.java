package org.howard.edu.lsp.assignment2;

import java.io.*;  // For reading/writing files
import java.nio.file.*;  // For working with file paths
import java.util.*;  // For using lists and other utilities

public class ETLPipeline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String inputFilePath = "data/products.csv";  // Input CSV file
        String outputFilePath = "data/transformed_products.csv";  // Output file

        List<String[]> records = new ArrayList<>();  // Store CSV data

        // Extract: Read data from CSV file
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            boolean headerSkipped = false;  // Skip the first line (headers)

            while ((line = br.readLine()) != null) {
                if (!headerSkipped) { 
                    headerSkipped = true;
                    continue;
                }
                String[] fields = line.split(",");  // Split CSV line into parts
                if (fields.length == 4) {
                    records.add(transform(fields));  // Apply transformations
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Load: Write transformed data to output file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            bw.write("ProductID,Name,Price,Category,PriceRange\n");  // Write header
            for (String[] record : records) {
                bw.write(String.join(",", record) + "\n");
            }
            System.out.println("Transformation complete. File saved at " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error writing the file: " + e.getMessage());
        }
    }

    // Transform function to apply changes
    private static String[] transform(String[] fields) {
        String productId = fields[0];
        String name = fields[1].toUpperCase();  // Convert name to uppercase
        double price = Double.parseDouble(fields[2]);
        String category = fields[3];

        // Apply 10% discount to Electronics category first
        if (category.equals("Electronics")) {
            price *= 0.9;
            price = Math.round(price * 100.0) / 100.0;  // Round to 2 decimal places
        }

        // Change category if price > 500
        if (category.equals("Electronics") && price > 500) {
            category = "Premium Electronics";
        }

        // Determine price range
        String priceRange = getPriceRange(price);

        return new String[]{productId, name, String.format("%.2f", price), category, priceRange};
    }

    // Determine Price Range
    private static String getPriceRange(double price) {
        if (price <= 10) return "Low";
        if (price <= 100) return "Medium";
        if (price <= 500) return "High";
        return "Premium";
    }
}

