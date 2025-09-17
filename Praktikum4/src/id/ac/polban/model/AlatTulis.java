// Pastikan hanya ada satu baris package ini di paling atas
package id.ac.polban.model;

/**
 * SUBCLASS: Merepresentasikan produk jenis Alat Tulis.
 * Kelas ini mewarisi (extends) kelas Produk.
 */
public class AlatTulis extends Produk { // <-- IMPLEMENTASI INHERITANCE
    private String jenis;

    /**
     * Constructor untuk kelas AlatTulis.
     * @param kode Kode unik alat tulis.
     * @param nama Nama alat tulis.
     * @param harga Harga alat tulis.
     * @param jenis Jenis alat tulis (misal: "Pensil", "Penghapus").
     */
    public AlatTulis(String kode, String nama, double harga, String jenis) {
        // IMPLEMENTASI SUPER: Memanggil constructor dari superclass (Produk)
        super(kode, nama, harga);
        this.jenis = jenis;
    }

    public String getJenis() {
        return this.jenis;
    }

    /**
     * IMPLEMENTASI OVERRIDE: Mendefinisikan ulang method toString() dari superclass.
     * Tujuannya untuk memberikan output yang lebih spesifik untuk Alat Tulis.
     */
    @Override
    public String toString() {
        // IMPLEMENTASI SUPER: Memanggil method toString() milik superclass
        // lalu menambahkan informasi spesifik dari subclass ini.
        return super.toString() + String.format(", Jenis: %s", this.jenis);
    }
}