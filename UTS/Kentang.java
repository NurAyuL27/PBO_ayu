package UTS;

import java.util.Scanner;

public class Kentang extends Tanaman {

    public Kentang() {
        super("Kentang", 170); // Mengatur nama dan harga
        Scanner scanner = new Scanner(System.in);
    }

    @Override
    public void panen() {
        if (!sakit && !mati) {
            sudahPanen = true;
            System.out.println("Kentang dipanen setelah " + waktuPanen + " hari.");
        } else if (sakit) {
            System.out.println("Kentang tidak bisa dipanen karena sakit.");
        } else {
            System.out.println("Kentang sudah mati.");
        }
    }
}
