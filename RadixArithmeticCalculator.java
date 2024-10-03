import java.util.Scanner;

public class RadixArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            // Get the base of the first number
            System.out.print("Enter the base of the first number (2, 8, 10, 16) or type 'stop' to exit: ");
            String baseInput = sc.nextLine();
            if (baseInput.equalsIgnoreCase("stop")) {
                break;
            }
            int base1 = Integer.parseInt(baseInput);

            // Get the first number
            System.out.print("Enter the first number: ");
            String num1 = sc.nextLine();
            if (num1.equalsIgnoreCase("stop")) {
                break;
            }

            // Get the base of the second number
            System.out.print("Enter the base of the second number (2, 8, 10, 16): ");
            baseInput = sc.nextLine();
            if (baseInput.equalsIgnoreCase("stop")) {
                break;
            }
            int base2 = Integer.parseInt(baseInput);

            // Get the second number
            System.out.print("Enter the second number: ");
            String num2 = sc.nextLine();
            if (num2.equalsIgnoreCase("stop")) {
                break;
            }

            // Convert both numbers to decimal
            int decimalNum1 = Integer.parseInt(num1, base1);
            int decimalNum2 = Integer.parseInt(num2, base2);

            // Perform arithmetic operations
            System.out.println("Select an operation: ");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            

            int result = 0;
            switch (choice) {
                case 1:
                    result = decimalNum1 + decimalNum2;
                    break;
                case 2:
                    result = decimalNum1 - decimalNum2;
                    break;
                case 3:
                    result = decimalNum1 * decimalNum2;
                    break;
                case 4:
                    if (decimalNum2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue; // Skip to the next iteration
                    } else {
                        result = decimalNum1 / decimalNum2;
                    }
                    break;
                default:
                    System.out.println("Invalid operation choice.");
                    continue; // Skip to the next iteration
            }
            //
            String binaryResult = String.format("%4s", Integer.toBinaryString(result)).replace(' ', '0');

            // Optionally, convert the result to the chosen bases
            System.out.println("Result (Decimal): " + result);
            System.out.println("Result in base 2 (Binary): " + Integer.toString(result, 2));
            System.out.println("Result in base 8 (Octal): " + Integer.toString(result, 8));
            System.out.println("Result in base 10 (Decimal): " + result);
            System.out.println("Result in base 16 (Hexadecimal): " + Integer.toString(result, 16).toUpperCase());
        }

        sc.close();
        System.out.println("Calculator stopped.");
    }
}