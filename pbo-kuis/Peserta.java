class Peserta {
    private String idPeserta;
    private String nama;
    private String email;
    private String nomorTelepon;
    private Pembayaran pembayaran[]=new Pembayaran[10];
    private Kursus kursus[]=new Kursus[10];

    // Constructor untuk Peserta
    public Peserta(String idPeserta, String nama, String email, String nomorTelepon) {
        this.idPeserta = idPeserta;
        this.nama = nama;
        this.email = email;
        this.nomorTelepon = nomorTelepon;
    }
    
    // Getters untuk semua atribut
    public String getIdPeserta() {
        return idPeserta;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    //method untuk daftar kursus
    public void daftarKursus(Kursus kursus) {
        for (int i = 0; i < this.kursus.length; i++) {
            if (this.kursus[i] == null) {
                this.kursus[i] = kursus;
                System.out.println("Kursus "+kursus.getNama()+" berhasil ditambahkan");
                break;
            }else if (this.kursus[i] != null) {
                continue;
            }
        }
    }
    // Method untuk membayar kursus
    public void bayarKursus(Pembayaran pembayaran) {
        System.out.println(nama + " telah melakukan pembayaran pada kursus"+pembayaran.getKursus().getNama());
        for (int i = 0; i < this.pembayaran.length; i++) {
            if (this.pembayaran[i] == null) {
                this.pembayaran[i] = pembayaran;
                System.out.println("Pembayaran berhasil!");
                break;      
            }else if (this.pembayaran[i] != null) {
                continue;
            }
        }
        pembayaran.tampilkanDataPembayaran();  // Menampilkan detail pembayaran
    }
    
}