import java.util.Scanner;

public class lab113 {
    public static void main(String[] args) {
        // Create a Scanner object to receive input from the user
        Scanner readValue = new Scanner(System.in);

        // --- 1. Get R (Number of Rows) and C (Number of Columns) ---
        // Prompt message to enter R and C
        System.out.println("Please enter the number of rows (R) and the number of columns (C):");
        
        // Check if two integers are available for R
        if (!readValue.hasNextInt()) {
            System.out.println("Invalid input for R. Please enter an integer.");
            readValue.close();
            return;
        }
        int R = readValue.nextInt(); // Number of rows
        
        // Check if two integers are available for C
        if (!readValue.hasNextInt()) {
            System.out.println("Invalid input for C. Please enter an integer.");
            readValue.close();
            return;
        }
        int C = readValue.nextInt(); // Number of columns

        // Define the size of the 2D array
        int[][] serverGrid = new int[R][C];
        int onlineCount = 0; // Variable to count Online servers (value 1)

        // Prompt message to enter the Grid data
        System.out.println("Please enter the server status (0 or 1) for " + R + " rows, with " + C + " characters per row:");

        // --- 2. Receive R * C status data and count Online servers ---
        
        // Loop to receive values row by row
        for (int i = 0; i < R; i++) {
            
            // Receive the status data for all servers in row i as a String (e.g., "1101")
            if (!readValue.hasNext()) {
                System.out.println("Incomplete server status data.");
                readValue.close();
                return;
            }
            String rowInput = readValue.next();
            
            // Check if the length of the input matches the number of columns C
            if (rowInput.length() != C) {
                 System.out.println("Error: Data length in row " + (i + 1) + " does not match C (" + C + ").");
                 readValue.close();
                 return;
            }

            // Loop to read each digit in the String
            for (int j = 0; j < C; j++) {
                // Convert char '0' or '1' to int
                char statusChar = rowInput.charAt(j);
                int status = Character.getNumericValue(statusChar);

                // Check if the received value is 0 or 1
                if (status == 1) {
                    serverGrid[i][j] = 1;
                    onlineCount++; // If the value is 1, increment the count
                } else if (status == 0) {
                    serverGrid[i][j] = 0;
                } else {
                    System.out.println("Error: Status must be 0 or 1 only.");
                    readValue.close();
                    return;
                }
            }
        }

        // --- 3. Display the result ---
        System.out.println("\n--- Result ---");
        System.out.println("Total number of Online servers (Output): " + onlineCount);

        // Close the Scanner
        readValue.close();
}
}