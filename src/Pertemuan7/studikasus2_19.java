package Pertemuan7;

import java.util.Scanner;

public class studikasus2_19 {
    public static void main(String[] args) {
        Scanner yusril = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = yusril.nextLine();

        System.out.print("BELMAWA/BAKORMA/Mandiri : ");
        String jenis = yusril.nextLine();

        String status;

        if (jenis.equalsIgnoreCase ("BELMAWA")|| jenis.equalsIgnoreCase ("BAKORMA") || jenis.equalsIgnoreCase ("Mandiri")) {       
        
            System.out.print("Masukan jumlah dokumen : ");
            int dokumen = yusril.nextInt();

            System.out.print("Peringkat juara (isi 0 jika tidak juara) : ");
            int juara = yusril.nextInt();

            if (juara>=1 && juara <= 3) {
                if (dokumen == 4) {
                    status = "Dokumen Lengkap dan Juara "+ juara + " Dana penghargaan diberikan";
                }else{
                    int kurang = 4-dokumen;
                  status = "Dokumen tidak lengkap (kurang " + kurang
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Bukan juara 1,2,3. Dana penghargaan tidak diberikan";
            }
            System.out.println("Status : " + status);
        }

        
    }   
    
}
