import java.util.Scanner;

public class InputPractice {

	public static void main(String[] args) {
		int intOne = 0;
		double doubleOne = 0;
		short shortOne = 0;
		byte byteOne = 0;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter an integer : ");
		intOne = keyboard.nextInt();
		System.out.println(intOne);
		
		System.out.println("Enter a double : ");
		doubleOne = keyboard.nextDouble();
		System.out.println(doubleOne);
		
		System.out.println("Enter a short : ");
		shortOne = keyboard.nextShort();
		System.out.println(shortOne);
		
		System.out.println("Enter a byte : ");
		byteOne = keyboard.nextByte();
		System.out.println(byteOne);
		
		keyboard.close();
	}

}
