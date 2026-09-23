import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai A: ");
        int A = input.nextInt();
        System.out.print("Masukkan nilai B: ");
        int B = input.nextInt();

        System.out.println("Sebelum Nilai Ditukar");
        System.out.println("Nilai A: " + A);
        System.out.println("Nilai B: " + B);

        int sementara = A;

        A = B;

        B = sementara;

        System.out.println("Sesudah Nilai Ditukar");
        System.out.println("Nilai A: " + A);
        System.out.println("Nilai B: " + B);
    }

}
