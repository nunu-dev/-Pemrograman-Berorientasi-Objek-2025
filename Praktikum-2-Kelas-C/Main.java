// Main.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        while (true) {
            System.out.println("\n--- Menu Utama ---");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Tambah Buku");
            System.out.println("4. Lihat Data Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membaca newline setelah input angka

            if (pilihan == 1) {
                // Tambah Mahasiswa
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM Mahasiswa: ");
                String nim = scanner.nextLine();
                System.out.print("Masukkan Jurusan Mahasiswa: ");
                String jurusan = scanner.nextLine();

                Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
                Storage.tambahMahasiswa(mahasiswa);
                System.out.println("Mahasiswa berhasil ditambahkan.");
            } else if (pilihan == 2) {
                // Lihat Data Mahasiswa
                System.out.print("Masukkan NIM Mahasiswa untuk dilihat: ");
                String nim = scanner.nextLine();
                Mahasiswa mahasiswa = Storage.cariMahasiswa(nim);
                if (mahasiswa != null) {
                    mahasiswa.tampilkanInfo();
                } else {
                    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                }
            } else if (pilihan == 3) {
                // Tambah Buku
                System.out.print("Masukkan Judul Buku: ");
                String judul = scanner.nextLine();
                System.out.print("Masukkan Pengarang Buku: ");
                String pengarang = scanner.nextLine();
                System.out.print("Masukkan Tahun Terbit Buku: ");
                int tahunTerbit = scanner.nextInt();
                scanner.nextLine(); // Membaca newline setelah input angka

                Buku buku = new Buku(judul, pengarang, tahunTerbit);
                Storage.tambahBuku(buku);
                System.out.println("Buku berhasil ditambahkan.");
            } else if (pilihan == 4) {
                // Lihat Data Buku
                System.out.print("Masukkan Judul Buku untuk dilihat: ");
                String judul = scanner.nextLine();
                Buku buku = Storage.cariBuku(judul);
                if (buku != null) {
                    buku.tampilkanInfo();
                } else {
                    System.out.println("Buku dengan judul " + judul + " tidak ditemukan.");
                }
            } else if (pilihan == 5) {
                // Keluar
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
            }
        }

        scanner.close();
    }
}
