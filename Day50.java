import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== CEK GANJIL ATAU GENAP ===");
        System.out.print("Masukkan bilangan bulat : ");
        int angka = input.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka adalah bilangan " + hasil);

        input.close();
    }
}
