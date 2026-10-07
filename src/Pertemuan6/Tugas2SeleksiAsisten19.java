package Pertemuan6;

import java.util.Scanner;

public class Tugas2SeleksiAsisten19 {
    public static void main(String[] args) {
        Scanner yusril = new Scanner(System.in);

        System.out.print("Berstatus aktif (true/false): ");
        boolean aktif = yusril.nextBoolean();
        System.out.print("Terkena sanksi (true/false): ");
        boolean sanksi = yusril.nextBoolean();

        if (aktif && !sanksi) {
            System.out.print("Nilai Dasar Pemrograman: ");
            int nilai = yusril.nextInt();
            System.out.print("Punya sertifikat (true/false): ");
            boolean sertifikat = yusril.nextBoolean();

            if (nilai >= 83 || sertifikat) {
                System.out.println("Dipanggil untuk wawancara");
                System.out.print("Nilai wawancara: ");
                int wawancara = yusril.nextInt();

                if (wawancara >= 78) {
                    System.out.println("Diterima sebagai asisten");
                } else {
                    System.out.println("Mahasiswa gagal pada tahap wawancara");
                }
            } else {
                System.out.println("Gagal nilai kurang dari 83 dan tidak punya sertifikat");
            }
        } else {
            System.out.println("Gagal karena tidak ber status aktif atau sedang terkena sanksi");
        }

    }
}