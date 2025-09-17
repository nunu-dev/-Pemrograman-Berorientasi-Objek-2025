package id.ac.polban;

import id.ac.polban.model.KeranjangBelanja;
import id.ac.polban.model.Produk; // Tetap bisa menggunakan tipe Produk
import id.ac.polban.model.Buku;    // Import subclass
import id.ac.polban.model.AlatTulis; // Import subclass
import id.ac.polban.service.TokoService;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Aplikasi Toko Sederhana!");
        System.out.println("==========================================");

        // 1. Membuat beberapa objek dari SUBCLASS
        // Objek subclass dapat ditampung dalam variabel referensi superclass (Polimorfisme)
        Produk buku = new Buku("B01", "Buku Tulis PBO", 50000.0, 150);
        Produk pensil = new AlatTulis("P01", "Pensil Mekanik 2B", 15000.0, "Pensil");
        Produk penghapus = new AlatTulis("H01", "Penghapus Karet", 5000.0, "Penghapus");

        // 2. Membuat objek keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();
        System.out.println(); // Spasi

        // 3. Menambahkan produk ke keranjang
        // KeranjangBelanja tidak perlu diubah karena ia beroperasi pada tipe Produk (superclass),
        // sehingga secara otomatis bisa menerima semua turunannya (Buku, AlatTulis).
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(pensil);
        keranjang.tambahProduk(penghapus);

        // 4. Menampilkan isi keranjang
        // Method toString() yang dipanggil adalah method yang sudah di-override di masing-masing subclass.
        keranjang.tampilkanIsiKeranjang();

        // 5. Proses checkout (tidak ada perubahan di sini)
        TokoService service = new TokoService();
        service.prosesCheckout(keranjang);
    }
}