import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka byte: ");
        String dataByte = input.nextLine();
        byte hasilByte = Byte.parseByte(dataByte);

        System.out.print("Masukkan angka short: ");
        String dataShort = input.nextLine();
        short hasilShort = Short.parseShort(dataShort);

        System.out.print("Masukkan angka int: ");
        String dataInt = input.nextLine();
        int hasilInt = Integer.parseInt(dataInt);

        System.out.print("Masukkan angka long: ");
        String dataLong = input.nextLine();
        long hasilLong = Long.parseLong(dataLong);

        System.out.print("Masukkan angka float: ");
        String dataFloat = input.nextLine();
        float hasilFloat = Float.parseFloat(dataFloat);

        System.out.print("Masukkan angka double: ");
        String dataDouble = input.nextLine();
        double hasilDouble = Double.parseDouble(dataDouble);

        System.out.println("=== HASIL ===");
        System.out.println("Byte   : " + hasilByte);
        System.out.println("Short  : " + hasilShort);
        System.out.println("Int    : " + hasilInt);
        System.out.println("Long   : " + hasilLong);
        System.out.println("Float  : " + hasilFloat);
        System.out.println("Double : " + hasilDouble);

        input.close();
    }
}
