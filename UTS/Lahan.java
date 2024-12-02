package UTS;
import java.util.ArrayList;
import java.util.Scanner;
class Lahan {
    private String jenisTanah;
    private int ukuran;
    private ArrayList<Tanaman> tanaman;

    public Lahan(String jenisTanah, int ukuran) {
        this.jenisTanah = jenisTanah;
        this.ukuran = ukuran;
        tanaman = new ArrayList<>();
    }

    public void tanamTanaman(Tanaman tanamanBaru) {
        if (tanaman.size() < ukuran) {
            tanaman.add(tanamanBaru);
            System.out.println(tanamanBaru.getNama() + " telah ditanam di lahan " + jenisTanah + ".");
        } else {
            System.out.println("Lahan sudah penuh.");
        }
    }

    public void siramTanaman() {
        for (Tanaman t : tanaman) {
            if (t != null) {
                t.tumbuh();
            }
        }
    }

    public void pupukTanaman() {
        for (Tanaman t : tanaman) {
            if (t != null) {
                t.tambahPupuk();
            }
        }
    }

    public void tampilkanTanaman() {
        for (Tanaman t : tanaman) {
            if (t != null) {
                t.tampilkanStatus();
            }
        }
    }

    public ArrayList<Tanaman> getTanaman() {
        return tanaman;
    }
}
