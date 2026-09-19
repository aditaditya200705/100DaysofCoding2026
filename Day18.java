import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        byte umur = input.nextByte();
        int umur1 = umur;
        double umur2 = umur1;

        System.out.println("umur : " + umur);
        System.out.println("umur int: " + umur1 );
        System.out.println("umur double :" + umur2);
        input.close();
    }  
}
