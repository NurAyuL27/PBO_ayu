public class Konten {
        private String idKonten;
        private String jenisKonten;
        private String judul;
        private String deskripsi;
    
        // Constructor
        public Konten(String idKonten, String jenisKonten, String judul, String deskripsi) {
            this.idKonten = idKonten;
            this.jenisKonten = jenisKonten;
            this.judul = judul;
            this.deskripsi = deskripsi;
        }
    
        // Method untuk menampilkan detail konten
        public void tampilkanKonten() {
            System.out.println("ID Konten: " + idKonten);
            System.out.println("Jenis Konten: " + jenisKonten);
            System.out.println("Judul: " + judul);
            System.out.println("Deskripsi: " + deskripsi);
    }
}
