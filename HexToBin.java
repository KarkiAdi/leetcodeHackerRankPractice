
// importing required classes
import java.util.Scanner;

class Main {
    // helper function to return decimal equivalent of each Hex digit
    public static int charToDec(char currentDigit) {
        switch (currentDigit) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
        }
        return -1;
    }

    // helper function to return binary equivalent of each Dec digit
    public static int decToBin(int currentDigit) {
        // power of each bit from right
        int p = 0;
        int binEquivalent = 0;
        while (currentDigit != 0) {
            int remainder = currentDigit % 2;
            binEquivalent = remainder * ((int) Math.pow(10, p)) + binEquivalent;
            p += 1;
            currentDigit /= 2;
        }
        return binEquivalent;
    }

    // main method
    public static void HexToBin(String[] args) {
        // creating a Scanner class
        Scanner input = new Scanner(System.in);
        // taking Hexadeciaml number from user
        System.out.print("Enter a Hexadecimal number: ");
        String hexNum = input.nextLine();
        // initialize the final binary equivalent of given hexadecimal
        int binEquivalent = 0;
        // power of each 4 bit from right
        int p = 0;
        // loop through each character in hexNum (from right to left)
        for (int idx = hexNum.length() - 1; idx > -1; idx--) {
            int currentDigitDecimal = charToDec(hexNum.charAt(idx));
            int currentDigitBinary = decToBin(currentDigitDecimal);
            binEquivalent = currentDigitBinary * ((int) Math.pow(10000, p)) + binEquivalent;
            p += 1;
        }
        System.out.println("Binary Equivalent: " + binEquivalent);
    }
}