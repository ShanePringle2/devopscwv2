import java.til.Scanner;
public class Dex2Hex {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No input provided.");
            return;
        }
        try {
            int input = Integer.parseInt(args[0]);
            System.out.println("Hexadecimal: " + Integer.toHexString(input));
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not an integer.");
        }
    }
}


