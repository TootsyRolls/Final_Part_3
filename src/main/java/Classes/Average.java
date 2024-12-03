package Classes;

import java.util.Scanner;

public class Average {
    // Array and mean data fields
    private int[] data;
    private double mean;

    Scanner input = new Scanner(System.in);

    public Average() {
        data = new int[5]; // Array Size
        // For loop to input 5 values
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter score " + (i+1) + ": ");
            data[i] = input.nextInt();

            selectionSort(); // Sorts values into descending order
            calculateMean(); // Finds middle value
        }
    }

    public void selectionSort() {
        // For Loop to sort max -> min values
        for (int i = 0; i < 5 - 1; i++) {
            int max = i;
            for (int j = i + 1; j < 5; j++) { // Checks if data at j > max
                if (data[j] > data[max]) {
                    max = j; // If so then replace data at j is new max
                }
            }
            int temp = data[max]; // Value at the index of data[max] is passed on temp
            data[max] = data[i]; // Value at the index of data[i] is passed on max
            data[i] = temp; // Value of temp replaces data[i]
        }
    }

    public void calculateMean() {
        int sum = 0;
        for (int score : data) {
            sum += score; // For loop that adds all scores
        }
        mean = (double) sum / 5; // Gives mean
    }

    public String toString() {
        String ans = "Score in descending order: ";
        for (int score : data) {
            ans += score + " ";
        }
        ans += "\nMean: " + String.format("%.2f", mean); // Adds new line Mean: XX.XX
        return ans;
    }
}
