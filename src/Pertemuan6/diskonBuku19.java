package Pertemuan6;
import java.util.Scanner;

public class diskonBuku19 {
    public static void main(String[] args) {
        Scanner yusril = new Scanner(System.in);

        System.out.print("Jenis (1=Kamus, 2=Novel, 3=Lainnya): ");
        int jenis = yusril.nextInt();
        System.out.print("Jumlah buku    : ");
        int jumlah = yusril.nextInt();
        System.out.print("Harga per buku : ");
        double harga = yusril.nextDouble();

        int diskon = 0;

        if (jenis == 1) {                   
            diskon = 12;
            if (jumlah > 3) diskon += 2;
        } else if (jenis == 2) {             
            diskon = 8;
            if (jumlah > 4) diskon += 2;
            else diskon += 1;
        } else if (jenis == 3 && jumlah > 4) { 
            diskon = 6;
        }

        double total = harga * jumlah;
        double potongan = total * diskon / 100;

        System.out.println("Diskon        : " + diskon + "%");
        System.out.println("Jumlah diskon : Rp " + potongan);
        System.out.println("Total bayar   : Rp " + (total - potongan));
    }
}