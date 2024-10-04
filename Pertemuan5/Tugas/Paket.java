package Pertemuan5.Tugas;

public class Paket {
    private String nama;
    private double harga;
    private int durasi;
    private String fasilitas;

    public Paket(String nama, double harga, int durasi, String fasilitas) {
        this.nama = nama;
        this.harga = harga;
        this.durasi = durasi;
        this.fasilitas = fasilitas;
    }

    public double getHarga() {
        return harga;
    }

    public int getDurasi() {
        return durasi;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void cetak() {
        System.out.println("\nPaket Wisata");
        System.out.println("Nama Paket                  : " + nama);
        System.out.println("Harga                       : Rp" + harga);
        System.out.println("Durasi                      : " + durasi + " hari");
        System.out.println("Fasilitas                   : " + fasilitas);
    }
}