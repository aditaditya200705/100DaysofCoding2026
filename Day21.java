import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        System.out.println("=== HASIL PERBANDINGAN ===");

        System.out.println("Sama dengan     : " + (angka1 == angka2));
        System.out.println("Tidak sama      : " + (angka1 != angka2));
        System.out.println("Lebih besar     : " + (angka1 > angka2));
        System.out.println("Lebih kecil     : " + (angka1 < angka2));
        System.out.println("Lebih besar/sama: " + (angka1 >= angka2));
        System.out.println("Lebih kecil/sama: " + (angka1 <= angka2));

        input.close();
    }
}
