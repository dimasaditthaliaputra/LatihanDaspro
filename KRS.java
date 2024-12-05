import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KRS {
    static Scanner input = new Scanner(System.in);
    static List<String[]> KRS = new ArrayList<>();

    public static void tambahKRS() {
        int nim, sks, totalSKS, maxSKS;
        String nama, kodeMatKul, namaMatKul;
        totalSKS = 0;
        maxSKS = 24;

        System.out.println("\n--- Tambah Data KRS ---");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("NIM : ");
        nim = input.nextInt();
        input.nextLine();

        while (true) {
            System.out.print("Kode Mata Kuliah : ");
            kodeMatKul = input.nextLine();
            System.out.print("Nama Mata Kuliah : ");
            namaMatKul = input.nextLine();
            int sisaSKS = maxSKS - totalSKS;
            System.out.println("Sisa SKS yang tersedia: " + sisaSKS);

            do {
                System.out.print("Jumlah SKS (1-3) : ");
                sks = input.nextInt();
                input.nextLine();

                if (sks < 1 || sks > 3) {
                    System.out.println("Jumlah SKS tidak valid, masukkan ulang.");
                    continue;
                } else {
                    if (totalSKS + sks > maxSKS) {
                        System.out.println("Total SKS tidak boleh lebih dari 24. Total SKS saat ini: " + totalSKS);
                        continue;
                    } else {
                        totalSKS += sks;
                        break;
                    }
                }
            } while (true);

            KRS.add(new String[] {
                    String.valueOf(nim),
                    nama,
                    kodeMatKul,
                    namaMatKul,
                    String.valueOf(sks)
            });

            System.out.println("Data mata kuliah berhasil ditambahkan.");

            String choice;
            while (true) {
                System.out.print("Tambah mata kuliah lain? (y/t) : ");
                choice = input.nextLine();

                if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("t")) {
                    break;
                } else {
                    System.out.println("Input Salah, Mohon masukkan input yang benar!");
                }
            }

            if (choice.equalsIgnoreCase("t")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("\n=== Sistem Pemantauan KRS Mahasiswa ===");
            System.out.println("1. Tambah Data KRS");
            System.out.println("2. Tampilkan Daftar KRS Mahasiswa");
            System.out.println("3. Analisis Data KRS");
            System.out.println("4. Keluar");
            System.out.println("=======================================");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    tambahKRS();
                    break;
                case 2:
                    System.out.println("Fungsi Tampilkan Data KRS");
                    break;
                case 3:
                    System.out.println("Fungsi Analisis Data KRS");
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("\nMaaf Menu Tidak Tersedia, Masukkan Ulang Menu");
                    break;
            }
        } while (true);
    }
}