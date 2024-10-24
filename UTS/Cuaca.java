package UTS;

import java.util.Random;

public class Cuaca {
    private String kondisi;
    private int suhu;

    public Cuaca(String kondisi, int suhu) {
        this.kondisi = kondisi;
        this.suhu = suhu;
    }

    public void ubahCuaca(String kondisiBaru, int suhuBaru) {
        this.kondisi = kondisiBaru;
        this.suhu = suhuBaru;
        System.out.println("Cuaca berubah menjadi " + kondisi + " dengan suhu " + suhu + " derajat.");
    }

    // Di kelas Waktu
    public void ubahCuacaSecaraBerkala(Cuaca cuaca) {
        String[] kondisiCuaca = {"Cerah", "Hujan", "Kemarau"};
        int suhuBaru = new Random().nextInt(30) + 20;
        String kondisiBaru = kondisiCuaca[new Random().nextInt(kondisiCuaca.length)];
        cuaca.ubahCuaca(kondisiBaru, suhuBaru);
        System.out.println("Cuaca berubah secara otomatis setelah maju hari.");
    }

    public String getKondisi() {
        return kondisi;
    }
}
