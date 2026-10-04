import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 80 ) {
            System.out.println("Selamat, Anda Lulus!");
        } else {
            System.out.println("Maaf, Anda harus remedi");
        }
        input.close();   
    }
}
