import java.util.Scanner;

public class Day26  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama      : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM         : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Kelas       : ");
        String kelas = input.nextLine();

        System.out.print("Masukkan Umur        : ");
        int umur = input.nextInt();
        input.nextLine(); 

        System.out.print("Masukkan Prodi       : ");
        String prodi = input.nextLine();

        System.out.print("Masukkan IPK         : ");
        double ipk = input.nextDouble();
        input.nextLine();

        System.out.print("Status Keaktifan     : ");
        boolean statusAktif = input.nextBoolean();

        
        System.out.println("===== BIODATA MAHASISWA =====");
        System.out.println("Nama         : " + nama);
        System.out.println("NIM          : " + nim);
        System.out.println("Kelas        : " + kelas);
        System.out.println("Umur         : " + umur + " Tahun");
        System.out.println("Prodi        : " + prodi);
        System.out.println("IPK          : " + ipk);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("==============================");

        input.close();
    }
}
