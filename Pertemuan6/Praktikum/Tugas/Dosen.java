package Pertemuan6.Praktikum.Tugas;

public class Dosen extends Pegawai{
    private int jumlahSKS;
    private final int TARIF_SKS = 120000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }

    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}
