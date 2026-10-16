import java.util.Scanner;

public class Day45{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.print("Masukkan Warna Merah/Kuning/hijau: ");
        String a = n.nextLine().toLowerCase();

        switch (a){
            case "merah":
            System.out.println("Berhenti");
            break;
            
            case "kuning":
            System.out.println("Hati hati");
            break;

            case "hijau":
            System.out.println("Jalan");
            break;

            default:
            System.out.println("Warna Tidak Valid");
        }
        n.close();
    }
}
