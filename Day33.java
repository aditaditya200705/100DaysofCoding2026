import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int umur = input.nextInt();

        if (umur >= 17 ) {
            System.out.println("Kamu Sudah Dewasa");
        } else {
            System.out.println("Kamu Belum Dewasa");

        input.close();
        }
    }
}
