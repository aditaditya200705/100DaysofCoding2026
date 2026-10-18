import java.util.Scanner;

public class Day47{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("PROGRAM MENENTUKAN HARI");
        System.out.print("Masukkan nomor hari: ");

        int hari = n.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Hari Senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jumat");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
                break;  
            default:
                System.out.println("Nomor tidak valid masukkan nomor 1 - 7");
                break;
        }
    }
}
