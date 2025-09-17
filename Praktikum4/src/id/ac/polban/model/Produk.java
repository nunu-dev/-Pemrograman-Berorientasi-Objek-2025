package id.ac.polban.model;

/**
 * SUPERCLASS: Merepresentasikan sebuah produk secara umum.
 * Kelas ini menjadi induk bagi jenis-jenis produk yang lebih spesifik.
 */
public class Produk {
    // Atribut yang akan diwariskan ke semua subclass
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

    // --- Getter Methods (akan diwariskan) ---

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
     * Method toString() dasar yang akan di-override oleh subclass.
     * Method ini memanggil static method formatRupiah() dari kelas TokoService.
     */
    @Override
    public String toString() {
        // Menggunakan id.ac.polban.service.TokoService untuk format mata uang
        return String.format("Produk: %s, Harga: %s",
                this.nama, id.ac.polban.service.TokoService.formatRupiah(this.harga));
    }
}