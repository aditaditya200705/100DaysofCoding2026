import java.util.Scanner;
public class day32{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.println("==== HASIL ====");
        //Hasil AND
        System.out.println(umur >= 17 && nilai >= 75);
        //Hasil OR
        System.out.println(umur < 17 || nilai < 75);
    }
}
