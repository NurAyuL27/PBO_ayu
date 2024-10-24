package UTS;
import java.util.ArrayList;
import java.util.List;

public class Pemain {
    private String nama;
    private int uang;
    private List<Tanaman> tanamanDimiliki;
    private boolean pemainSakit;

    public Pemain(String nama) {
        this.nama = nama;
        this.tanamanDimiliki = new ArrayList<>();
        this.pemainSakit = false;
    }

    public String getNama() {
        return nama;
    }

    public boolean isPemainSakit() {
        return pemainSakit;
    }

    public void setPemainSakit(boolean pemainSakit) {
        this.pemainSakit = pemainSakit;
    }

    public void istirahat() {
        if (pemainSakit) {
            pemainSakit = false;
            System.out.println(nama + " istirahat dan sekarang sembuh.");
        } else {
            System.out.println(nama + " tidak sakit dan tidak perlu istirahat.");
        }
    }

    public void tanamTanaman(Tanaman tanaman) {
        tanamanDimiliki.add(tanaman);
        System.out.println(nama + " berhasil menanam " + tanaman.nama + ".");
    }

    public void jualHasilPanen(Tanaman tanaman) {
        if (tanaman.sudahPanen) {
            tanamanDimiliki.remove(tanaman);
            System.out.println(nama + " menjual hasil panen " + tanaman.nama + " seharga " + tanaman.harga);
        } else {
            System.out.println(tanaman.nama + " belum siap dipanen.");
        }
    }

    // Method untuk mendapatkan daftar tanaman yang dimiliki oleh pemain
    public List<Tanaman> getTanamanDimiliki() {
        return tanamanDimiliki;
    }

    // Method untuk melihat semua tanaman yang dimiliki
    public void lihatTanaman() {
        System.out.println("Daftar tanaman yang dimiliki " + nama + ":");
        for (int i = 0; i < tanamanDimiliki.size(); i++) {
            System.out.println((i + 1) + ". " + tanamanDimiliki.get(i).nama);
        }
    }

    public void cekDetailTanaman(Tanaman tanaman) {
        System.out.println("Detail Tanaman " + tanaman.nama + ":");
        System.out.println("Waktu Panen: " + tanaman.waktuPanen);
        System.out.println("Kebutuhan Air: " + tanaman.kebutuhanAir);
        System.out.println("Kebutuhan Pupuk: " + tanaman.kebutuhanPupuk);
        System.out.println("Harga: " + tanaman.harga);
        tanaman.statusTanaman();
    }
}
