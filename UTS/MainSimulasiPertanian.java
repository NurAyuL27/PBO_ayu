package UTS;

import java.util.Scanner;

public class MainSimulasiPertanian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("         SELAMAT DATANG DI GAME PERTANIAN!        ");
        System.out.println("==================================================");
        System.out.print("Masukkan username untuk login: ");
        String username = scanner.nextLine();

        Pemain pemain = new Pemain(username);
        System.out.println("Login berhasil! Selamat datang, " + pemain.getNama() + ".");

        System.out.println("Pilih jenis tanah:");
        System.out.println("1. Tanah Liat");
        System.out.println("2. Tanah Pasir");
        System.out.println("3. Tanah Berpasir");
        System.out.println("4. Tanah Hitam");
        System.out.print("Masukkan pilihan jenis tanah (1-4): ");
        int pilihanTanah = scanner.nextInt();
        scanner.nextLine();

        String jenisTanah;
        switch (pilihanTanah) {
            case 1:
                jenisTanah = "Tanah Liat";
                break;
            case 2:
                jenisTanah = "Tanah Pasir";
                break;
            case 3:
                jenisTanah = "Tanah Berpasir";
                break;
            case 4:
                jenisTanah = "Tanah Hitam";
                break;
            default:
                jenisTanah = "Tanah Liat";
                break;
        }

        Lahan lahan = new Lahan(jenisTanah, 10);
        boolean bermain = true;

        System.out.print("Masukkan suhu awal: ");
        int suhuCuaca = scanner.nextInt();
        scanner.nextLine();
        Cuaca cuaca = new Cuaca(suhuCuaca);
        cuaca.tampilkanCuaca();

        while (bermain) {
            System.out.println("\nPilihan Menu:");
            System.out.println("1. Tanam Tanaman");
            System.out.println("2. Siram Tanaman");
            System.out.println("3. Pupuk Tanaman");
            System.out.println("4. Tampilkan Status Tanaman");
            System.out.println("5. Panen Tanaman");
            System.out.println("6. Jual Hasil Panen");
            System.out.println("7. Cek Uang Pemain");
            System.out.println("8. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Pilih tanaman yang cocok dengan cuaca: " + cuaca.getKondisiCuaca());
                    if (cuaca.getKondisiCuaca().equals("Hujan")) {
                        System.out.println("1. Kentang");
                    } else if (cuaca.getKondisiCuaca().equals("Cerah")) {
                        System.out.println("1. Padi");
                    } else if (cuaca.getKondisiCuaca().equals("Panas")) {
                        System.out.println("1. Jagung");
                    }

                    System.out.print("Masukkan pilihan tanaman: ");
                    int pilihanTanaman = scanner.nextInt();
                    scanner.nextLine();

                    Tanaman tanamanBaru = null;
                    if (pilihanTanaman == 1) {
                        if (cuaca.getKondisiCuaca().equals("Hujan")) {
                            tanamanBaru = new Kentang();
                        } else if (cuaca.getKondisiCuaca().equals("Cerah")) {
                            tanamanBaru = new Padi();
                        } else if (cuaca.getKondisiCuaca().equals("Panas")) {
                            tanamanBaru = new Jagung();
                        }
                        lahan.tanamTanaman(tanamanBaru);
                        System.out.println(tanamanBaru.getNama() + " berhasil ditanam!");
                    } else {
                        System.out.println("Tanaman tidak sesuai dengan cuaca.");
                    }
                    break;

                case 2:
                    lahan.siramTanaman();
                    System.out.println("Semua tanaman telah disiram.");
                    break;

                case 3:
                    lahan.pupukTanaman();
                    System.out.println("Semua tanaman telah dipupuk.");
                    break;

                case 4:
                    lahan.tampilkanTanaman();
                    break;

                case 5:
                    for (Tanaman t : lahan.getTanaman()) {
                        t.panen(pemain);
                    }
                    break;

                case 6:
                    System.out.println("Pilih tanaman yang ingin dijual:");
                    lahan.tampilkanTanaman();
                    System.out.print("Masukkan nama tanaman yang ingin dijual: ");
                    String namaTanaman = scanner.nextLine();
                    for (Tanaman t : lahan.getTanaman()) {
                        if (t.getNama().equalsIgnoreCase(namaTanaman)) {
                            Toko toko = new Toko();
                            toko.jualHasilPanen(t, pemain);
                            break;
                        }
                    }
                    break;

                case 7:
                    System.out.println("Uang Anda: " + pemain.getUang());
                    break;

                case 8:
                    bermain = false;
                    System.out.println("Terima kasih telah bermain!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            for (Tanaman t : lahan.getTanaman()) {
                if (t != null) {
                    t.tumbuh();
                }
            }
        }

        scanner.close();
    }
}
