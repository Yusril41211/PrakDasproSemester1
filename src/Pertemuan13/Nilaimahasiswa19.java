package Pertemuan13;

import java.util.Scanner;

public class Nilaimahasiswa19 {
    public static void main(String[] args) {
        Scanner yusril = new Scanner(System.in);
        System.out.print("Banyaknya nilai mahasiswa: ");
        int n = yusril.nextInt();
        int[] nilai = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = yusril.nextInt();
            total += nilai[i];
        }

        double rata2 = (double) total / n;
        int tertinggi = nilai[0], terendah = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        System.out.println("\n=== Daftar Nilai ===");
        for (int i = 0; i < n; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
        System.out.println("\nRata-rata     : " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
    }
}

