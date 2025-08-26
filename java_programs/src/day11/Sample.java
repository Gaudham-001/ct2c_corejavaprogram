package day11;

public class Sample {

	public static void main(String[] args) {
		// TOD O Auto-generated method stub
		try {
		int a[]=new int[5];
		a[0] = 11;
		a[1] = 12;
		System.out.println(a[66]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Exception: "+ e.getMessage());
		}
		System.out.println("nextLine()");

	}

}
