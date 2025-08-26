package Day12;
import java.util.*;

import java.util.Scanner;

public class CheckAge {
	
	public void checkAge(int age) throws InvalidAgeException {
		if (age<18) {
			throw new InvalidAgeException("Invalid age...");
		}
		
	}


}
