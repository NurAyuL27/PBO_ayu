import java.util.Date;

public class Pembayaran {
    private String idPembayaran;
    private String metodePembayaran;
    private Date tglPembayaran;
    private Kursus kursus;

public Pembayaran(String idPembayaran, String metodePembayaran, Date tglPembayaran, Kursus kursus) {
    this.idPembayaran = idPembayaran;
    this.metodePembayaran = metodePembayaran;
    this.tglPembayaran = tglPembayaran;
    this.kursus = kursus;
}
public Kursus getKursus(){
    return this.kursus;
}
public void tampilkanDataPembayaran(){
    System.out.println("===================================");
    System.out.println("DETAIL PEMBAYARAN");
    System.out.println("===================================");
    System.out.println("ID Pembayaran: " + idPembayaran);
    System.out.println("Pembayaran kursus: " + kursus.getNama());
    System.out.println("Metode Pembayaran: " + metodePembayaran);
    System.out.println("Jumlah: " + kursus.getHarga());
    System.out.println("Tanggal Pembayaran: " + tglPembayaran);
}
}