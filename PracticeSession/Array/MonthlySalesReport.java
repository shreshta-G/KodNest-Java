import java.util.Scanner;

public class MonthlySalesReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int products = scan.nextInt();
        int months = scan.nextInt();
        
        int[][] sales = new int[products][months];
        
        for (int i = 0; i < products; i++) {
            int productTotal = 0;
            for (int j = 0; j < months; j++) {
                sales[i][j] = scan.nextInt();
                productTotal += sales[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + productTotal);
        }
        
        scan.close();
    }
    
}
