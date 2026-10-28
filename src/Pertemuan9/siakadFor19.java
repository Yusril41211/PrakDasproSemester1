package Pertemuan9;
import java.util.Scanner;
public class siakadFor19 {

    public static void main(String[] args) {

    Scanner yusril = new Scanner (System.in);
    double nilai,tertinggi = 0,terendah = 100;
    int batasLulus = 63,lulus=0,tidakLulus=0;

    for (int i = 0; i <= 12; i++) {
        System.out.print("Masukan nilai mahasiswa ke-" + i + ":" );
        nilai = yusril.nextDouble();

        if (nilai > tertinggi) {
            tertinggi = nilai;
        }
        if (nilai < terendah) {
            terendah = nilai;
        }

        if (nilai>=batasLulus) {
            lulus++;
        } else{
            tidakLulus++;
        }
    }
    System.out.println("Nilai tertinggi: "+tertinggi);
    System.out.println("Nilai terendah: "+terendah);
    System.out.println("Siswa Lulus: "+lulus);   
    System.out.println("Siswa tidak LUlus :"+tidakLulus); 
    }
}
