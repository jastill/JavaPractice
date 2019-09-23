import java.util.Scanner;

public class quiz0c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intOne = 0;
		short shortOne = 0;
		byte byteOne = 0;		
		double doubleOne = 0;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter an integer : ");
		intOne = keyboard.nextInt();
		System.out.println(intOne);		
		
		System.out.println("Enter a short : ");
		shortOne = keyboard.nextShort();
		System.out.println(shortOne);		

		System.out.println("Enter an byte : ");
		byteOne = keyboard.nextByte();
		System.out.println(byteOne);
		
		System.out.println("Enter a double : ");
		doubleOne = keyboard.nextDouble();
		System.out.println(doubleOne);
		
		keyboard.close();
	}

}
