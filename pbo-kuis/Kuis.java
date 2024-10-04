public class Kuis extends Konten {
    private int jumlahSoal;
    private int waktu;

    public Kuis(String idKonten, String jenisKonten, String judul, String deskripsi, int jumlahSoal, int waktu) {
        super(idKonten, jenisKonten, judul, deskripsi);
        this.jumlahSoal = jumlahSoal;
        this.waktu = waktu;
    }

    public void tampilkanKonten() {
        System.out.println("ID Konten: " + this.idKonten);
        System.out.println("Jenis Konten: " + this.jenisKonten);
        System.out.println("Judul: " + this.judul);
        System.out.println("Deskripsi: " + this.deskripsi);
        System.out.println("Jumlah Soal: " + this.jumlahSoal);
        System.out.println("Waktu: " + this.waktu);
        System.out.println("-----------------------------------");
    }
}