//P19

package Pertemuan9;

import java.util.Scanner;

public class TiketBioskop19 {
    public static void main(String[] args) {
        Scanner yusril = new Scanner(System.in);

        int hargaTiket = 42000; //Harga tiket = 40000 + 1 × 2000
        int jumlah;
        int totalTiket = 0;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket pelanggan (0 untuk selesai): ");
            jumlah = yusril.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket yang valid!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }

            double diskon = 0;
            if (jumlah > 11) {
                diskon = 18;
            } else if (jumlah > 4) {
                diskon = 12;
            }

            double bayar = jumlah * hargaTiket * (1 - diskon / 100);
            totalTiket += jumlah;
            totalPenjualan += bayar;

            System.out.println("Diskon: " + diskon + "%");
            System.out.println("Total bayar pelanggan: Rp " + bayar);
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);
    }
}
