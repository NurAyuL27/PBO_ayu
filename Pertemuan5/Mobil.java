package pertemuan5;

public class Mobil {
    private String merk;
    private int biaya;

    public Mobil() {
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}

class Sopir{
    private String nama;
    private int biaya;

    public Sopir() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}

class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Pelanggan() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}

class Penyewaan {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private Sopir sopir;

    public Penyewaan() {
    }

    public Penyewaan(Pelanggan pelanggan, Mobil mobil, Sopir sopir) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.sopir = sopir;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public int hitungTotalBiaya(int hari) {
        int biayaMobil = mobil.hitungBiayaMobil(hari);
        int biayaSopir = sopir.hitungBiayaSopir(hari);
        return biayaMobil + biayaSopir;
    }

    public void infoPenyewaan() {
        System.out.println("Pelanggan: " + pelanggan.getNama());
        System.out.println("Mobil yang disewa: " + mobil.getMerk());
        System.out.println("Sopir: " + sopir.getNama());
        System.out.println("Biaya total penyewaan untuk " + pelanggan.getHari() + " hari: " + hitungTotalBiaya(pelanggan.getHari()));
    }
}

class MainPercobaan2 {
    public static void main(String[] args) {
    Mobil m = new Mobil();
    m.setMerk("Avanza");
    m.setBiaya(350000);

    Sopir s = new Sopir();
    s.setNama("John Doe");
    s.setBiaya(200000);

    Pelanggan p = new Pelanggan();
    p.setNama("Jane Doe");
    p.setMobil(m);
    p.setSopir(s);
    p.setHari(2);

    Penyewaan sewa = new Penyewaan(p, m, s);
    sewa.infoPenyewaan();
    }
}
