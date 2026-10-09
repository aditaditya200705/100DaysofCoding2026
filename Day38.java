
import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== MENU KANTIN =====");
        System.out.println("1. Nasi Goreng - Rp15.000");
        System.out.println("2. Mie Ayam    - Rp12.000");
        System.out.println("3. Es Teh      - Rp5.000");
        System.out.println("4. Ayam Geprek - Rp18.000");
        System.out.println("5. Air Mineral - Rp4.000");
        System.out.print("Pilih menu (1-5): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Nasi Goreng - Rp15.000");

        } else if (pilihan == 2) {
            System.out.println("Mie Ayam - Rp12.000");

        } else if (pilihan == 3) {
            System.out.println("Es Teh - Rp5.000");
        
        } else if (pilihan == 4) {
            System.out.println("Ayam Geprek - Rp.18.000");
            
        } else if (pilihan == 5){
            System.out.println("Air Mineral - Rp4.000");

        } else {
            System.out.println("Menu tidak tersedia!");
        }

        input.close();
    }
}
