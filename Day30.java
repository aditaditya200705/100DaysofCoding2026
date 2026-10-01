import java.util.Scanner;
public class Day30{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama    : ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua      : ");
        int b = input.nextInt();

        System.out.println("====Hasil Perbandingan====");
        System.out.println("Lebih kecil / Sama dengan   : " + (a <= b));
        System.out.println("Lebih Besar / Sama dengan   : " + (a >= b));

        input.close();
    }
}
