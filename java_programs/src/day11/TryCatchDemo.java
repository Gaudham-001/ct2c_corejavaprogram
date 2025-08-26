package day11;
import java.util.*;

public class TryCatchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		try {
			TryCatch.divide(a,b);
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		

	}

}
