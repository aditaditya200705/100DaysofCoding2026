public class Day10 {
    public static void main(String[] args) {
        byte angka = 127; //ini bisa karena masih masuk data byte sedangkan jika sudah 128 maka sudah tidak bisa
        System.out.println(angka);
        byte A = -128;//juga masih bisa karena merapakan angka minimal dari byte diatas dari itu tidak bisa
        System.out.println(A);
        
        short B = 32000;//angka minimum dan maksimum dari short adalah -32.768 dan 32.767 lebih dari itu tidak bisa
        System.out.println(B);

        int c = 2000000000;// angka minimum dari int adalah +- 2.000.000.000 lebih dari itu tidak bisa misalnya 3.000.000.000
        System.out.println(c);

        // tipe data long digunakan untuk angka yang sangat besar bisa mencapai 9 kuintiliun dan harus ditambah huruf L dibelakang nilainya
        long pendudukDunia = 8000000000L;

        System.out.println(pendudukDunia);

        float tinggi = 160.5f;//float mempunyai batas minimal dan maksimal yaitu 3,4 * 10 pangkat 8 
        double tinggi2 = 165.7;//double memiliki batas minimal dan maksimal yaitu sekitar 1,7 * 10 pangkat 308
        System.out.println(tinggi);
        System.out.println(tinggi2);

        char kelas = 'A'; //hanya mempunyai satu karakter
        String prodi = "INFORMATIKA"; //sedangkan String bisa lebih dari satu karakter
        System.out.println(kelas);
        System.out.println(prodi);


    }
    
}
