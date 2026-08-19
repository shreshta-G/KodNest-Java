
    import java.util.Scanner;
    public class ArrayProblemSolvingCheckPoint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 1. Read 1D array size & elements
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        int arrayTotal = 0;
        
        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
            arrayTotal += array[i];
        }
        
        // 2. Read matrix dimensions & elements
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] matrix = new int[rows][cols];
        int matrixTotal = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scan.nextInt();
                matrixTotal += matrix[i][j];
            }
        }
        
        // Output results
        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);
        
        scan.close();
    }
}
    

