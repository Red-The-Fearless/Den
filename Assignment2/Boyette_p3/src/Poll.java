import java.util.Scanner;

public class Poll {
	
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		String topic[] = new String[5];
		int responses[][];
		int numUsers;
		double avg[] = new double[5];
		double temp = 0;
		
		topic[0] = "FPS";
		topic[1] = "RPG";
		topic[2] = "RTS";
		topic[3] = "ADV";
		topic[4] = "ACT";
		
		System.out.println("This program polls multiple users for their rating of 5 separate video game genres.");
		System.out.print("Input the number of users: ");
		numUsers = scnr.nextInt();
		
		responses = new int[5][numUsers];
		
		for(int i = 0; i < numUsers; i++)
		{
			System.out.println("User " + (i+1) + ", rate the genres:");
			
			for(int j = 0; j < 5; j++)
			{
				System.out.print(topic[j] + ": ");
				responses[j][i] = scnr.nextInt();
			}
		}
		
		System.out.println("The following table lists the genres rated by the users:");
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print(topic[i] + ": ");
			
			for(int j = 0; j < numUsers; j++)
			{
				System.out.print(responses[i][j] + "| ");
				temp += responses[i][j];
			}
			
			avg[i] = temp / numUsers;
			temp = 0;
			System.out.println("Average = " + avg[i]);
		}
		
		if(avg[0] > avg[1] && avg[0] > avg[2] && avg[0] > avg[3] && avg[0] > avg[4])
		{
			System.out.println("The highest rated genre is " + topic[0] + " with an average rating of " + avg[0]);
		}
		else if(avg[1] > avg[0] && avg[1] > avg[2] && avg[1] > avg[3] && avg[1] > avg[4])
		{
			System.out.println("The highest rated genre is " + topic[1] + " with an average rating of " + avg[1]);
		}
		else if(avg[2] > avg[1] && avg[2] > avg[0] && avg[2] > avg[3] && avg[2] > avg[4])
		{
			System.out.println("The highest rated genre is " + topic[2] + " with an average rating of " + avg[2]);
		}
		else if(avg[3] > avg[1] && avg[3] > avg[2] && avg[3] > avg[0] && avg[3] > avg[4])
		{
			System.out.println("The highest rated genre is " + topic[3] + " with an average rating of " + avg[3]);
		}
		else if(avg[4] > avg[1] && avg[4] > avg[2] && avg[4] > avg[0] && avg[4] > avg[3])
		{
			System.out.println("The highest rated genre is " + topic[4] + " with an average rating of " + avg[4]);
		}
		else
		{
			System.out.print("All of the averages are the same.");
		}
		
		if(avg[0] < avg[1] && avg[0] < avg[2] && avg[0] < avg[3] && avg[0] < avg[4])
		{
			System.out.println("The lowest rated genre is " + topic[0] + " with an average rating of " + avg[0]);
		}
		else if(avg[1] < avg[0] && avg[1] < avg[2] && avg[1] < avg[3] && avg[1] < avg[4])
		{
			System.out.println("The lowest rated genre is " + topic[1] + " with an average rating of " + avg[1]);
		}
		else if(avg[2] < avg[1] && avg[2] < avg[0] && avg[2] < avg[3] && avg[2] < avg[4])
		{
			System.out.println("The lowest rated genre is " + topic[2] + " with an average rating of " + avg[2]);
		}
		else if(avg[3] < avg[1] && avg[3] < avg[2] && avg[3] < avg[0] && avg[3] < avg[4])
		{
			System.out.println("The lowest rated genre is " + topic[3] + " with an average rating of " + avg[3]);
		}
		else if(avg[4] < avg[1] && avg[4] < avg[2] && avg[4] < avg[3] && avg[4] < avg[0])
		{
			System.out.println("The lowest rated genre is " + topic[4] + " with an average rating of " + avg[4]);
		}
	}

}
