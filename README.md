import java.util.Scanner;

public class BianaryOctalAdder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input binary number
        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();
        
        // Input octal number
        System.out.print("Enter an octal number: ");
        String octalStr = scanner.nextLine();
        
        // Convert binary to decimal
        int binaryDecimal = Integer.parseInt(binaryStr, 2);
        
        // Convert octal to decimal
        int octalDecimal = Integer.parseInt(octalStr, 8);
        
        // Perform addition
        int sum = binaryDecimal + octalDecimal;
        
        // Convert sum to binary and octal
        String sumBinary = Integer.toBinaryString(sum);
        String sumOctal = Integer.toOctalString(sum);
        
        // Output the results
        System.out.println("Sum in decimal: " + sum);
        System.out.println("Sum in binary: " + sumBinary);
        System.out.println("Sum in octal: " + sumOctal);
        
        scanner.close();
    }
}
