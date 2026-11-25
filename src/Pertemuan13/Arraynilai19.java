package Pertemuan13;

import java.util.Scanner;

public class Arraynilai19 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner yusril = new Scanner(System.in);

    for (int i = 0; i < nilaiAkhir.length; i++) {
    System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
    nilaiAkhir[i] = yusril.nextInt();

}
int no = 1;
for (int nilai : nilaiAkhir) {
    String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
    System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status + ")");
    no++;

}
}
    }

