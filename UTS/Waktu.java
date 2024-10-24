package UTS;

public class Waktu {
    private int hari;

    public Waktu() {
        this.hari = 0;
    }

    public void majuHari(int jumlahHari) {
        hari += jumlahHari;
        System.out.println("Hari telah maju sebanyak " + jumlahHari + " hari. Sekarang hari ke-" + hari);
    }

    public int getHari() {
        return hari;
    }
    
}
