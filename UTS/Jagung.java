package UTS;

import java.util.Scanner;

public class Jagung extends Tanaman {

    public Jagung() {
        super("Jagung", 130); // Mengatur nama dan harga
        Scanner scanner = new Scanner(System.in);
    }

    @Override
    public void panen() {
        if (!sakit && !mati) {
            sudahPanen = true;
            System.out.println("Jagung dipanen setelah " + waktuPanen + " hari.");
        } else if (sakit) {
            System.out.println("Jagung tidak bisa dipanen karena sakit.");
        } else {
            System.out.println("Jagung sudah mati.");
        }
    }
}
