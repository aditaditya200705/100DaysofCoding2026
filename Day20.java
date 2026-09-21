import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan byte: ");
        byte dataByte = input.nextByte();

        System.out.print("Masukkan short: ");
        short dataShort = input.nextShort();

        System.out.print("Masukkan int: ");
        int dataInt = input.nextInt();

        System.out.print("Masukkan long: ");
        long dataLong = input.nextLong();

        System.out.print("Masukkan float: ");
        float dataFloat = input.nextFloat();

        System.out.print("Masukkan double: ");
        double dataDouble = input.nextDouble();

        System.out.print("Masukkan char: ");
        char dataChar = input.next().charAt(0);

        System.out.print("Masukkan boolean (true/false): ");
        boolean dataBoolean = input.nextBoolean();

        // Mengubah semua menjadi String
        String hasilByte = String.valueOf(dataByte);
        String hasilShort = String.valueOf(dataShort);
        String hasilInt = String.valueOf(dataInt);
        String hasilLong = String.valueOf(dataLong);
        String hasilFloat = String.valueOf(dataFloat);
        String hasilDouble = String.valueOf(dataDouble);
        String hasilChar = String.valueOf(dataChar);
        String hasilBoolean = String.valueOf(dataBoolean);

        System.out.println("=== HASIL ===");
        System.out.println("Byte    : " + hasilByte);
        System.out.println("Short   : " + hasilShort);
        System.out.println("Int     : " + hasilInt);
        System.out.println("Long    : " + hasilLong);
        System.out.println("Float   : " + hasilFloat);
        System.out.println("Double  : " + hasilDouble);
        System.out.println("Char    : " + hasilChar);
        System.out.println("Boolean : " + hasilBoolean);
    }
}
