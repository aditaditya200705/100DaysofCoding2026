import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Umur: ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("Asal: ");
        String asal = input.nextLine();

        System.out.print("Prodi: ");
        String prodi = input.nextLine();

        System.out.println("=== BIODATA ===");
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur);
        System.out.println("Asal  : " + asal);
        System.out.println("Prodi : " + prodi);
    }
}
