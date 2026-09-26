import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari jari: ");
        int R = input.nextInt();

        double luas = 3.14 * R * R;

        System.out.println("Luas lingkaran: " + luas);

        input.close();
    }

}
