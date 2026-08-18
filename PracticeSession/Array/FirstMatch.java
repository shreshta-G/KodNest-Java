
    import java.util.Scanner;

public class FirstMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int firstIndex = -1;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                firstIndex = i;
                break;
            }
        }

        System.out.println("First index: " + firstIndex);
        scanner.close();
    }
}
    

