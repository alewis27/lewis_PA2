package lewis_p1;

import java.util.Scanner;

public class lewis_p1_encrypt {

	public static void main(String[] args) {
		//initialize variables that are used
		int i;
		int tempVal;
		
		//Set up scanner
		Scanner scnr = new Scanner(System.in);
				
		//Create int's to save each new digit
		int[] digits = new int[4];
		
		//Collect password from user input
		System.out.print("Please enter a 4-digit password: ");
		int userCode = scnr.nextInt();
				
		//Encrypt digits
		digits[0] = ((userCode / 1000) + 7) % 10;
		digits[1] = (((userCode / 100) % 10) + 7) % 10;
		digits[2] = (((userCode / 10) % 10) + 7) % 10;
		digits[3] = ((userCode  % 10) + 7) % 10;
		
		//Rearrange numbers 1 and 3
		tempVal = digits[0];
		digits[0] = digits[2];
		digits[2] = tempVal;
		
		//Rearrange numbers 2 and 4
		tempVal = digits[1];
		digits[1] = digits[3];
		digits[3] = tempVal;
				
		//Output encrypted password
		System.out.print("Encrypted Password: ");
		for (i = 0; i < 4; ++i) {
			System.out.print(digits[i]);
		}
		System.out.println("");

	}

}
