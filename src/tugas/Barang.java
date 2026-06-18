package tugas;

public class Barang {
    private final String nama;
    private final double harga;
    private final int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Untuk simpan ke file
    public String keBaris() {
        return nama + "," + harga + "," + stok;
    }

    // Menampilkan info
    public void info() {
        System.out.println(
                "Nama: " + nama +
                " | Harga: " + harga +
                " | Stok: " + stok);
    }
}