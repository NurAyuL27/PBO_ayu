package UTS;
import java.util.ArrayList;
import java.util.List;
class Pemain {
    private String nama;
    private int uang;
    private int pupuk;

    public Pemain(String nama) {
        this.nama = nama;
        this.uang = 50000;
        this.pupuk = 3;
    }

    public String getNama() {
        return nama;
    }

    public int getUang() {
        return uang;
    }

    public void tambahUang(int jumlah) {
        uang += jumlah;
    }

    public boolean gunakanPupuk() {
        if (pupuk > 0) {
            pupuk--;
            return true;
        } else {
            return false;
        }
    }
}