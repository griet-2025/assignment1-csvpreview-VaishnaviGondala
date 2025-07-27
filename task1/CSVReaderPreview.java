package task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderPreview {

    public static void main(String[] args) {
        // TO DO: Write your code below 
        String filePath = "dataset/dataset.csv";
        String r;
        String d = ",";
        try (BufferedReader reader = new BufferedReader(new FileReader(FP))) {

                    String headerRow = reader.readLine();
                    if (headerRow == null) {
                        System.out.println("This is Empty!!.");
                        return;
                    }

                    System.out.println("=== Preview ===\n");

                    // Display column headers
                    String[] columnHeaders = headerRow.split(d);
                    System.out.println("Columns:");
                    for (String header : columnHeaders) {
                        System.out.print(header + " ");
                    }
                    System.out.println("\nTotal columns: " + columnHeaders.length);
                    System.out.println("\nFirst 5 Records:\n");

                    int recordCount = 0;

                    // Read and display the first 5 data rows
                    while ((r= reader.readLine()) != null && recordCount < 5) {
                        String[] recordFields = r.split(d);
                        System.out.println(String.join(" ", recordFields));
                        recordCount++;
                    }

                    // Count the remaining records
                    while (reader.readLine() != null) {
                        recordCount++;
                    }

                    System.out.println("\nTotal Records (excluding header): " + recordCount);

                } catch (IOException exception) {
                    System.err.println("An error occurred while reading the file:");
                    exception.printStackTrace();
                }
            }
        }
        
    }
}
