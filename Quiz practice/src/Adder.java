
public class Adder 
{
	private int numOne, numTwo, answer;
	
	public  void setNums(int n1, int n2)
	{
		numOne = n1;
		numTwo = n2;
	}

	public void add()
	{
		answer = numOne + numTwo;	
	}
	
	public void print()
	{
		//System.out.println(answer);
		System.out.println(numOne + " + " + numTwo + " = " + answer);
	}
	
	
}
