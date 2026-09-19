import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        byte umur = input.nextByte();
        short umur1 = umur;
        int umur2 = umur1;
        long umur3 = umur2;
        float umur4 = umur3;
        double umur5 = umur4;

        System.out.println("umur : " + umur);
        System.out.println("umur short : " + umur1 );
        System.out.println("umur int :" + umur2);
        System.out.println("umur long :" + umur3);
        System.out.println("umur float :" + umur4);
        System.out.println("umur double :" + umur5);        
    }  
}
