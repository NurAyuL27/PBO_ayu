package UTS;

public class Lahan {
    private String jenisTanah;
    private int ukuran;

    public Lahan(String jenisTanah, int ukuran) {
        this.jenisTanah = jenisTanah;
        this.ukuran = ukuran;
    }

    public void tanam(Tanaman tanaman) {
        System.out.println("Menanam " + tanaman.nama + " di lahan " + jenisTanah + ".");
    }
}
