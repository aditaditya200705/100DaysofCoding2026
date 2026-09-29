import java.util.Scanner;
public class Day28 {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 =input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        System.out.println("===Hasil Perbandingan===");
        System.out.println("Sama dengan         : " + (angka1 == angka2));
        System.out.println("Tidak sama dengan   : " + (angka1 != angka2));
        input.close();
    }

}
