
public class Konten{
    protected String idKonten;
    protected String jenisKonten;
    protected String judul;
    protected String deskripsi;


    public Konten(){
        
    }
    public Konten(String idKonten, String jenisKonten, String judul, String deskripsi){
        this.idKonten = idKonten;
        this.jenisKonten =jenisKonten;
        this.judul = judul;
        this.deskripsi = deskripsi;
    }
    public String getJudul(){
        return judul;
    }

    public void tampilkanKonten(){
        System.out.println("ID Konten: " + idKonten);
        System.out.println("Jenis Konten: " + jenisKonten);
        System.out.println("Judul: " + judul);
        System.out.println("Deskripsi: " + deskripsi);
    }
}