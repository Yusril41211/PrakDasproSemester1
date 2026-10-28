//P19

package Pertemuan9;

import java.util.Scanner;

public class KafeDoWhile19 {
    public static void main(String[] args) {
        Scanner yusril = new Scanner(System.in);

        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 14000; //hargaKopi = 10000 + 4 × 1000
        int hargaTeh = 8000; //5000 + 3 × 1000
        int hargaRoti = 16000; // 15000 + 1 × 1000

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = yusril.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = yusril.nextInt();
            System.out.print("Jumlah teh: ");
            teh = yusril.nextInt();
            System.out.print("Jumlah roti: ");
            roti = yusril.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            yusril.nextLine(); 
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}