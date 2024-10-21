package pertemuan5.Tugas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Trip {
    public static void main(String[] args) {
        Traveler traveler = new Traveler("T001", "Budi Santoso", 30, "08123456789");
        Paket paket = new Paket("Paket Liburan Pantai", 1500000, 3, "Transportasi, Akomodasi, Makan");
        
        ArrayList<String> destinasiList = new ArrayList<>();
        destinasiList.add("Pantai Indah");
        destinasiList.add("Gunung Ceremai");
        destinasiList.add("Kota Tua");
        Destinasi destinasi = new Destinasi(destinasiList, "Jawa Barat", 50000);

        Booking booking = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date tanggalBooking = sdf.parse("2024-10-01");
            booking = new Booking("B001", tanggalBooking, traveler, paket, destinasi);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (booking != null) {
            booking.cetak();
        }
    }
}
