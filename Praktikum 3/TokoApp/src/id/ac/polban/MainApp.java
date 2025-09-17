package id.ac.polban;

import id.ac.polban.model.KeranjangBelanja;
import id.ac.polban.model.Produk;
import id.ac.polban.service.TokoService;

/**
 * Kelas utama yang berfungsi sebagai titik masuk (entry point) aplikasi.
 * Kelas ini mensimulasikan alur kerja aplikasi dari membuat produk hingga checkout.
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Aplikasi Toko Sederhana!");
        System.out.println("==========================================");

        // 1. Membuat beberapa objek produk
        Produk buku = new Produk("B01", "Buku Tulis PBO", 50000.0);
        Produk pensil = new Produk("P01", "Pensil Mekanik 2B", 15000.0);
        Produk penghapus = new Produk("H01", "Penghapus Karet", 5000.0);

        // 2. Membuat objek keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();
        System.out.println(); // Spasi

        // 3. Menambahkan produk ke keranjang
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(pensil);
        keranjang.tambahProduk(penghapus);

        // 4. Menampilkan isi keranjang
        keranjang.tampilkanIsiKeranjang();

        // 5. IMPLEMENTASI DEPENDENCY:
        // MainApp "uses-a" (menggunakan) TokoService untuk melakukan tugas checkout.
        // Objek 'service' dibuat hanya saat dibutuhkan di dalam method ini.
        TokoService service = new TokoService();
        service.prosesCheckout(keranjang);
    }
}