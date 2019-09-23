
public class Folder 
{
	private int items;
	private double value;
	
	public Folder ( int it, double v) {
		items = it; value = v;
	}
	
	public void setItems(int it) { items = it; }
	public void setValue(double v ) {value = v;}
	
	public int getitems() { return items;}
	public double getvalue() { return value;}
	
	public String toString( ) {return "" + items + " " + value; } 	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Folder a = new Folder( 3.2, 4.8);
		System.out.println(a);
	}

}
