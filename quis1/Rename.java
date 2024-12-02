package minggu08;

import java.util.Scanner;

public class MainSimulasiPertanian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("    SELAMAT DATANG DI GAME SIMULASI PERTANIAN!    ");
        System.out.println("==================================================");
        System.out.print("Masukkan username untuk login: ");
        String username = scanner.nextLine();

        while (username.isEmpty()) {
            System.out.println("Username tidak boleh kosong, silakan coba lagi.");
            System.out.print("Masukkan username: ");
            username = scanner.nextLine();
        }

        Pemain pemain = new Pemain(username);
        System.out.println("Login berhasil! \nSelamat datang, " + pemain.getNama() + ".");
        System.out.println("==============================");
        System.out.println("Uang awal Anda: " + pemain.getUang());

        Lahan lahan = new Lahan("Humus");
        Waktu waktu = new Waktu();
        Toko toko = new Toko();
        Cuaca cuaca = new Cuaca();
        cuaca.tampilkanCuaca();

        boolean bermain = true;

        // Menu pemilihan tanaman
        while (bermain) {
            Tanaman tanaman1 = null, tanaman2 = null;
            boolean tanamanValid = false;

            while (!tanamanValid) {
                System.out.println("==================================================");
                System.out.println("                   PILIHAN TANAMAN                ");
                System.out.println("==================================================");
                System.out.println("Pilih tanaman yang ingin Anda tanam:");
                System.out.println("1. Padi 2 lahan (5 hari hingga panen)");
                System.out.println("2. Jagung 2 lahan (4 hari hingga panen)");
                System.out.println("3. Sayuran 2 lahan (3 hari hingga panen)");
                System.out.println("4. Keluar");
                System.out.println("==================================================");
                System.out.print("Pilih : ");

                int pilihanTanaman = scanner.nextInt();

                switch (pilihanTanaman) {
                    case 1:
                        if (cuaca.getKondisiCuaca().equals("Panas")) {
                            System.out.println("Tidak bisa menanam Padi karena ini adalah cuaca sedang panas.");
                        } else {
                            tanaman1 = new Padi();
                            tanaman2 = new Padi();
                            System.out.println("Anda memilih untuk menanam Padi.\n");
                            tanamanValid = true;
                        }
                        break;
                    case 2:
                        if (cuaca.getKondisiCuaca().equals("Hujan")) {
                            System.out.println("Tidak bisa menanam Jagung karena ini adalah cuaca sedang hujan.");
                        } else {
                            tanaman1 = new Jagung();
                            tanaman2 = new Jagung();
                            System.out.println("Anda memilih untuk menanam Jagung.\n");
                            tanamanValid = true;
                        }
                        break;
                    case 3:
                        if (cuaca.getKondisiCuaca().equals("Hujan")) {
                            System.out.println("Tidak bisa menanam Sayuran karena ini adalah cuaca sedang hujan.");
                        } else {
                            tanaman1 = new Sayuran();
                            tanaman2 = new Sayuran();
                            System.out.println("Anda memilih untuk menanam Sayuran.\n");
                            tanamanValid = true;
                        }
                        break;
                    case 4:
                        System.out.println("Terima kasih telah bermain! Anda keluar dari permainan.");
                        bermain = false;
                        tanamanValid = true; // Supaya keluar dari loop pilihan tanaman
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Coba lagi.");
                        continue;
                }
            }

            if (!bermain) {
                break; // Hentikan loop jika pemain memilih keluar
            }

            lahan.tanamTanaman(tanaman1, cuaca);
            lahan.tanamTanaman(tanaman2, cuaca);

            boolean sudahMenyiram = false;
            boolean sudahMemupuk = false;

            while (bermain) {
                System.out.println("\n==================================================");
                System.out.println("Hari ke-" + waktu.getHari() + " | Uang: " + pemain.getUang() + " | Pupuk: "
                        + pemain.getPupuk() + " | Cuaca: "
                        + cuaca.getKondisiCuaca());
                System.out.println("==================================================");
                System.out.println("==================================================");
                System.out.println("                 MENU GAME PERTANIAN              ");
                System.out.println("==================================================");
                System.out.println("Pilih tindakan: ");
                System.out.println("1. Siram Tanaman");
                System.out.println("2. Pupuk Tanaman");
                System.out.println("3. Lihat Status Tanaman");
                System.out.println("4. Panen Tanaman");
                System.out.println("5. Beli Barang di Toko");
                System.out.println("6. Lihat Inventori");
                System.out.println("7. Tanam Tanaman Baru");
                System.out.println("8. Pulihkan Energi");
                System.out.println("9. Berantas Hama");
                System.out.println("10. Keluar");
                System.out.println("==================================================");
                System.out.print("Pilih : ");

                int pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        // Opsi menyiram tanaman
                        if (lahan.getTanaman()[0] != null && !lahan.getTanaman()[0].siapPanen()) { // Pastikan
                                                                                                   // menggunakan ()
                            // untuk metode siapPanen
                            if (!sudahMenyiram) {
                                lahan.siramTanaman();
                                sudahMenyiram = true;
                                System.out.println("\nAnda telah menyiram tanaman.");
                            } else {
                                System.out.println("Anda sudah menyiram tanaman hari ini.\n");
                            }
                        } else {
                            // Jika tanaman sudah dipanen, tampilkan pesan peringatan
                            System.out.println(
                                    "Maaf, tanaman sudah dipanen. Silahkan tanam tanaman baru.");
                        }
                        break;

                    case 2:
                        // Opsi memupuk tanaman
                        if (lahan.getTanaman()[1] != null && !lahan.getTanaman()[1].siapPanen()) { // Gunakan () untuk
                                                                                                   // metode
                            // siapPanen
                            if (pemain.gunakanPupuk()) { // Cek apakah pupuk masih ada
                                lahan.pupukTanaman();
                                sudahMemupuk = true;
                                System.out
                                        .println(
                                                "\nAnda telah memupuk tanaman.\nPupuk tersisa: " + pemain.getPupuk()
                                                        + "\n");
                            } else {
                                System.out.println("Anda tidak memiliki pupuk. Silakan beli pupuk di toko.");
                            }
                        } else {
                            // Jika tanaman sudah dipanen, tampilkan pesan peringatan
                            System.out.println(
                                    "Maaf, tanaman sudah dipanen. Silahkan tanam tanaman baru.");
                        }
                        break;

                    case 3:
                        // Lihat status tanaman yang telah ditanam
                        if (tanaman1 != null) {
                            tanaman1.tampilkanStatus();
                            tanaman1.tampilkanStatusHama();
                        } else {
                            System.out.println("Belum ada tanaman 1 yang ditanam.");
                        }

                        if (tanaman2 != null) {
                            tanaman2.tampilkanStatus();
                            tanaman2.tampilkanStatusHama();
                        } else {
                            System.out.println("Belum ada tanaman 2 yang ditanam.");
                        }
                        break;

                    case 4:
                        // Cek apakah tanaman1 siap dipanen sebelum memanen
                        if (tanaman1.siapPanen()) {
                            if (!tanaman1.isSudahDipanen()) { // Cek apakah tanaman1 sudah dipanen
                                System.out.println(tanaman1.getNama() + " dipanen!");
                                pemain.tambahKeInventori(tanaman1.getNama());
                                tanaman1.panen(pemain); // Tanaman dipanen dan uang ditambahkan
                            } else {
                                System.out.println(tanaman1.getNama() + " sudah dipanen sebelumnya."); // Pesan jika
                                                                                                       // sudah dipanen
                            }
                        } else {
                            System.out.println(tanaman1.getNama() + " belum bisa dipanen. Hari ke-" + waktu.getHari() +
                                    ", harus menunggu hingga hari ke-" +
                                    (tanaman1.getHariHinggaPanen()) + ".");
                        }

                        // Cek apakah tanaman2 siap dipanen sebelum memanen
                        if (tanaman2.siapPanen()) {
                            if (!tanaman2.isSudahDipanen()) { // Cek apakah tanaman2 sudah dipanen
                                System.out.println(tanaman2.getNama() + " dipanen!");
                                pemain.tambahKeInventori(tanaman2.getNama());
                                tanaman2.panen(pemain); // Tanaman dipanen dan uang ditambahkan
                            } else {
                                System.out.println(tanaman2.getNama() + " sudah dipanen sebelumnya."); // Pesan jika
                                                                                                       // sudah dipanen
                            }
                        } else {
                            System.out.println(tanaman2.getNama() + " belum bisa dipanen. Hari ke-" + waktu.getHari() +
                                    ", harus menunggu hingga hari ke-" +
                                    (tanaman2.getHariHinggaPanen()) + ".");
                        }
                        break;

                    case 5:
                        System.out.println("==================================================");
                        System.out.println("                 TOKO PERTANIAN                   ");
                        System.out.println("==================================================");
                        System.out.println("Pilih barang yang ingin dibeli:");
                        System.out.println("1. Pupuk (Harga: 10000 per unit)");
                        System.out.println("2. Pestisida (Harga: 15000 per unit");
                        System.out.println("3. Kembali Ke Menu");
                        System.out.println("==================================================");
                        System.out.print("Pilih : ");
                        int pilihanBarang = scanner.nextInt();

                        switch (pilihanBarang) {
                            case 1:
                                // Beli pupuk
                                System.out.print("Berapa banyak pupuk yang ingin Anda beli? ");
                                int jumlahPupuk = scanner.nextInt();
                                int totalHarga = jumlahPupuk * 10000;
                                if (pemain.getUang() >= totalHarga) {
                                    pemain.kurangiUang(totalHarga);
                                    pemain.tambahPupuk(jumlahPupuk);
                                    System.out.println("Anda telah membeli " + jumlahPupuk + " pupuk.");
                                } else {
                                    System.out.println("Uang Anda tidak cukup untuk membeli pupuk sebanyak itu.");
                                }
                                break;
                            case 2:
                                // Beli pestisida
                                System.out.print("Berapa banyak pestisida yang ingin Anda beli? ");
                                int jumlahPestisida = scanner.nextInt();
                                int totalHargaPestisida = jumlahPestisida * 15000;
                                if (pemain.getUang() >= totalHargaPestisida) {
                                    pemain.kurangiUang(totalHargaPestisida);
                                    pemain.tambahPestisida(jumlahPestisida);
                                    System.out.println("Anda telah membeli " + jumlahPestisida + " pestisida.");
                                } else {
                                    System.out.println("Uang Anda tidak cukup untuk membeli pestisida sebanyak itu.");
                                }
                                break;

                            case 3:
                                System.out.println("Kembali ke menu utama.");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                        break;

                    case 6:
                        pemain.lihatInventori();
                        break;

                    case 7: // Opsi untuk menanam tanaman baru
                        System.out.println("==================================================");
                        System.out.println("Pilih tanaman yang ingin Anda tanam:");
                        System.out.println("1. Padi 2 lahan (5 hari hingga panen)");
                        System.out.println("2. Jagung 2 lahan (4 hari hingga panen)");
                        System.out.println("3. Sayuran 2 lahan (3 hari hingga panen)");
                        System.out.println("4. Kembali Ke Menu");
                        System.out.println("==================================================");
                        System.out.print("Pilih : ");

                        int pilihanTanamanBaru = scanner.nextInt();
                        Tanaman tanamanBaru1 = null, tanamanBaru2 = null;

                        switch (pilihanTanamanBaru) {
                            case 1: // Padi
                                if (cuaca.getKondisiCuaca().equals("Panas")) {
                                    System.out.println("Tidak bisa menanam Padi karena ini adalah cuaca sedang panas.");
                                } else {
                                    tanamanBaru1 = new Padi();
                                    System.out.println("Anda memilih untuk menanam Padi.\n");
                                }
                                break;
                            case 2: // Jagung
                                if (cuaca.getKondisiCuaca().equals("Hujan")) {
                                    System.out
                                            .println("Tidak bisa menanam Jagung karena ini adalah cuaca sedang hujan.");
                                } else {
                                    tanamanBaru1 = new Jagung();
                                    System.out.println("Anda memilih untuk menanam Jagung.\n");
                                }
                                break;
                            case 3: // Sayuran
                                if (cuaca.getKondisiCuaca().equals("Hujan")) {
                                    System.out.println(
                                            "Tidak bisa menanam Sayuran karena ini adalah cuaca sedang hujan.");
                                } else {
                                    tanamanBaru1 = new Sayuran();
                                    System.out.println("Anda memilih untuk menanam Sayuran.\n");
                                }
                                break;
                            case 4:
                                System.out.println("Kembali ke menu utama.");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid. Coba lagi.");
                                continue;
                        }
                        break;

                    case 8: // Pilihan untuk memulihkan energi
                        System.out.println("Anda memilih untuk memulihkan energi.\n");
                        pemain.pulihkanEnergi(50); // Tambah energi, misalnya 50 poin
                        System.out.println("Energi Anda telah pulih. Energi saat ini: " + pemain.getEnergi());
                        break;
                    case 9:
                        boolean hamaDitemukan = false;
                        for (Tanaman t : lahan.getTanaman()) {
                            if (t != null && t.isTerkenaHama()) { // Cek apakah tanaman terkena hama
                                hamaDitemukan = true;
                                if (pemain.gunakanPestisida()) { // Cek apakah ada stok pestisida
                                    t.setTerkenaHama(false); // Hilangkan hama dari tanaman
                                    System.out.println("Hama pada tanaman " + t.getNama() + " berhasil diberantas!");
                                } else {
                                    System.out.println("Maaf, Anda tidak memiliki stok pestisida.");
                                    break; // Keluar dari loop jika tidak ada pestisida
                                }
                            }
                        }

                        if (!hamaDitemukan) {
                            System.out.println("Tidak ada tanaman yang terkena hama.");
                        }
                        break;

                    case 10: // Keluar dari permainan
                        System.out.println("Terima kasih telah bermain! Anda keluar dari permainan.");
                        bermain = false;
                        break;

                    default:
                        System.out.println("Pilihan tidak valid.");
                }

                // Cek jika sudah menyiram dan memupuk untuk melanjutkan ke hari berikutnya
                if (sudahMenyiram && sudahMemupuk) {
                    waktu.lewatiHari(); // Hari bertambah setelah kedua tindakan dilakukan
                    cuaca.acakCuaca(); // Setiap hari cuaca diacak
                    cuaca.tampilkanCuaca(); // Cuaca berubah setelah hari bertambah
                    pemain.tambahEnergi(10); // Energi bertambah setiap hari
                    System.out.println("Energi Anda saat ini: " + pemain.getEnergi());

                    // Kurangi hari hingga panen untuk setiap tanaman
                    tanaman1.kurangiHariHinggaPanen();
                    tanaman2.kurangiHariHinggaPanen();

                    // Reset status menyiram dan memupuk untuk hari berikutnya
                    sudahMenyiram = false;
                    sudahMemupuk = false;
                }

                pemain.kurangiEnergi(10); // Energi pemain berkurang setiap tindakan
                if (pemain.getEnergi() <= 0) {
                    System.out.println(
                            "Energi Anda habis, Anda harus memulihkan energi.");
                }
            }
            scanner.close();
        }
    }
}