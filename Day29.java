import java.util.Scanner;
public class Day29{
    public static void main (String[] args){

     Scanner input = new Scanner(System.in);

     System.out.print("Masukkan angka pertama    : ");
     int a = input.nextInt();
     System.out.print("Masukkan angka kedua      : ");
     int b = input.nextInt();

     System.out.println("==== HASIL PERBANDINGAN====");
     System.out.println("Lebih Kecil: " + (a < b));
     System.out.println("Lebih Besar: " + (a > b));

     input.close();
    }
}
