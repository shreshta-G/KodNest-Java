package Array;


    import java.util.Scanner;

public class FrequencyReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read array size
        int size = scanner.nextInt();

        // 2. Read array elements
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 3. Read target value
        int target = scanner.nextInt();

        // 4. Count frequency using one loop and one equality check
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }

        // 5. Output result matching required format
        System.out.println("Frequency of " + target + ": " + count);

        scanner.close();
    }
}
    

