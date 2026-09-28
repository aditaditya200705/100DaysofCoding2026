import java.util.Scanner;
public class Day27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        System.out.println("Angka awal: " + angka);

        angka++;
        System.out.println("Setelah ++: " + angka);

        angka--;
        System.out.println("Setelah --: " + angka);

        input.close();
    }

}
