package Pertemuan7;

import java.util.Scanner;

public class studikasus1_19 {
    public static void main(String[] args) {
        Scanner yusril = new Scanner(System.in);
        
        int hargaPercup = 16000;
        int jumlahCup,uangBayar;
        int totalHarga,diskon,totalBayar;
        int kembalian,kurang;

        System.out.print("masukan Jumlah cup : ");
        jumlahCup = yusril.nextInt();
        System.out.print("Masukan uang bayar : ");
        uangBayar = yusril.nextInt();

        totalHarga = jumlahCup * hargaPercup;
        diskon = 0;

        if (totalHarga >= 120000) {
            diskon = totalHarga * 6 / 100;
        } 

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga : " + totalHarga);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total bayar : " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian : " + kembalian);
        }else{
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp." + kurang);
        }
    }
}
