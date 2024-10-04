public class Video extends Konten {
    private int durasi;
    private String resolusi;

    public Video(String idKonten, String jenisKonten, String judul, String deskripsi, int durasi, String resolusi) {
        super(idKonten,jenisKonten, judul, deskripsi);
        this.durasi = durasi;
        this.resolusi = resolusi;
    }

    public void tampilkanKonten() {
        System.out.println("ID Konten: " + this.idKonten);
        System.out.println("Jenis Konten: " + this.jenisKonten);
        System.out.println("Judul: " + this.judul);
        System.out.println("Deskripsi: " + this.deskripsi);
        System.out.println("Durasi: " + this.durasi);
        System.out.println("Resolusi: " + this.resolusi);
        System.out.println("-----------------------------------");
    }
}