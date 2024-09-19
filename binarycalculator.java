
import java.util.Scanner;
public class binarycalculator {
public static void main(String[] args) {
String stop = "1234";
do{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a decimal number: ");
String val = sc.next();
try{
int i = Integer.parseInt(val);
System.out.println("Binary equivalent of "+val+" is : ");
System.out.println(Integer.toBinaryString(i));
}catch(NumberFormatException e){
System.out.println("STOP!");
stop = "STOP";
}
} while (stop != "STOP");
}
}