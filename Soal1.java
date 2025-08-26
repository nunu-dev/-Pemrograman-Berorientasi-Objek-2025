public class Soal1 {
    public static void main(String[] args) {
        // Deklarasi variabel bertipe byte
        byte angka1 = 125;  // Nilai mendekati batas maksimum byte (127)
        byte angka2 = 6;    // Nilai kecil

        // Penjumlahan dua byte, hasilnya otomatis menjadi int
        // angka1 + angka2 = 125 + 6 = 131
        // 131 melebihi batas byte (-128 sampai 127)
        // Setelah casting ke byte: (byte) 131 = -125 (overflow)
        byte hasil = (byte) (angka1 + angka2);

        // Output yang akan dicetak
        System.out.println("Hasil 1 " + hasil); // Output: Hasil 1 -125
    }
}
