public class Instruktur {
    private String idInstruktur;
    private String nama;
    private String spesialisasi;
    private String email;

    public Instruktur(String idInstruktur, String nama, String spesialisasi, String email) {
        this.idInstruktur = idInstruktur;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.email = email;
    }
    
    public void tampilkanProfil() {
        System.out.println("ID Instruktur: " + idInstruktur);
        System.out.println("Nama: " + nama);
        System.out.println("Spesialisasi: " + spesialisasi);
        System.out.println("Email: " + email);
    }
}
