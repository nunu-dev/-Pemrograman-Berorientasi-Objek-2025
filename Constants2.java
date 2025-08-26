public class Constants2 {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth *
                CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

//Dari 2 contoh baris program diatas, jawablah pertanyaan dibawah ini:
//1. Bagaimana output dari masing masing class Constants dan Constants2? 
//Paper size in centimeters: 21.59 by 27.94

//2. Apa perbedaan penggunaan final double dengan public static final double?
//final double
//Hanya membuat nilai variabel konstan (tidak bisa diubah setelah diinisialisasi).
//Scope hanya dalam method tempat dideklarasikan.
//Tidak dapat diakses dari luar method.

//public static final double
//final → konstan.
//static → milik class, bukan objek, sehingga bisa diakses tanpa membuat instance.
//public → dapat diakses dari class lain.
//Biasa digunakan untuk konstanta global (misalnya Math.PI).
//Memenuhi konvensi untuk konstanta: public static final.