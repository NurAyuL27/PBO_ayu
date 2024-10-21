package Pertemuan6.Praktikum.Tugas;

public class Main {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("D001", "Dr. Ahmad", "Jl. Merdeka");
        dosen1.setSKS(12);

        Dosen dosen2 = new Dosen("D002", "Prof. Budi", "Jl. Kencana");
        dosen2.setSKS(15);

        DaftarGaji daftarGaji = new DaftarGaji(2);

        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        daftarGaji.printSemuaGaji();
    }
}
