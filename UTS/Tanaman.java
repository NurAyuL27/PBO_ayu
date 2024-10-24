package UTS;

import java.util.Random;

public abstract class Tanaman {
    protected String nama;
    protected int waktuPanen;
    protected int kebutuhanAir;
    protected int kebutuhanPupuk;
    protected boolean sakit;
    protected boolean mati;
    protected int waktuMenyiram;
    protected int waktuPupuk;
    protected int harga;
    protected int banyaknyaMenanam;
    protected boolean sudahPanen;
    protected int umur;

    public Tanaman(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
        this.sakit = false;
        this.mati = false;
        this.waktuMenyiram = setWaktuMenyiramOtomatis();
        this.waktuPupuk = setWaktuMemupukOtomatis();
        this.waktuPanen = setWaktuPanenOtomatis();
        this.banyaknyaMenanam = 0;
        this.sudahPanen = false;
    }

    // Method untuk mengatur waktu menyiram secara otomatis
    private int setWaktuMenyiramOtomatis() {
        Random random = new Random();
        return random.nextInt(2) + 1; // Menghasilkan angka antara 1 hingga 4 hari untuk menyiram
    }

    private int setWaktuMemupukOtomatis() {
        Random random = new Random();
        return random.nextInt(2) + 1; // Menghasilkan angka antara 1 hingga 4 hari untuk menyiram
    }

    // Method untuk mengatur waktu panen secara otomatis
    private int setWaktuPanenOtomatis() {
        Random random = new Random();
        return random.nextInt(30) + 40; // Menghasilkan waktu panen antara 90 hingga 120 hari
    }

    public void tumbuh() {
        if (!mati) {
            if (umur >= waktuPanen && !sakit) {
                sudahPanen = true;
            } else if (kebutuhanAir > 0 && waktuMenyiram >= kebutuhanAir) {
                // Tanaman kekurangan air
                // ...
            } else if (kebutuhanPupuk > 0 && waktuPupuk >= kebutuhanPupuk) {
                // Tanaman kekurangan pupuk
                // ...
            }
        }
    }

    public abstract void panen();

    public void terkenaHama() {
        sakit = true;
        System.out.println(nama + " terkena hama!");
    }

    public void sembuh() {
        sakit = false;
        System.out.println(nama + " sembuh dari hama.");
    }

    public void siram() {
        if (mati) {
            System.out.println(nama + " sudah mati, tidak bisa disiram.");
        } else {
            Random random = new Random();
            waktuMenyiram++;
            if (random.nextInt(100) < 10) { // 10% kemungkinan terkena hama saat disiram
                terkenaHama();
            }
            System.out.println(nama + " disiram.");
        }
    }

    public void pupuk() {
        if (mati) {
            System.out.println(nama + " sudah mati, tidak bisa dipupuk.");
        } else {
            Random random = new Random();
            if (random.nextInt(100) < 5) { // 5% kemungkinan tanaman mati
                mati = true;
                System.out.println(nama + " mati setelah diberi pupuk.");
            } else {
                System.out.println(nama + " diberi pupuk.");
            }
        }
    }

    public void statusTanaman() {
        if (mati) {
            System.out.println(nama + " sudah mati.");
        } else if (sakit) {
            System.out.println(nama + " sedang sakit.");
        } else {
            System.out.println(nama + " dalam kondisi sehat.");
        }
    }

        // Di kelas Tanaman
    public void cekCuaca(Cuaca cuaca) {
        if (cuaca.getKondisi().equalsIgnoreCase("hujan")) {
            if (new Random().nextInt(100) < 20) {  // 20% kemungkinan hama saat hujan
                terkenaHama();
            }
        } else if (cuaca.getKondisi().equalsIgnoreCase("kemarau")) {
            if (new Random().nextInt(100) < 15) {  // 15% kemungkinan hama saat kemarau
                terkenaHama();
            }
        }
    }
}
