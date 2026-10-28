//p19
package Pertemuan9;

import java.util.Scanner;

public class Parkirkendaraan19 {
    public static void main(String[] args) {
        Scanner yusril = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis (1 = mobil, 2 = motor, 0 = keluar): ");
            jenis = yusril.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi (jam): ");
                durasi = yusril.nextInt();

                if (jenis == 1) {
                    total += durasi * 2750; // Tarif parkir mobil = 2500 + 1 × 250 per jam
                } else {
                    total += durasi * 1750; //Tarif parkir motor = 1500 + (P mod 6) × 250 per jam
                }
            }
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
    }
}
