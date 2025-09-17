package id.ac.polban.model;

/**
 * SUBCLASS: Merepresentasikan produk jenis Buku.
 * Kelas ini mewarisi (extends) kelas Produk.
 */
public class Buku extends Produk { // <-- IMPLEMENTASI INHERITANCE
    private int jumlahHalaman;

    /**
     * Constructor untuk kelas Buku.
     * @param kode Kode unik buku.
     * @param nama Judul buku.
     * @param harga Harga buku.
     * @param jumlahHalaman Jumlah halaman buku.
     */
    public Buku(String kode, String nama, double harga, int jumlahHalaman) {
        // IMPLEMENTASI SUPER: Memanggil constructor dari superclass (Produk)
        super(kode, nama, harga);
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getJumlahHalaman() {
        return this.jumlahHalaman;
    }

    /**
     * IMPLEMENTASI OVERRIDE: Mendefinisikan ulang method toString() dari superclass.
     * Tujuannya untuk memberikan output yang lebih spesifik untuk Buku.
     */
    @Override
    public String toString() {
        // IMPLEMENTASI SUPER: Memanggil method toString() milik superclass
        // lalu menambahkan informasi spesifik dari subclass ini.
        return super.toString() + String.format(", Halaman: %d", this.jumlahHalaman);
    }
}