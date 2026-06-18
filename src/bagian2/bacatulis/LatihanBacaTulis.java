package bagian2.bacatulis;

import java.io.*;

public class LatihanBacaTulis {
    public static void main(String[] args) {

        try {
            try ( // Soal 1
                    FileWriter fw = new FileWriter("hari.txt")) {
                fw.write("Senin\n");
                fw.write("Selasa\n");
                fw.write("Rabu\n");
                fw.write("Kamis\n");
                fw.write("Jumat\n");
            }

            System.out.println("=== Soal 1 ===");
            BufferedReader br = new BufferedReader(new FileReader("hari.txt"));
            String baris;
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
            }
            br.close();

            // Soal 2
            FileWriter append = new FileWriter("hari.txt", true);
            append.write("Sabtu\n");
            append.write("Minggu\n");
            append.close();

            System.out.println("\n=== Soal 2 ===");
            br = new BufferedReader(new FileReader("hari.txt"));
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
            }
            br.close();

            // Soal 3
            int jumlahBaris = 0;
            br = new BufferedReader(new FileReader("hari.txt"));
            while ((baris = br.readLine()) != null) {
                jumlahBaris++;
            }
            br.close();

            System.out.println("\n=== Soal 3 ===");
            System.out.println("Jumlah baris dalam hari.txt = " + jumlahBaris);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}