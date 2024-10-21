package pertemuan7.testkaryawan;

public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;
   
    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
   
    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
   
    public int getLembur() {
        return lembur;
    }
   
    public double getGajiLembur() {
        return gajiLembur;
    }
   
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur * gajiLembur;
    }
   
    public double getGaji() {
        return super.getGaji() + lembur * gajiLembur;
    }
   
    public void lihatInfo() {
        System.out.println("\nNIP : " + getNip());
        System.out.println("Nama : " + getNama());
        System.out.println("Golongan : " + getGolongan());
        System.out.println("Jumlah Lembur : " + getLembur());
        System.out.printf("Gaji Lembur : %.0f\n", getGajiLembur());
        System.out.printf("Gaji : %.0f\n", getGaji());
    }
}