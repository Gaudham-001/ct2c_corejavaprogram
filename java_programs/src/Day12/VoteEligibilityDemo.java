package Day12;
import java.util.*;

public class VoteEligibilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			if (age>=18) {
				System.out.println("Yes You are eligible");
			}
		}
		catch(InvalidAgeException e) {
			System.err.println("Exception: "+e.getMessage());
		}

	}

}
