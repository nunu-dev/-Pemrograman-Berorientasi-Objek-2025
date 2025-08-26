class FloatingPoint {
    public static void main(String[] args) {
        double x = 92.98;
        int nx = (int) Math.round(x);

        System.out.println("Nilai nx setelah pembulatan: " + nx);
    }
}

//Pada kasus berikut jelaskan nilai nx setelah digunakan Math.round(x)?
//x = 92.98
//Math.round(92.98) → fungsi ini membulatkan angka ke integer terdekat:
//Jika desimal ≥ 0.5 → dibulatkan ke atas
//Jika desimal < 0.5 → dibulatkan ke bawah
//Jadi: Math.round(92.98) = 93
//Namun, Math.round(double) mengembalikan long, bukan int.
//Setelah dilakukan cast ke int: nx = (int) 93 → 93
//nx bernilai 93 setelah digunakan Math.round(x).

//Kenapa dibutuhkan cast (int) dalam penggunaan Math.round(x)?
//Math.round(double a) mengembalikan long (64-bit).
//Variabel nx dideklarasikan sebagai int (32-bit).
//Java tidak mengizinkan konversi otomatis dari long ke int karena bisa terjadi kehilangan data (narrowing conversion).
//Oleh karena itu, kita harus melakukan cast (int) agar sesuai dengan tipe data variabel nx.