package lewis_p1;

import java.util.Scanner;

public class lewis_p1_decrypt {

	public static void main(String[] args) {
		//initialize variables that are used
		int i;
		int tempVal;
		
		//Set up scanner
		Scanner scnr = new Scanner(System.in);
				
		//Create int's to save each decrypted digit
		int[] decryptedDigits = new int[4];
		
		//Collect encrypted password from user input
		System.out.print("Please enter a 4-digit encrypted password: ");
		int encryptedCode = scnr.nextInt();
				
		//Decrypt digits
		decryptedDigits[0] = ((encryptedCode / 1000) + (10 - 7)) % 10;
		decryptedDigits[1] = (((encryptedCode / 100) % 10) + (10 - 7)) % 10;
		decryptedDigits[2] = (((encryptedCode / 10) % 10) + (10 - 7)) % 10;
		decryptedDigits[3] = ((encryptedCode  % 10) + (10 - 7)) % 10;
		
		//Rearrange numbers 1 and 3
		tempVal = decryptedDigits[0];
		decryptedDigits[0] = decryptedDigits[2];
		decryptedDigits[2] = tempVal;
		
		//Rearrange numbers 2 and 4
		tempVal = decryptedDigits[1];
		decryptedDigits[1] = decryptedDigits[3];
		decryptedDigits[3] = tempVal;
				
		//Output decrypted password
		System.out.print("Encrypted Password: ");
		for (i = 0; i < 4; ++i) {
			System.out.print(decryptedDigits[i]);
		}
		System.out.println("");

	}

}
