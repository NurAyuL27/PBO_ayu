package pertemuan5.Tugas;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Booking {
    private String id;
    private Date tanggal;
    private Traveler traveler;
    private Paket paket;
    private Destinasi destinasi;

    public Booking(String id, Date tanggal, Traveler traveler, Paket paket, Destinasi destinasi) {
        this.id = id;
        this.tanggal = tanggal;
        this.traveler = traveler;
        this.paket = paket;
        this.destinasi = destinasi;
    }

    public double hitungTotalBiaya() {
        return paket.getHarga() + destinasi.getBiayaMasuk();
    }

    public void cetak() {
        SimpleDateFormat outputFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy", new Locale("id", "ID"));
        String tgl = outputFormat.format(tanggal);

        System.out.println("-----------------------------------------------");
        System.out.println("                  TRIP PARIWISATA                  ");
        System.out.println("-----------------------------------------------");
        System.out.println("ID Booking                  : " + id);
        System.out.println("Tanggal Booking             : " + tgl);
        traveler.cetak();
        paket.cetak();
        destinasi.cetak();
        System.out.println("-----------------------------------------------");
        System.out.println("Total Biaya                 : Rp" + hitungTotalBiaya());
    }
}