package Pertemuan6;
import java.util.Scanner;
public class nestedAksesLab19 {
    public static void main(String[] args) {
        Scanner yusril = new Scanner (System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

         System.out.print("mahasiswa (true/false): ");
        mahasiswaAktif = yusril.nextBoolean();

        System.out.print("sedang di sanksi(true/false): ");
        sedangDisanksi = yusril.nextBoolean();

        System.out.print("punya izin dosen(true/false): ");
        punyaIzinDosen = yusril.nextBoolean();

        System.out.print("status asisten lab(true/false): ");
        asistenLab = yusril.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("akses laboratorium diberikan");
            }else{
                System.out.println("Akses ditolak:Membutuhkan izin dosen atau status asisten lab");
            }
            
        }else{
            System.out.println("Akses ditolak:statu mahasiswa tidak memenuhi syarat");
        }
    }
    
}
