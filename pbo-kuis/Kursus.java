public class Kursus {
    private String idKursus;
    private String namaKursus;
    private String deskripsi;
    private int durasi;
    private int harga;
    private Kuis kuis[] = new Kuis[2];
    private Video video[] = new Video[10];
    private Artikel artikel[] = new Artikel[5];
    private Peserta peserta [] = new Peserta[2];
    private Instruktur instruktur[] = new Instruktur[5];

    public Kursus(String idKursus, String namaKursus, String deskripsi, int durasi, int harga) {
        this.idKursus = idKursus;
        this.namaKursus = namaKursus;
        this.deskripsi = deskripsi;
        this.durasi = durasi;
        this.harga = harga;
    } 

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
    public int getDurasi() {
        return durasi;
    }
    public String getNama(){
        return namaKursus;
    }
    public Kursus getKursus(){
        return this;
    }
    public int getHarga(){
        return harga;
    }

    public void tampilkanDetailKursus() {
        System.out.println("===================================");
        System.out.println("Detail Kursus");
        System.out.println("===================================");
        System.out.println("ID Kursus: " + this.idKursus);
        System.out.println("Nama Kursus: " + this.namaKursus);
        System.out.println("Deskripsi: " + this.deskripsi);
        System.out.println("Durasi: " + this.durasi);
        System.out.println("Harga: " + this.harga);
        System.out.println("-----------------------------------");
        System.out.println("Instruktur");
        System.out.println("-----------------------------------");
        for (int index = 0; index < this.instruktur.length; index++) {
            if (instruktur[0]==null) {
                System.out.println("Belum ada instruktur yang terdaftar pada kursus ini");
                break;
            }else if (instruktur[index]!=null) {
                instruktur[index].tampilkanProfil();
            }
        }
        System.out.println("-----------------------------------");

        System.out.println("Konten");
        System.out.println("-----------------------------------");
        System.out.println("Kuis :");
        for (int index = 0; index < this.kuis.length; index++) {
            if (kuis[0]==null) {
                System.out.println("Belum ada kuis yang terdaftar pada kursus ini");
                break;
            }else if (kuis[index]!=null) {
                kuis[index].tampilkanKonten();
            }
        }
        System.out.println("Video :");
        for (int index = 0; index < this.video.length; index++) {
            if (video[0]==null) {
                System.out.println("Belum ada video yang terdaftar pada kursus ini");
                break;
            }else if (video[index]!=null) {
                video[index].tampilkanKonten();
            }
        }
        System.out.println("Artikel :");
        for (int index = 0; index < this.artikel.length; index++) {
            if (artikel[0]==null) {
                System.out.println("Belum ada artikel yang terdaftar pada kursus ini");
                break;
            }else if (artikel[index]!=null) {
                artikel[index].tampilkanKonten();
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("Peserta");
        System.out.println("-----------------------------------");
        for (int index = 0; index < this.peserta.length; index++) {
            if (peserta[0]==null) {
                System.out.println("Belum ada peserta yang mendaftar pada kursus ini");
                break;
            }else if (peserta[index]!=null) {
                System.out.println(index+1+ " " + peserta[index].getNama());
            }
        }
        System.out.println("===================================");
        System.out.println();
        System.out.println();
    }

    public void tambahVideo(Video video) {
        for (int index = 0; index < this.video.length; index++) {
            if (this.video[index]!=null) {
                if (this.video.length-1==index) {
                    System.out.println("Maaf jumlah video sudah pada batas maksimal!");
                }else{
                    continue;
                }
            }else{
                this.video[index] = video;
                System.out.println("video berhasil dimasukkan");
                break;
            }
        }
    }
    public void tambahArtikel(Artikel artikel) {
        for (int index = 0; index < this.artikel.length; index++) {
            if (this.artikel[index]!=null) {
                if (this.artikel.length-1==index) {
                    System.out.println("Maaf jumlah artikel sudah pada batas maksimal!");
                }else{
                    continue;
                }
            }else{
                this.artikel[index] = artikel;
                System.out.println("artikel berhasil dimasukkan");
                break;
            }
        }
    }

    public void tambahKuis(Kuis kuis) {
        for (int index = 0; index < this.kuis.length; index++) {
            if (this.kuis[index]!=null) {
                if (this.kuis.length-1==index) {
                    System.out.println("Maaf jumlah kuis sudah pada batas maksimal!");
                }else{
                    continue;
                }
            }else{
                this.kuis[index] = kuis;
                System.out.println("kuis berhasil dimasukkan");
                break;
            }
        }
    }

    public void tambahPeserta(Peserta peserta){
        for (int index = 0; index < this.peserta.length; index++) {
            if (this.peserta[index]!=null) {
                if (this.peserta.length-1==index) {
                    System.out.println("Maaf jumlah peserta sudah pada batas maksimal!");
                }else{
                    continue;
                }
            }else{
                this.peserta[index] = peserta;
                System.out.println("peserta berhasil dimasukkan");
                break;
            }
        }
    }
   
    public void tambahkanInstruktur(Instruktur instruktur){
        for (int index = 0; index < this.instruktur.length; index++) {
            if (this.instruktur[index]!=null) {
                if (this.instruktur.length==index) {
                    System.out.println("Maaf jumlah instruktur sudah pada batas maksimal!");
                }else{
                    continue;
                }
            }else{
                this.instruktur[index] = instruktur;
                System.out.println("instruktur berhasil dimasukkan");
                break;
            }
        }
    }
}