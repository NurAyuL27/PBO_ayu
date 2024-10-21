package pertemuan7.testkaryawan;

public class Manager extends Karyawan{
    private double tunjangan;
    private String bagian;
    private Staff st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setStaff(Staff st[]) {
        this.st = st;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void viewStaff() {
        int i;
        System.out.println("-------------------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("-------------------------------");
    }

    public void lihatInfo() {
        System.out.println("\nManager: " + getBagian());
        System.out.println("NIP : " + getNip());
        System.out.println("Nama : " + getNama());
        System.out.println("Golongan : " + getGolongan());
        System.out.printf("Tunjangan : %.0f\n", getTunjangan());
        System.out.printf("Gaji : %.0f\n", getGaji());
        System.out.println("Bagian : " + getBagian()); 
        viewStaff();
    }

    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}

