import java.util.Scanner;

public class Decryption {
	
	public static void main(String[] args)
	{
		
		Scanner scnr = new Scanner(System.in);
		int fullNum = 0;
		int numDigit[];
		int temp;
		numDigit = new int[4];
		
		System.out.println("This program is an decryption test,");
		System.out.println("please enter a 4 digit encrypted integer.");
		
		fullNum = scnr.nextInt();
		System.out.println("Now decrypting.");
		
		for(int i = 0; i <= 3; i++)
		{
			numDigit[3-i] = (int) (fullNum / (Math.pow(10, i)) % 10);
		}
		for(int i = 0; i<= 3; i++)
		{
			numDigit[i] = (numDigit[i] + 3) % 10;
		}
		
		temp = numDigit[0];
		numDigit[0] = numDigit[2];
		numDigit[2] = temp;
		temp = numDigit[1];
		numDigit[1] = numDigit[3];
		numDigit[3] = temp;
		
		for(int i = 0; i<= 3; i++)
		{
			System.out.print(numDigit[i]);
		}
		
	}
}

