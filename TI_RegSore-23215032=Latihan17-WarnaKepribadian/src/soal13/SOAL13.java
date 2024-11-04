/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal13;

/**
 *
 * @author
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : GANTI KATA
 */
import java.util.Scanner;

public class SOAL13 {
    public static void main(String[] args) {
        System.out.println("YUK CEK KEPRIBADIANMU  DARI WARNA FAVORITMU");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan warna
        System.out.println("Pilih warna favorit Anda dari pilihan berikut:");
        System.out.println("1. MERAH");
        System.out.println("2. HIJAU");
        System.out.println("3. KUNING");
        System.out.println("4. BIRU");
        System.out.println("5. UNGU");

        // Meminta pengguna untuk memilih warna
        System.out.print("PILIH WARNA FAVORITMU : ");
        String warna = scanner.nextLine().toUpperCase();
        System.out.print("NAMA KAMU : ");
        String nama = scanner.nextLine();

        // Menampilkan kepribadian berdasarkan warna yang dipilih
        System.out.println("");
        System.out.println("=== HASIL TEST KEPRIBADIAN " + nama + " ===");
        System.out.println("\nKepribadian Anda berdasarkan warna " + warna + " :");

        switch (warna) {
            case "MERAH":
                System.out.println("1. Periang");
                System.out.println("2. Pemberani.");
                System.out.println("3. Berani mengambil resiko dalam setiap langkah.");
                System.out.println("4. Menyukai tantangan.");
                System.out.println("5. Kurang sabar.");
                System.out.println("6. Dapat menahan marah namun jika sudah ditahap puncak toleransi, kemarahan akan sulit terkontrol.");
                System.out.println("7. Memiliki energi kehangatan dan cinta");
                break;
            case "HIJAU":
                System.out.println("1. Romantis.");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan.");
                System.out.println("3. Teguh pada prinsip.");
                System.out.println("4. Menginginkan kesempurnaan.");
                System.out.println("5. Mudah cemburu.");
                System.out.println("6. Mudah merasa iri");
                System.out.println("7. Menjungjung tinggi suatu nilai teloransi dan kepercayaan");
                break;
            case "KUNING":
                System.out.println("Opps... Belum terindetifikasi ");
                break;
            case "BIRU":
                System.out.println("1. Menyenangkan.");
                System.out.println("2. Bijaksana.");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah.");
                System.out.println("4. Dinamis.");
                System.out.println("5. Senang Berbagi.");
                System.out.println("6. Bersahabat");
                System.out.println("7. Tidak terlalu suka menajadi sorotan banyak orang");
                break;
            case "UNGU":
                System.out.println("1. Optimis.");
                System.out.println("2. Tidak pernah ragu.");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat.");
                System.out.println("4. Memiliki ambisi yang besar.");
                System.out.println("5. Memiliki empati yang besar");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaanya.");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
                break;
            default:
                System.out.println("Maaf, warna yang Anda masukkan tidak terdaftar.");
        }

        // Menutup scanner
        scanner.close();
    }
}

