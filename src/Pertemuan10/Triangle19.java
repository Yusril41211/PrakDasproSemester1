package Pertemuan10;

import java.util.Scanner;
public class Triangle19 {

    public static void main(String[] args) {
 
        Scanner yusril = new Scanner(System.in);
 
        System.out.print("Masukkan nilai n = "); 
        int n = yusril.nextInt();

        int i = n;
                          
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
 
        yusril.close();
 
    }
}