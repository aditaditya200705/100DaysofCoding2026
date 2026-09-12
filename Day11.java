import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Kita membuat Scanner bernama input

        System.out.println("MASUKKAN NAMA: ");
        String nama = input.nextLine();//ini untuk menampilkan tulisan "MASUKKAN NAMA:" ke layar dan menyimpan nama yang dimasukkan pengguna

        System.out.println("Halo, " + nama);//ini untuk menampilkan tulisan "Halo" dan nama yang dimasukkan

        System.out.println("MASUKKAN ASAL");
        String asal = input.nextLine();//menampilkan tulisan MASUKKAN ASAL ke layar dan menyimpan asal yang dimasukkan pengguna

        System.out.println("Kamu berasal dari " + asal);//menampilkan tulisan "Kamu berasal dari" dan asal yang dimasukkan
    }
    
}
