
import java.util.*;

public class NameReading {

	
	public static void main(String[] args) {
		System.out.print("Enter anything: ");
		Scanner name = new Scanner(System.in);
		String input = name.nextLine();

		
		
		
		for(int i = 0; i < input.length(); i++){
			
			System.out.println(input.charAt(i));
		}
	
		
	}

}
