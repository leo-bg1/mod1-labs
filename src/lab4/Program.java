package lab4;

public class Program {
    public static void main(String[] args) {
        int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};

        // Task 1: Find the sum
        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        System.out.println("Sum: " + sum);

        // Task 2: Find the average
        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);

        // Task 3: Find the minimum
        int minimum = numbers[0];

        for (int number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }

        System.out.println("Minimum: " + minimum);

        // Task 4: Find the maximum
        int maximum = numbers[0];

        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }

        System.out.println("Maximum: " + maximum);

        // Task 5: Find the index of zero
        int zeroIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zeroIndex = i;
                break;
            }
        }

        System.out.println("Index of zero: " + zeroIndex);
    }
}