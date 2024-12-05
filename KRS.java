import java.util.Scanner;

public class KRS {
    static Scanner input = new Scanner(System.in);

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
                    System.out.println("Fungsi Tambah Data KRS");
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