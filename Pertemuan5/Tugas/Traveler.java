package pertemuan5.Tugas;

public class Traveler {
    private String id;
    private String nama;
    private int usia;
    private String noTelp;

    public Traveler(String id, String nama, int usia, String noTelp) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.noTelp = noTelp;
    }

    public void cetak() {
        System.out.println("\nData Traveler");
        System.out.println("ID Traveler                 : " + id);
        System.out.println("Nama Traveler               : " + nama);
        System.out.println("Usia                        : " + usia + " tahun");
        System.out.println("No Telp                     : " + noTelp);
    }
}
