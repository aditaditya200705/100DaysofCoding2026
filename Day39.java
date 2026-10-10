import java.util.Scanner;
public class Day39{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("===KALKULATOR SEDERHANA===");
        System.out.print("Masukkan Angka Pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan Operator: ");
        char b = input.next().charAt(0);

        System.out.print("Masukkan Angka Kedua: ");
        double c = input.nextDouble();

        double hasil;


        if ( b == '+'){
            hasil = a + c;
            System.out.println(a + " + " + c + " = " + hasil);
        } else if ( b == '-'){
            hasil = a - c;
            System.out.println(a + " - " + c + " = " + hasil);
        } else if ( b == '*'){
            hasil = a*c;
            System.out.println(a + " * " + c + " = " + hasil);
        }else if ( b == '/'){
            if (c != 0){
            hasil = a/c;
            System.out.println(a + " / " + c + " = " + hasil);
            } else {
                System.out.println("Tidak bisa membagi dengan 0");
            }
            
        }else{
            System.out.println ("hasil tidak valid");
        }

        input.close();
    }
}
