package pertemuan7.Tugas;

public class TestSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("Total Sudut (satu sudut): " +
       segitiga.totalSudut(60));
        System.out.println("Total Sudut (dua sudut): " +
       segitiga.totalSudut(60, 40));
        System.out.println("Keliling : " +
       segitiga.keliling(5, 6, 7));
        System.out.println("Keliling : " +
       segitiga.keliling(6.0, 8.0));
    }
}
