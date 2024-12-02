package UTS;
import java.util.Scanner;
class Waktu {
    private int hari;

    public Waktu() {
        hari = 1;
    }

    public void hariBerikutnya() {
        hari++;
    }

    public int getHari() {
        return hari;
    }
}
