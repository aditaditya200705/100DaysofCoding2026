import java.util.Scanner;

public class Day37{
    public static void main(String[] Args){
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = a.nextInt();

        if ( angka < 0){
            System.out.println("Angka Negatif");

        }else if (angka > 0){
            System.out.println("Angka Positif");

        }else{
            System.out.println("Angka Nol");
        }
    }
}
