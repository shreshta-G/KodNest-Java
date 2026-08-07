package KODNEST;

import java.util.Scanner;

public class Scannerp1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the byte value :");
        byte a = scan.nextByte();
        System.out.println("Byte values is " + a);

        System.out.println("Enter the short value :");
        short b = scan.nextShort();
        System.out.println("Short values is " + b);

        System.out.println("Enter the Integer value :");
        int c = scan.nextInt();
        System.out.println("Integer values is " + c);

        System.out.println("Enter the long values :");
        long d = scan.nextLong();
        System.out.println("Long values is " + d);

        System.out.println("Enter the float values :");
        float e = scan.nextFloat();
        System.out.println("Float values is " + e);

        System.out.println("Enter the Double values :");
        double f = scan.nextDouble();
        System.out.println("Double values is" + f);

        System.out.println("Enter Boolean values :");
        boolean g = scan.nextBoolean();
        System.out.println("Boolean values is : " + g);

    }

}
