import java.util.Scanner;

public class Day49{
    public static void main (String[] args){
        Scanner n = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai: ");
        int nilai = n.nextInt();

        String hasil = (nilai >= 85 ) ? "Lulus" : "Tidak Lulus";

        System.out.println(hasil);

        n.close();
    }
}
