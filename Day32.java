import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.println("==== HASIL ====");

        System.out.println("AND :" + (umur >= 17 && nilai >= 75));

        System.out.println("OR :" + (umur < 17 || nilai < 75));

        System.out.println("NOT : " + !(umur >= 17));

        System.out.println("Kombinasi: "
                + ((umur >= 17 && nilai >= 75) || !(nilai < 75)));

        input.close();
    }
}
