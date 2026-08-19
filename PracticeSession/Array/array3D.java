
import java.util.Scanner;
public class array3D {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a[][][]=new int[3][3][5];
        System.out.println("enter Array Elements : ");
        for(int i=0; i<=a.length-1; i++){
            for(int j=0; j<=a[i].length-1; j++){
                for( int k=0; k<=a[i][j].length-1; k++){
                    a[i][j][k]=scan.nextInt();

                }}
            }
        System.out.println("Array Elements are : ");
        for(int i=0; i<=a.length-1; i++){
            for(int j=0; j<=a[i].length-1; j++){
                for( int k=0; k<=a[i][j].length-1; k++){
                    System.out.println(a[i][j][k]+" " );
                }
                System.out.println();
            }
            System.out.println();
        }
        scan.close();
    }
}

