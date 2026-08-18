package Array;

import java.util.Scanner;

public class Search{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the array size
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Array size must be greater than 0.");
            scanner.close();
            return;
        }
        // 2. Create the integer array using runtime size
        int[] numbers = new int[size];

        // 3. Read and store all array elements
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 4. Initialise minimum and maximum with the first element
        int min = numbers[0];
        int max = numbers[0];

        // 5. Traverse the remaining elements and update min/max
        for (int i = 1; i < size; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 8. Display the final minimum and maximum values
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        scanner.close();
    }
}