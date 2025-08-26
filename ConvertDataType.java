class ConvertDataType {
    static short methodOne(long l) {
        int i = (int) l;
        return (short) i;
    }

    public static void main(String[] args) {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}

//Jelaskan output nilai dari variabel b.
//Output b adalah 10, karena:
//d = 10.25 (double)
//Setelah konversi: float f = 10.25f
//(long) f → 10
//(short) 10 → 10
//(byte) 10 → 10
//Tidak ada overflow karena masih dalam rentang byte (-128 sampai 127).

//Jelaskan apa yang berubah dari variabel d menjadi b setelah dilakukan cast?
//d bertipe double (64-bit) dengan nilai 10.25 (ada pecahan desimal).
//Setelah berturut-turut dikonversi:
//float (32-bit): masih 10.25 (desimal ada, tapi presisi bisa berkurang).
//long (64-bit integer): hilang pecahan → menjadi 10.
//int (32-bit): tetap 10.
//short (16-bit): tetap 10.
//byte (8-bit): tetap 10.
//Perubahan signifikan: kehilangan pecahan desimal (.25) setelah dikonversi ke tipe integer (long). Selanjutnya tidak ada perubahan nilai (selama masih dalam range).