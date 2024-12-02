package UTS;

class Cuaca {
    private int suhu;

    public Cuaca(int suhu) {
        this.suhu = suhu;
    }

    public String getKondisiCuaca() {
        if (this.suhu < 20) {
            return "Hujan";
        } else if (this.suhu >= 20 && this.suhu <= 30) {
            return "Cerah";
        } else {
            return "Panas";
        }
    }

    public void tampilkanCuaca() {
        System.out.println("Kondisi cuaca: " + getKondisiCuaca());
    }

    public boolean cocokDenganCuaca(String jenisTanaman) {
        String kondisi = getKondisiCuaca();
        if (kondisi.equals("Hujan") && jenisTanaman.equalsIgnoreCase("Kentang")) {
            return true;
        } else if (kondisi.equals("Cerah") && jenisTanaman.equalsIgnoreCase("Padi")) {
            return true;
        } else if (kondisi.equals("Panas") && jenisTanaman.equalsIgnoreCase("Jagung")) {
            return true;
        }
        return false;
    }
}
