package Pertemuan5.Tugas;

import java.util.ArrayList;

public class Destinasi {
    private ArrayList<String> destinasiList; 
    private String lokasi;
    private double biayaMasuk;

    public Destinasi(ArrayList<String> destinasiList, String lokasi, double biayaMasuk) {
        this.destinasiList = destinasiList;
        this.lokasi = lokasi;
        this.biayaMasuk = biayaMasuk;
    }

    public double getBiayaMasuk() {
        return biayaMasuk;
    }

    public void cetak() {
        System.out.println("\nDestinasi");
        System.out.print("Destinasi yang dikunjungi   : ");
        for (String destinasi : destinasiList) {
            System.out.print(destinasi + " ");
        }
        System.out.println();
        System.out.println("Lokasi                      : " + lokasi);
        System.out.println("Biaya Masuk                 : Rp" + biayaMasuk);
    }
}
