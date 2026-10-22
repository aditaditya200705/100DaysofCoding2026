import java.util.Scanner;

public class Day51{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int a = n.nextInt();

        System.out.print("Masukkan angka akhir: ");
        int b = n.nextInt();

        for(int c = a; c <= b; c++){
            System.out.println("Saya sedang belajar");
        }

        n.close();
    }
}
