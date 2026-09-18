import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Memasukkan angka
        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();

        //operator +=
        System.out.print("Masukkan angka untuk ditambahkan: ");
        int tambah = input.nextInt();
        angka += tambah;
        System.out.println(angka);

        //operator kurang
        System.out.print("Masukkan angka untuk dikurangi: ");
        int kurang = input.nextInt();
        angka -= kurang;
        System.out.println(angka);

        //operator bagi
        System.out.print("Masukkan angka untuk dibagi: ");
        int bagi = input.nextInt();
        angka /= bagi;
        System.out.println(angka);

        //operator kali
        System.out.print("masukkan angka untuk dikali: ");
        int kali = input.nextInt();
        angka *= kali;
        System.out.println(angka);

        //operator sisa bagi
        System.out.print("Masukkan angka untuk sisa bagi: ");
        int sisa = input.nextInt();
        angka %= sisa;
        System.out.println(angka);
        input.close();
    }   
}
