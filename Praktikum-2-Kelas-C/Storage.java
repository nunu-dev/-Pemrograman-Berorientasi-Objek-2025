// Storage.java

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static List<Mahasiswa> mahasiswaList = new ArrayList<>();
    private static List<Buku> bukuList = new ArrayList<>();

    // Menambah mahasiswa
    public static void tambahMahasiswa(Mahasiswa mahasiswa) {
        mahasiswaList.add(mahasiswa);
    }

    // Menambah buku
    public static void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    // Menampilkan semua mahasiswa
    public static void tampilkanSemuaMahasiswa() {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            for (Mahasiswa mahasiswa : mahasiswaList) {
                mahasiswa.tampilkanInfo();
            }
        }
    }

    // Menampilkan semua buku
    public static void tampilkanSemuaBuku() {
        if (bukuList.isEmpty()) {
            System.out.println("Tidak ada data buku.");
        } else {
            for (Buku buku : bukuList) {
                buku.tampilkanInfo();
            }
        }
    }

    // Mencari mahasiswa berdasarkan NIM
    public static Mahasiswa cariMahasiswa(String nim) {
        for (Mahasiswa mahasiswa : mahasiswaList) {
            if (mahasiswa.getNim().equals(nim)) {
                return mahasiswa;
            }
        }
        return null;
    }

    // Mencari buku berdasarkan judul
    public static Buku cariBuku(String judul) {
        for (Buku buku : bukuList) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }
}
