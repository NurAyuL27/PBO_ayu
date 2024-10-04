package Pertemuan6.teori;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Masukkan panjang Persegi Panjang: ");
        float panjang = scanner.nextFloat();
        System.out.print("Masukkan lebar Persegi Panjang: ");
        float lebar = scanner.nextFloat();
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        System.out.print("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.print("Keliling Persegi Panjang: " + persegiPanjang.keliling());
    
        System.out.print("Masukkan jari jari Lingkaran: ");
        float r = scanner.nextFloat();
        Lingkaran lingkaran = new Lingkaran(r);
        System.out.print("Luas Lingkaran: " + lingkaran.luas());
        System.out.print("Keliling Lingkaran: " + lingkaran.keliling());

        System.out.print("Masukkan aalas Segitiga: ");
        float alas = scanner.nextFloat();
        System.out.print("Masukkan tinggi Segitiga: ");
        float tinggi = scanner.nextFloat();
        Segitiga segitiga = new Segitiga(alas, tinggi);
        System.out.print("Luas Segitiga: " + segitiga.luas());
        System.out.print("Keliling Segitiga: " + segitiga.keliling());
    }
}
