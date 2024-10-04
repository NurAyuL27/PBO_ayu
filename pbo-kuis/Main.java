import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("Selamat Datang di Aplikasi Kursus Online!");
        System.out.println("===========================================");

        // Menambahkan beberapa kursus
        Kursus kursusJavascript = new Kursus("JS001", "Javascript Fundamental", "Belajar Javascript Fundamental", 3, 100000);
        Kursus kursusJava = new Kursus("J001", "Java Fundamental", "Belajar Java Fundamental", 3, 100000);

        // Membuat objek video, kuis, artikel untuk kursus Java
        Kuis kuis = new Kuis("K001", "Kuis", "Kuis Java", "Kuis minggu 4", 10, 120);
        Video video = new Video("V001", "Video", "Video Java", "Video penjelasan", 10, "720p");
        Artikel artikel = new Artikel("A001", "Artikel", "Menjelaskan seputar class dan object pada pemrograman Java", "Class dan Object", "Ayu", "Jurnal pendidikan");

        // Menambahkan konten ke kursus Java
        kursusJava.tambahArtikel(artikel);
        kursusJava.tambahVideo(video);
        kursusJava.tambahKuis(kuis);

        // Membuat objek instruktur untuk kursus Java
        Instruktur instrukturAyu = new Instruktur("I001", "Ayu", "Pemrograman", "ayu@gmail.com");
        kursusJava.tambahkanInstruktur(instrukturAyu);

        // Membuat objek peserta
        Peserta pesertaAlfin = new Peserta("P001", "Alfin", "Alfin1234@example.com", "085123456789");
        Peserta pesertaBudi = new Peserta("P002", "Budi", "Budi1234@example.com", "085123418299");
        Peserta pesertaAsta = new Peserta("P003", "Asta", "Asta1234@example.com", "091280128012");
        
        // Menambah peserta ke kursus Java
        kursusJava.tambahPeserta(pesertaAlfin);
        kursusJava.tambahPeserta(pesertaBudi);

        // Kondisi penambahan saat kelas sudah penuh
        System.out.println("---saat kelas sudah penuh---");
        kursusJava.tambahPeserta(pesertaAsta);

        // Menampilkan detail kursus Java dan kursus Javascript yang kosong
        System.out.println("=========================================");
        System.out.println("Kursus yang memiliki peserta dan konten:");
        kursusJava.tampilkanDetailKursus();
        
        System.out.println("Kursus yang kosong (peserta dan konten belum dimasukkan):");
        System.out.println("=========================================");
        kursusJavascript.tampilkanDetailKursus();

        // Mengubah durasi kursus Javascript
        System.out.println("=========================================");
        System.out.println("Durasi kursus Javascript sebelum diubah: " + kursusJavascript.getDurasi());
        kursusJavascript.setDurasi(5);
        System.out.println("Durasi kursus Javascript setelah diubah: " + kursusJavascript.getDurasi());
        System.out.println("=========================================");

        // Peserta 1 mendaftar pada kursus Java
        pesertaAlfin.daftarKursus(kursusJava);
        System.out.println("---------------------------------------");

        // Peserta 1 melakukan pembayaran untuk kursus Java
        Date tglPembayaran = new Date();
        Pembayaran pembayaran = new Pembayaran("P001", "Transfer", tglPembayaran, kursusJava);
        pesertaAlfin.bayarKursus(pembayaran);
        
        System.out.println("=========================================");
    }
}
