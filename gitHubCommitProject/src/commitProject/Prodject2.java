package commitProject;

import java.util.Scanner;

public class Prodject2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter you favorite person, ever: ");
		
		String L = in.nextLine();
		
		System.out.println("This person is the best: " + L);
		
		in.close();

	}

}
