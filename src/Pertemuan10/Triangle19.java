package Pertemuan10;

import java.util.Scanner;
public class Triangle19 {

    public static void main(String[] args) {
 
        Scanner yusril = new Scanner(System.in);
 
        System.out.print("Masukkan nilai n = "); 
        int n = yusril.nextInt();

        int i = 1;

        while (i <= n) { 
            int j = 0;
            while (j < i) { 
                System.out.print("*"); 
                j++; 
            } 
            i++; 
            System.out.println();
        }
     yusril.close();
 
    }
}