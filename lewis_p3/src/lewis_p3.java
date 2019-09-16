import java.util.Scanner;

public class lewis_p3 {

	public static void main(String[] args) {
		//Initiate variables that will be used
		int i;
		int j;
		final int NUM_TOPICS = 5;
		int numRaters;
		int tempResponse;
		int max;
		int min;
		int maxPlace = 0;
		int minPlace = 0;
		double average;
		
		//Initiate scanner
		Scanner scnr = new Scanner(System.in);
		
		//Initiate the arrays
		String[] topics = {"Healthcare", "Environment", "Education", "Unemployment", "Crime"};
		int[][] responses = new int[NUM_TOPICS][10];
		int[] sums = new int[NUM_TOPICS];
		int[] sampleResponses = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("How many users will be taking the survey?");
		numRaters = scnr.nextInt();
		
		//Assign values to responses array
		max = sums[0];
		min = sums[0];
		System.out.println("\nPlease rate each topic from 1 (least important) to 10 (most important).");
		for (i = 0; i < numRaters; ++i) {
			System.out.println("\n*** USER " + (i+1) + " ***");
			for (j = 0; j <  NUM_TOPICS; ++j) {
				System.out.println("User " + (i+1) + ", please rate the topic of " + topics[j] + ":");
				tempResponse = scnr.nextInt();
				responses[j][tempResponse-1] = responses[j][tempResponse-1] + 1;
				sums[j] = sums[j] + tempResponse;
				if(sums[j] > max) {
					max = sums[j];
					maxPlace = j;
				}
				if(sums[j] < min) {
					min = sums[j];
					minPlace = j;
				}
			}
		}
		
		//Print out survey response options at the top
		System.out.print("\nResponse Options:\t");
		for (i = 0; i <  10; ++i) {
			System.out.print(sampleResponses[i] + "\t");
		}
		System.out.println("");
		
		//Print off divider between response options and actual responses
		System.out.print("-----------------\t");
		for (i = 0; i <  10; ++i) {
			System.out.print("-\t");
		}
		System.out.println("");
		
		//Print out portion of report with responses
		for (i = 0; i <  NUM_TOPICS; ++i) {
			System.out.print(topics[i] + ":\t\t");
			if(topics[i].contentEquals("Crime")) {
				System.out.print("\t");
			}
			for (j = 0; j <  10; ++j) {
				System.out.print(responses[i][j] + "\t");
			}
			average = sums[i]/((double) numRaters);
			System.out.printf("|\tAverage Rating: %.2f\n", average);
		}
		
		//Print out max and min topics with points
		System.out.println("\nTopic with Highest Point Total:\t" + topics[maxPlace] + ", " + sums[maxPlace] + " points");
		System.out.println("Topic with Lowest Point Total:\t" + topics[minPlace] + ", " + sums[minPlace] + " points");
		
	}

}
