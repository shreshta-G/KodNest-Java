import java.util.Scanner;

public class CinemaSeatAnalyzer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int row = scan.nextInt();
        int cols = scan.nextInt();
        
        int[][] matrix = new int[row][cols];
        int availableCount = 0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
                if (matrix[i][j] == 0) {
                    availableCount++;
                }
            }
        }
        
        System.out.println("Available seats: " + availableCount);
        
        scan.close();
    }
    
}
