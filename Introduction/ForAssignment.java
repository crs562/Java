public class ForAssignment {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// Write a program to print 10 even numbers and 10 odd numbers.
		for(int i = 0; i < 20; i++) {
			if(i%2 == 0)
				System.out.printf("%d is even\n", i);
			else
				System.out.printf("%d is odd\n", i);
		}
		
		// Write a program to find factorial of a number.
		System.out.print("Please Enter your number: ");
		int factNo = sc.nextInt();
		int factorial = 1;
		for(int j = 1; j <= factNo; j++)
			factorial = factorial * j;
		System.out.printf("%d! = %d\n", factNo, factorial);
		
		// Write a program to generate tables of 10.
		for (int k = 1; k <= 10; k++) {
			int intNo = 10 * k;
			System.out.printf("%d * 10 = %d\n", k, intNo);
		}
		
		// Write a program to add the digits of a number.
		System.out.print("Please Enter your number: ");
		int numberDigit = sc.nextInt();
		if (numberDigit > 0) {
			int length = String.valueOf(numberDigit).length();
			int sumDigit = 0;
			int originalNumber = numberDigit;
			for (int l = 1; l <= length; l++) {
				sumDigit = sumDigit + (numberDigit % 10);
				numberDigit = (numberDigit / 10);
			}
			System.out.printf("Sum of digit of a number %d is %d\n", originalNumber, sumDigit);
		}
		
		// Write a program to reverse the digits of a number
		System.out.print("Please Enter your number: ");
		int numberReverse = sc.nextInt();
		if (numberReverse > 0) {
			int lengthReverse = String.valueOf(numberReverse).length();
			int reverseNumber = 0;
			int originalReverse = numberReverse;
			for (int m = 1; m <= lengthReverse; m++) {
				int temp1 = (numberReverse % 10);
				int temp2 = (int) Math.pow(10, (lengthReverse - m));
				int temp = (temp1 * temp2);
				reverseNumber = reverseNumber + temp;
				numberReverse = (numberReverse / 10);
			}
			System.out.printf("Reverse number of number %d is %d\n", originalReverse, reverseNumber);
		}
		
		// Write a program to generate 10 Fibonacci number.
		int startNo = 0;
		int nextNo = 1;
		int result;
		System.out.print("10 Fibonacci Numbers are: ");
		System.out.printf("%d\t", startNo);
		System.out.printf("%d\t", nextNo);
		for (int n = 1; n <= 8; n++) {
			result = startNo + nextNo;
			startNo = nextNo;
			nextNo = result;
			System.out.printf("%d\t", result);
		}
		System.out.println();
		
		sc.close();

	}

}
