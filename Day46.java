import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng  - Rp 15000");
        System.out.println("2. Mie Ayam     - Rp 12000");
        System.out.println("3. Sate Ayam    - Rp 20000");
        System.out.println("4. Bakso        - Rp 13000");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5) : ");
        int pilihan = n.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memesan Nasi Goreng seharga Rp 15000");
                break;
            case 2:
                System.out.println("Anda memesan Mie Ayam seharga Rp 12000");
                break;
            case 3:
                System.out.println("Anda memesan Sate Ayam seharga Rp 20000");
                break;
            case 4:
                System.out.println("Anda memesan Bakso seharga Rp 13000");
                break;
            case 5:
                System.out.println("Terima kasih, sampai jumpa!");
                break;
            default:
                System.out.println("Pilihan tidak valid! Pilih angka 1 sampai 5.");
        }

        n.close();
    }
}
