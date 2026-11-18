package Pertemuan13;

import java.util.Arrays;

public class Arraybilangan19 {
    public static void main(String[] args) {
        int bil[] = new int [4];

        bil[0] = 19;
        bil[1] = 27;
        bil[2] = 4;
        bil[3] = 24;

    for (int i = 0; i < bil.length; i++) {
 System.out.println("bil[" + i + "] = " + bil[i]);
}

for (int nilai : bil) {
 System.out.println(nilai);
}
System.out.println(Arrays.toString(bil));

    }
}
