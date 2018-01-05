package LutforSir;

public class MaxNoFindingInArray {

	public static void main(String[] args) {
		int Roll [] = {1100, 109, 150};
		
		if (Roll[0]>Roll[1] && Roll[0]>Roll[2]) {
			System.out.println("Max no is " + Roll[0]);
		}
		else if (Roll[1]>Roll[2] ) {
			System.out.println("Max no is " + Roll[1]);
			
		}
		else {System.out.println("Max no is " + Roll[2]);
		
		
		}
	
	}
}
