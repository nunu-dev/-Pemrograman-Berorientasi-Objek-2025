package id.ac.polban.service;

import id.ac.polban.model.KeranjangBelanja;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Kelas ini menyediakan layanan atau logika bisnis terkait operasional toko.
 */
public class TokoService {

    /**
     * IMPLEMENTASI STATIC METHOD.
     * Method ini adalah fungsi utilitas untuk memformat angka double menjadi format mata uang Rupiah.
     * Dibuat static agar bisa dipanggil langsung (TokoService.formatRupiah()) tanpa perlu
     * membuat objek dari TokoService, karena fungsinya tidak bergantung pada state objek.
     *
     * @param nominal Angka yang akan diformat.
     * @return String dalam format mata uang (Contoh: "Rp15.000,00").
     */
    public static String formatRupiah(double nominal) {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(indonesia);
        formatter.setMaximumFractionDigits(0); // Menghilangkan angka di belakang koma jika tidak perlu
        return formatter.format(nominal);
    }

    /**
     * Method untuk memproses checkout, menghitung total, dan menampilkan tagihan.
     * @param keranjang Objek KeranjangBelanja yang akan diproses.
     */
    public void prosesCheckout(KeranjangBelanja keranjang) {
        System.out.println("Memproses Checkout...");
        double totalBayar = keranjang.hitungTotal();
        System.out.println("Total yang harus dibayar: " + formatRupiah(totalBayar));
        System.out.println("Checkout berhasil! Terima kasih telah berbelanja.");
    }
}