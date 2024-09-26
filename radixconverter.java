import java.util.Scanner;
public class radixconverter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String binary = "2";
		String octal = "8";
		String decimal = "10";
		String hexadeci = "16";
		System.out.println("Enter a number or Enter stop to terminate the program");
		System.out.println("1. Binary Number System\n2. Decimal Number System\n3. Octal Number System\n4. Hexadecimal Number System");
 while (true) {
 String myChoice = sc.nextLine();
 if (myChoice.equals("STOP")) {
 System.out.println("Program Terminated");
 break;
 } else if (myChoice.equals("1")) {
 try {
 System.out.println("You have chosen Binary Number System");
 System.out.println("Enter a binary number to convert");
 String myNumber = sc.nextLine();
 decimal = Integer.toString(Integer.parseInt(myNumber, 2));
 int oNum = Integer.parseInt(myNumber, 2);
 octal = Integer.toOctalString(oNum);
 int hNum = Integer.parseInt(myNumber, 2);
 hexadeci = Integer.toHexString(hNum);
 System.out.println("Your binary number " + myNumber + ", is converted to:");
 System.out.println("Decimal: " + decimal + "\nOctal: " + octal + "\nHexadecimal: " + hexadeci);
 System.out.println("\nChoose a number system to start converting again. \nType STOP to terminate the process.");
 } catch (NumberFormatException nfe) {
 System.out.println("Error! Not a convertible value! \nChoose another number system to start converting again, or \ntype STOP to terminate the program");
 }
 } else if (myChoice.equals("2")) {
 try {
 System.out.println("You have chosen Decimal Number System");
 System.out.println("Enter a decimal number to convert");
 String myNumber = sc.nextLine();
 binary = Integer.toBinaryString(Integer.parseInt(myNumber));
 octal = Integer.toOctalString(Integer.parseInt(myNumber));
 hexadeci = Integer.toHexString(Integer.parseInt(myNumber));
 System.out.println("Your decimal number " + myNumber + ", is converted to:");
 System.out.println("Binary: " + binary + "\nOctal: " + octal + "\nHexadecimal: " + hexadeci);
 System.out.println("\nChoose a number system to start converting again. \nType STOP to terminate the program.");
 } catch (NumberFormatException nfe) {
 System.out.println("Error! Not a convertible value! \nChoose another number system to start converting again, or \ntype STOP to terminate the program");
 }
 } else if (myChoice.equals("3")) {
 try {
 System.out.println("You have chosen Octal Number System");
 System.out.println("Enter a octal number to convert");
 String myNumber = sc.nextLine();
 decimal = Integer.toString(Integer.parseInt(myNumber, 8));
 int bNum = Integer.parseInt(myNumber, 8);
 binary = Integer.toBinaryString(bNum);
 int hNum = Integer.parseInt(myNumber, 8);
 hexadeci = Integer.toHexString(hNum);
 System.out.println("Your octal number " + myNumber + ", is converted to:");
 System.out.println("Decimal: " + decimal + "\nBinary: " + binary + "\nHexadecimal: " + hexadeci);
 System.out.println("\nChoose a number system to start converting again. \nType STOP to terminate the program.");
 } catch (NumberFormatException nfe) {
 System.out.println("Error! Not a convertible value! \nChoose another number system to start converting again, or \ntype STOP to terminate the program");
 }
 } else if (myChoice.equals("4")) {
 try {
 System.out.println("You have chosen Hexadecimal Number System");
 System.out.println("Enter a hexadecimal number to convert");
 String myNumber = sc.nextLine();
 decimal = Integer.toString(Integer.parseInt(myNumber, 16));
 int bNum = Integer.parseInt(myNumber, 16);
 binary = Integer.toBinaryString(bNum);
 int oNum = Integer.parseInt(myNumber, 16);
 octal = Integer.toOctalString(oNum);
 System.out.println("Your hexadecimal number " + myNumber + ", is converted to:");
 System.out.println("Decimal: " + decimal + "\nBinary: " + binary + "\nOctal: " + octal);
 System.out.println("\nChoose a number system to start converting again. \nType STOP to terminate the program.");
 } catch (NumberFormatException nfe) {
 System.out.println("Error! Not a convertible value! \nChoose another number system to start converting again, or \ntype STOP to terminate the program");
 }
 } else {
 System.out.println("Error! Choice is not in the list! \n Choose an existing choice to proceed!");
 }
 }
 }
 }