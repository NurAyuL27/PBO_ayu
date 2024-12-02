package UTS;

import java.util.ArrayList;
import java.util.List;

class Toko {
    private int hargaPadi;
    private int hargaJagung;
    private int hargaKentang;

    public Toko() {
        hargaPadi = 10000;   // Harga jual Padi
        hargaJagung = 12000; // Harga jual Jagung
        hargaKentang = 8000; // Harga jual Kentang
    }

    public void jualHasilPanen(Tanaman tanaman, Pemain pemain) {
        if (tanaman.isSudahDipanen()) {
            int harga = 0;
            if (tanaman instanceof Padi) {
                harga = hargaPadi;
            } else if (tanaman instanceof Jagung) {
                harga = hargaJagung;
            } else if (tanaman instanceof Kentang) {
                harga = hargaKentang;
            }
            pemain.tambahUang(harga);
            System.out.println("Anda telah menjual " + tanaman.getNama() + " seharga " + harga + ". Uang Anda sekarang: " + pemain.getUang());
        } else {
            System.out.println("Tanaman belum dipanen, tidak dapat dijual.");
        }
    }
}
