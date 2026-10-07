package Pertemuan6;
import java.util.Scanner;
public class nestedUjianSkripsi19 {
    
    public static void main(String[] args) {
        Scanner yusril = new Scanner (System.in);

        String pesan;

        System.out.println("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = yusril.nextLine().trim();

        System.out.println("Masukan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = yusril.nextInt();

        System.out.println("Masukan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = yusril.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 10 && bimbinganP2 >= 4) {
             pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";   
            }else if (bimbinganP1 < 10 && bimbinganP2 < 4){
                pesan = "Gagal! log bimbingan p1 kurang dari 10 kali dan p2 kurang dari 4 kali";
            }else if (bimbinganP1 < 10){
                pesan = "Gagal! log bimbingan p1 belum mencapai 10 kali";
            }else {
                pesan = "Gagal! Log bimbingan p2 belum mencapai 4 kali";
            }
        }else
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        System.out.println(pesan);
    }
}
