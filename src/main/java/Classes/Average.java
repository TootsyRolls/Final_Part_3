package Classes;

import java.util.Scanner;

public class Average {
    private int[] data;
    private double mean;

    Scanner input = new Scanner(System.in);

    public Average() {
        data = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a score: ");
            data[i] = input.nextInt();

            selectionSort();
            calculateMean();
        }
    }
    public void selectionSort() {
        for (int i = 0; i < 5 - 1; i++) {
            int max = i;
            for (int j = i + 1; j < 5; j++) {
                if (data[j] > data[max]) {
                    max = j;
                }
            }
            int temp = data[max];
            data[max] = data[i];
            data[i] = temp;
        }
    }

    public void calculateMean() {
        int sum = 0;
        for (int score : data) {
            sum += score;
        }
        mean = (double) sum / 5;
    }

    public String toString() {
    }
}
