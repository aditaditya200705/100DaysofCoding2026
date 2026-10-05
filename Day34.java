import java.util.Scanner;
public class Day34{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        if(usia >= 0 && usia <= 5){
        System.out.println("Balita");

        } else if ( usia >= 6 && usia <= 12){
            System.out.println("Anak Anak");

        } else if ( usia >= 13 && usia <= 17) {
            System.out.println("Remaja");

        } else if ( usia >= 18 && usia <= 59) {
            System.out.println("Dewasa");

        } else if ( usia >= 60) {
            System.out.println("Lansia");
        } else {
            System.out.println("Usia tidak valid");
        }
    }
}
