public class Artikel extends Konten {
    private String penulis;
    private String sumber;

    public Artikel(String idKonten, String jenisKonten, String deskripsi, String judul, String penulis, String sumber) {
        super(idKonten,jenisKonten, judul, deskripsi);
        this.penulis = penulis;
        this.sumber = sumber;
    }

    public void tampilkanKonten() {
        System.out.println("ID Konten: " + this.idKonten);
        System.out.println("Jenis Konten: " + this.jenisKonten);
        System.out.println("Judul: " + this.judul);
        System.out.println("Deskripsi: " + this.deskripsi);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("Sumber: " + this.sumber);
        System.out.println("-----------------------------------");
    }
}