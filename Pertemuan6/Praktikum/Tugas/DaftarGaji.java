package Pertemuan6.Praktikum.Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawai = 0;

    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
    }

    public void addPegawai(Pegawai p) {
        if (jumlahPegawai < listPegawai.length) {
            listPegawai[jumlahPegawai] = p;
            jumlahPegawai++;
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("NIP    : " + listPegawai[i].nip);
            System.out.println("Nama   : " + listPegawai[i].getNama());
            System.out.println("Alamat : " + listPegawai[i].alamat);
            System.out.println("Gaji   : " + listPegawai[i].getGaji());
            System.out.println();
        }
    }
}
