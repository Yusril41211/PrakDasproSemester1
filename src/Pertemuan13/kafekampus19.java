package Pertemuan13;

import java.util.Scanner;

public class kafekampus19{
    static int cariMenu(String[] menu, String nama) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(nama)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                         "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        Scanner input = new Scanner(System.in);

       
        System.out.print("Cari menu: ");
        String cari = input.nextLine();
        int idx = cariMenu(menu, cari);
        if (idx != -1) {
            System.out.println(menu[idx] + " tersedia, harga Rp" + harga[idx]);
        } else {
            System.out.println("Menu \"" + cari + "\" tidak tersedia.");
        }

        System.out.print("\nJumlah item yang dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();
        String[] pesanan = new String[jumlah];   
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            int pos;
            do {
                System.out.print("Pesanan ke-" + (i + 1) + ": ");
                String nama = input.nextLine();
                pos = cariMenu(menu, nama);
                if (pos == -1) System.out.println("Menu tidak tersedia, coba lagi.");
            } while (pos == -1);                
            pesanan[i] = menu[pos];
            total += harga[pos];
        }


        System.out.println("\n========== DAFTAR PESANAN ==========");
        for (int i = 0; i < jumlah; i++) {
            int pos = cariMenu(menu, pesanan[i]);
            System.out.printf("%d. %-16s Rp%,d%n", (i + 1), pesanan[i], harga[pos]);
        }
        System.out.println("------------------------------------");
        System.out.printf("TOTAL BIAYA          Rp%,d%n", total);
    }
};

