import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Mulai hitung mundur : ");
        int a = n.nextInt();

        while (a >= 1) {
            System.out.print(a + " ");
            a--;
        }
        System.out.println("Selesai!");

        n.close();
    }
}
