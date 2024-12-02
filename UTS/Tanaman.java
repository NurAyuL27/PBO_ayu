package UTS;

import java.util.Random;
class Tanaman {
    protected String nama;
    protected int hariHinggaPanen;
    protected int kebutuhanAir;
    protected int kebutuhanPupuk;
    protected boolean sudahDipanen;
    protected boolean terkenaHama;
    protected int jumlahPupuk;

    public Tanaman(String nama, int hariHinggaPanen, int kebutuhanAir, int kebutuhanPupuk) {
        this.nama = nama;
        this.hariHinggaPanen = hariHinggaPanen;
        this.kebutuhanAir = kebutuhanAir;
        this.kebutuhanPupuk = kebutuhanPupuk;
        this.sudahDipanen = false;
        this.terkenaHama = false;
        this.jumlahPupuk = 0;
    }

    public boolean siapPanen() {
        return hariHinggaPanen <= 0 && jumlahPupuk >= kebutuhanPupuk;
    }

    public void tumbuh() {
        hariHinggaPanen--;
    }

    public void panen(Pemain pemain) {
        if (siapPanen()) {
            sudahDipanen = true;
            System.out.println(nama + " sudah dipanen.");
        } else {
            System.out.println(nama + " belum siap dipanen. Pastikan sudah disiram dan dipupuk.");
        }
    }

    public void tampilkanStatus() {
        System.out.println(nama + ": " + (siapPanen() ? "Siap Panen" : "Belum Siap Panen, Sisa hari: " + hariHinggaPanen + ", Kebutuhan Pupuk: " + (kebutuhanPupuk - jumlahPupuk)));
    }

    public void tampilkanStatusHama() {
        if (terkenaHama) {
            System.out.println(nama + " terkena hama!");
        } else {
            System.out.println(nama + " bebas dari hama.");
        }
    }

    public boolean isSudahDipanen() {
        return sudahDipanen;
    }

    public int getHariHinggaPanen() {
        return hariHinggaPanen;
    }

    public String getNama() {
        return nama;
    }

    public void serangHama() {
        terkenaHama = true;
    }

    public void hilangkanHama() {
        terkenaHama = false;
    }

    public void tambahPupuk() {
        jumlahPupuk++;
    }

    public int getKebutuhanPupuk() {
        return kebutuhanPupuk;
    }
}