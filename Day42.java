import java.util.Scanner;

public class Day42{
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan angka: ");

        int b = a.nextInt();

        if ( b%3 == 0 && b%5 == 0 ){
            System.out.println("Kelipatan 3 Dan 5");
        }else if (b%3==0){
            System.out.println("Kelipatan 3");
        }else if(b%5 == 0){
            System.out.println("Kelipatan 5");
        }else{
            System.out.println("Bukan kelipatan 3 dan 5");
        }
        a.close();
    }
}
