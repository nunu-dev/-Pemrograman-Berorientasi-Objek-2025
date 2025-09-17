package id.ac.polban.model;

/**
 * Kelas ini merepresentasikan sebuah produk di toko.
 * Ini adalah kelas data sederhana (POJO - Plain Old Java Object).
 */
public class Produk {
    // Atribut untuk menyimpan data produk
    private String kode;
    private String nama;
    private double harga;

    /**
     * Constructor untuk membuat objek Produk baru.
     * @param kode Kode unik produk.
     * @param nama Nama produk.
     * @param harga Harga produk.
     */
    public Produk(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    // --- Getter Methods ---

    public String getKode() {
        return this.kode;
    }

    public String getNama() {
        return this.nama;
    }

    public double getHarga() {
        return this.harga;
    }

    /**
     * Override method toString() untuk menampilkan informasi produk dengan format yang rapi.
     * Method ini memanggil static method formatRupiah() dari kelas TokoService.
     */
    @Override
    public String toString() {
        return String.format("Produk: %s, Harga: %s",
                this.nama, id.ac.polban.service.TokoService.formatRupiah(this.harga));
    }
}