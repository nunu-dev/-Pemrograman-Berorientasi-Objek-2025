package id.ac.polban.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas ini merepresentasikan keranjang belanja yang dapat menampung banyak produk.
 * Implementasi relasi Aggregation: KeranjangBelanja "has-a" (memiliki) Produk.
 */
public class KeranjangBelanja {
    // Menggunakan List untuk menampung koleksi objek Produk
    private List<Produk> daftarProduk;

    /**
     * Constructor untuk inisialisasi keranjang belanja sebagai ArrayList kosong.
     */
    public KeranjangBelanja() {
        this.daftarProduk = new ArrayList<>();
    }

    /**
     * Method untuk menambahkan sebuah produk ke dalam keranjang.
     * @param produk Objek Produk yang akan ditambahkan.
     */
    public void tambahProduk(Produk produk) {
        this.daftarProduk.add(produk);
        System.out.println(produk.getNama() + " berhasil ditambahkan ke keranjang.");
    }

    /**
     * Method untuk menampilkan semua produk yang ada di dalam keranjang.
     */
    public void tampilkanIsiKeranjang() {
        System.out.println("\n--- Isi Keranjang Belanja ---");
        if (daftarProduk.isEmpty()) {
            System.out.println("Keranjang masih kosong.");
        } else {
            int nomor = 1;
            for (Produk p : this.daftarProduk) {
                // Menggunakan method toString() dari kelas Produk secara implisit
                System.out.println(nomor++ + ". " + p);
            }
        }
        System.out.println("-----------------------------\n");
    }

    /**
     * Method untuk menghitung total harga dari semua produk di keranjang.
     * @return double Total harga.
     */
    public double hitungTotal() {
        double total = 0.0;
        for (Produk p : this.daftarProduk) {
            total += p.getHarga();
        }
        return total;
    }
}