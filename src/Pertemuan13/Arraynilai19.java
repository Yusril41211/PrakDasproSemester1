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
int lulus = 0, tidakLulus = 0;
for (int i = 0; i < nilaiAkhir.length; i++) {
    String status;
    if (nilaiAkhir[i] > 70) { status = "LULUS"; lulus++; }
    else { status = "TIDAK LULUS"; tidakLulus++; }
    System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
}
System.out.println(" ");
System.out.println("Jumlah lulus: " + lulus);
System.out.println("Jumlah tidak lulus: " + tidakLulus);
}
    }

