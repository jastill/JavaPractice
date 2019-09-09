import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intOne = 0;
		int intTwo = 0;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Type two number to get the sum ");
		intOne = keyboard.nextInt();
		intTwo = keyboard.nextInt();
		System.out.println(intOne + intTwo);
		
		keyboard.close();
	}
}
