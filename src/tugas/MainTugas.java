package tugas;

// Nama : (isi nama)
// NPM  : (isi npm)

public class MainTugas {

    public static void main(String[] args) {

        // Array kategori
        String[] kategori = {
                "Elektronik",
                "Makanan",
                "Pakaian"
        };

        System.out.println("Kategori:");
        for (String k : kategori) {
            System.out.println("- " + k);
        }

        Gudang gudang = new Gudang();

        // Minimal 5 barang
        gudang.tambahBarang(
                new Barang("Laptop", 8000000, 5));

        gudang.tambahBarang(
                new Barang("Mouse", 100000, 20));

        gudang.tambahBarang(
                new Barang("Keyboard", 250000, 10));

        gudang.tambahBarang(
                new Barang("Printer", 1500000, 3));

        gudang.tambahBarang(
                new Barang("Monitor", 2000000, 4));

        System.out.println("\nData Barang:");
        gudang.tampilkanSemua();

        gudang.simpanKeBerkas("barang.txt");

        System.out.println(
                "\nTotal Nilai = Rp "
                        + gudang.totalNilai());

        // Muat ulang
        Gudang gudangBaru =
                new Gudang();

        gudangBaru.muatDariBerkas(
                "barang.txt");

        System.out.println(
                "\nData dari file:");

        gudangBaru.tampilkanSemua();

        System.out.println(
                "\nTotal Persediaan = Rp "
                        + gudangBaru.totalNilai());
    }
}