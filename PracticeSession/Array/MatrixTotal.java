import java.util.Scanner;

public class MatrixTotal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();

        for (int i = 0; i < rows; i++) {
            int rowTotal = 0;
            for (int j = 0; j < cols; j++) {
                rowTotal += scan.nextInt();
            }
            System.out.println("Row " + (i + 1) + " total: " + rowTotal);
        }

        scan.close();
    }
}