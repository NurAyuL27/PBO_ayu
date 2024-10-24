package UTS;
import java.util.Scanner;

public class Simulasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Pemain
        System.out.print("Masukkan nama pemain: ");
        String namaPemain = scanner.nextLine();
        Pemain pemain = new Pemain(namaPemain);
 
        // Input Lahan
        System.out.println("Pilih jenis tanah:");
        System.out.println("1. Tanah Liat");
        System.out.println("2. Tanah Pasir");
        System.out.println("3. Tanah Berpasir");
        System.out.println("4. Tanah Hitam");
        System.out.print("Masukkan pilihan jenis tanah (1-4): ");
        int pilihanTanah = scanner.nextInt();
        System.out.print("Masukkan ukuran lahan (m2): ");
        int ukuranLahan = scanner.nextInt();
        scanner.nextLine();
        Lahan lahan = new Lahan(getJenisTanah(pilihanTanah), ukuranLahan);

        // Input Cuaca
        System.out.println("Pilih kondisi cuaca:");
        System.out.println("1. Cerah");
        System.out.println("2. Hujan");
        System.out.println("3. Berawan");
        System.out.println("4. Panas");
        System.out.print("Masukkan pilihan kondisi cuaca (1-4): ");
        int pilihanCuaca = scanner.nextInt();
        System.out.print("Masukkan suhu awal: ");
        int suhuCuaca = scanner.nextInt();
        scanner.nextLine();
        Cuaca cuaca = new Cuaca(getKondisiCuaca(pilihanCuaca), suhuCuaca);

        // Membuat objek Waktu dan Toko
        Waktu waktu = new Waktu();
        Toko toko = new Toko();

        // Menampilkan tanaman yang bisa ditanam berdasarkan suhu
        System.out.println("\nTanaman yang dapat ditanam pada suhu " + suhuCuaca + "°C:");
        if (suhuCuaca >= 20 && suhuCuaca <= 30) {
            System.out.println("- Padi");
            System.out.println("- Jagung");
            System.out.println("- Kentang");
        } else if (suhuCuaca < 20) {
            System.out.println("- Kentang");
        } else {
            System.out.println("- Jagung");
        }

        int pilihan;
        do {
            System.out.println("\nMau ngapain dulu?");
            System.out.println("1. Aksi pada Tanaman/Lahan");
            System.out.println("2. Aksi lainnya");
            System.out.println("3. Cek Status Tanaman");
            System.out.println("0. Keluar");
            System.out.print("Pilih aksi utama: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                // Aksi tanaman/lahan
                System.out.println("\nMenu Aksi pada Tanaman/Lahan:");
                System.out.println("1. Menanam Padi");
                System.out.println("2. Menanam Jagung");
                System.out.println("3. Menanam Kentang");
                System.out.print("Pilih aksi: ");
                int aksi = scanner.nextInt();
                scanner.nextLine();

                switch (aksi) {
                    case 1:
                        Padi padi = new Padi();
                        pemain.tanamTanaman(padi);
                        break;
                    case 2:
                        Jagung jagung = new Jagung();
                        pemain.tanamTanaman(jagung);
                        break;
                    case 3:
                        Kentang kentang = new Kentang();
                        pemain.tanamTanaman(kentang);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            } else if (pilihan == 3) {
                // Menampilkan status tanaman
                pemain.lihatTanaman();
                System.out.println("Masukkan nomor tanaman untuk melihat status: ");
                int nomorTanaman = scanner.nextInt();
                if (nomorTanaman > 0 && nomorTanaman <= pemain.getTanamanDimiliki().size()) {
                    Tanaman tanaman = pemain.getTanamanDimiliki().get(nomorTanaman - 1);
                    tanaman.statusTanaman();
                } else {
                    System.out.println("Tanaman tidak ditemukan.");
                }
            }
        } while (pilihan != 0);

        System.out.println("Keluar dari permainan.");
    }

    private static String getJenisTanah(int pilihan) {
        switch (pilihan) {
            case 1:
                return "Tanah Liat";
            case 2:
                return "Tanah Pasir";
            case 3:
                return "Tanah Berpasir";
            case 4:
                return "Tanah Hitam";
            default:
                return "Tidak Diketahui";
        }
    }

    private static String getKondisiCuaca(int pilihan) {
        switch (pilihan) {
            case 1:
                return "Cerah";
            case 2:
                return "Hujan";
            case 3:
                return "Berawan";
            case 4:
                return "Panas";
            default:
                return "Tidak Diketahui";
        }
    }
}
