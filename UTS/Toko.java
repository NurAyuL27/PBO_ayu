package UTS;

import java.util.ArrayList;
import java.util.List;

public class Toko {
    private List<Tanaman> inventoriTanaman; // Mengubah tipe dari String ke Tanaman

    public Toko() {
        this.inventoriTanaman = new ArrayList<>();
    }

    // Method untuk membeli tanaman dari toko
    public void beliTanaman(Tanaman tanaman) {
        inventoriTanaman.add(tanaman); // Menambahkan objek Tanaman ke dalam inventori
        System.out.println("Membeli tanaman " + tanaman.nama + " dari toko.");
    }

    // Method untuk menjual tanaman ke toko
    public void jualTanaman(Tanaman tanaman) {
        if (inventoriTanaman.contains(tanaman)) { // Mengecek apakah tanaman ada dalam inventori
            inventoriTanaman.remove(tanaman);
            System.out.println("Menjual tanaman " + tanaman.nama + " ke toko.");
        } else {
            System.out.println(tanaman.nama + " tidak ada di inventori tanaman.");
        }
    }

    // Method untuk melihat inventori tanaman di toko
    public void lihatInventori() {
        if (inventoriTanaman.isEmpty()) {
            System.out.println("Inventori kosong.");
        } else {
            System.out.println("Inventori tanaman di toko:");
            for (Tanaman tanaman : inventoriTanaman) {
                System.out.println("- " + tanaman.nama);
            }
        }
    }
}
