package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri {
    public static void main(String[] args) {

        // Soal 1
        System.out.println("=== Soal 1 ===");
        File laporan = new File("laporan.txt");

        if (laporan.exists()) {
            System.out.println("File laporan.txt ditemukan.");
            System.out.println("Ukuran file: " + laporan.length() + " byte");
        } else {
            System.out.println("File laporan.txt tidak ditemukan.");
        }

        // Soal 2
        System.out.println("\n=== Soal 2 ===");
        File arsip = new File("arsip");

        if (arsip.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        // Soal 3
        System.out.println("\n=== Soal 3 ===");
        File sementara = new File("sementara.txt");

        try {
            sementara.createNewFile();

            System.out.println("Sebelum dihapus:");
            System.out.println("File ada? " + sementara.exists());

            sementara.delete();

            System.out.println("Sesudah dihapus:");
            System.out.println("File ada? " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}