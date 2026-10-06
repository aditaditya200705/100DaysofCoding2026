import java.util.Scanner;
public class Day35{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        if (usia >= 17) {
            if (usia >= 60){
                System.out.println("Lansia");
            }else{
                System.out.println("Dewasa");
            }
        }else{
                System.out.println("Belum dewasa");
            }  
    }   
    
}
