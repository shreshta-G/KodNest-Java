import java.util.Scanner;

public class DailyAttendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int classes = scanner.nextInt();
        int days = scanner.nextInt();
        
        int[][] attendance = new int[classes][days];
        
        // Read the matrix elements
        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < days; j++) {
                attendance[i][j] = scanner.nextInt();
            }
        }
        
        // Column-wise traversal to calculate total attendance for each day
        for (int j = 0; j < days; j++) {
            int dayTotal = 0;
            for (int i = 0; i < classes; i++) {
                dayTotal += attendance[i][j];
            }
            System.out.println("Day " + (j + 1) + " total: " + dayTotal);
        }
        
        scanner.close();
    }
    
}
