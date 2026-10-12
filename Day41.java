import java.util.Scanner;

public class Day41{
    public static void main(String [] args){
        Scanner a = new Scanner(System.in);

        System.out.println("=== TEMPERATUR RUANGAN===");
        System.out.print("Masukkan Suhu Ruangan: ");
        int b = a.nextInt();

        if( b < 0){
            System.out.println("Sangat Dingin");
        }else if ( b < 18){
            System.out.println("Dingin");
        }else if ( b < 25){
            System.out.println("Normal");
        }else if ( b < 30){
            System.out.println("Hangat");
        }else if ( b < 40 ){
            System.out.println("Panas");
        }else{
            System.out.println("Sangat Panas");
        }
    }
}
