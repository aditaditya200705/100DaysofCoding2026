import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("==== HASIL OPERATOR LOGIKA ====");

        System.out.println("AND : " + (a > 0 && b > 0));
        System.out.println("OR  : " + (a > 0 || b > 0));
        System.out.println("NOT : " + !(a > 0));

        input.close();
    }
}
