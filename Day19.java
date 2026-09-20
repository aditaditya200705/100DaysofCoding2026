import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");

        float angka = input.nextFloat();
        double angka2 = (double) angka;
        long angka3 = (long) angka;
        int angka4 = (int) angka;
        short angka5 = (short) angka;
        byte angka6 = (byte) angka;

        System.out.println("angka double: " + angka2);
        System.out.println("angka long: " + angka3);
        System.out.println("angka int: " + angka4);
        System.out.println("angka short: " + angka5);
        System.out.println("angka byte: " + angka6);
        input.close();
    }
    
}
