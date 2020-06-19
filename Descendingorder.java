import java.util.Scanner;

public class Descendingorder {
	public static void main(String[] args) {


		int[] numbers = new int[10]; // array.length = 10


		int numElements = 0; // how many numbers are there? -- so it won't showing 0,0,0 when <10



		int i = 0; // number [index]


		Scanner scnr = new Scanner(System.in);



		System.out.println("Enter number, (max=10), separated by a space. -1 to exit :");



		int input = scnr.nextInt(); // taking the first number


		while (input != -1) {



			numbers[i] = input; // adding each number to the array



			i++;



			numElements++;



			input = scnr.nextInt(); // taking the next number



		}



		selectionSortDescendTrace(numbers, numElements);



		scnr.close();



	}


	public static void selectionSortDescendTrace(int[] numbers, int numElements) {



		for (int i = 0; i < numElements - 1; i++) { // taking 0th number


			int biggestIndex = i;



			for (int j = i + 1; j < numElements; j++) { // taking 0th + 1 number


				if (numbers[j] > numbers[biggestIndex]) { // comparing number[j] with the biggest index


					biggestIndex = j;

				}

			}



			int temporary = numbers[i];



			numbers[i] = numbers[biggestIndex];



			numbers[biggestIndex] = temporary;


			for (int k = 0; k < numElements; k++) { // printing the new sorted array in each i-th iteration



				System.out.print(numbers[k] + " ");



			}



			System.out.println();



		}


	}


}
