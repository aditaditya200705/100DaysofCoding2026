import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok   : Rp ");
        int a = input.nextInt();

        System.out.print("Masukkan potongan     : Rp ");
        int b = input.nextInt();
        int c = a - b;

        System.out.println("Gaji Bersih: Rp" + c);

        if (c >= 3000000){
            System.out.println("Gaji Memenuhi target");
        }else{
            System.out.println("Gaji tidak memenuhi target");
        }
        input.close();
    }
}
