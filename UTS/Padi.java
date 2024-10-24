package UTS;

import java.util.Scanner;

public class Padi extends Tanaman {

    public Padi() {
        super("Padi", 150); // Mengatur nama dan harga
        Scanner scanner = new Scanner(System.in);
    }

    public void panen() {
        if (!sakit && !mati) {
            sudahPanen = true;
            System.out.println("Padi dipanen setelah " + waktuPanen + " hari.");
        } else if (sakit) {
            System.out.println("Padi tidak bisa dipanen karena sakit.");
        } else {
            System.out.println("Padi sudah mati.");
        }
    }
}
