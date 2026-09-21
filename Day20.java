import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int A = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int B = input.nextInt();

        System.out.println("A > B " + (A > B));
        System.out.println("A < B " + (A < B));
        System.out.println("A == B " + (A == B));
        System.out.println("A != B " + (A != B));
        input.close();
    }
    
}
