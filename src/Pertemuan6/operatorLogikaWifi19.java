package Pertemuan6;
import java.util.Scanner; 
public class operatorLogikaWifi19 {
    public static void main(String[] args) {
        Scanner yusril = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;
        

        System.out.println("Apakah pengguna mahasiswa? (true/false)");
        mahasiswa = yusril.nextBoolean();

        System.out.println("Apakah pengguna dosen? (true/false)");
        dosen = yusril.nextBoolean();

        System.out.println("Apakah akun sedang diblokir? (true/false)");
        akunDiblokir = yusril.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan.");
        } else {
            System.out.println("Akses WiFi ditolak.");            
        }
    }
}
