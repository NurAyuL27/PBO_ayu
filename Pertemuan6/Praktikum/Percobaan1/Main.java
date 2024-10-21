package Pertemuan6.Praktikum.Percobaan1;

class ClassA {
    public int x;
    public int y;

    public void getNilai() {
        System.out.println("nilai x: " + x);
        System.out.println("nilai y: " + y);
    }
}

class ClassB extends ClassA {
    public int z;

    public void getNilaiZ() {
        System.out.println("nilai Z: " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah : " + (x + y + z));
    }
}

public class Main {
    public static void main(String[] args) {
        ClassB hitung = new ClassB();

        hitung.x=20;
        hitung.y=30;
        hitung.z=5;
        hitung.getNilai();
        hitung.getNilaiZ();
        hitung.getJumlah();
    }
}