package pertemuan7.Tugas;

public class TestManusia {
    public static void main(String[] args) {
    Dosen dosen = new Dosen();
    dosen.bernapas();
    dosen.makan();
    dosen.lembur();
    System.out.println();
    Mahasiswa mhs = new Mahasiswa();
    mhs.bernapas();
    mhs.makan();
    mhs.tidur();
    }
}
   