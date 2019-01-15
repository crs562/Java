
public class DoWhileAssignment {

	public static void main(String[] args) {
java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// Write a program to print 10 even numbers and 10 odd numbers.
		int i = 0;
		do {
			if(i%2 == 0)
				System.out.printf("%d is even\n", i);
			else
				System.out.printf("%d is odd\n", i);
			i = i + 1;
		} while(i < 20);
		
		// Write a program to find factorial of a number.
		System.out.print("Please Enter your number: ");
		int factNo = sc.nextInt();
		int factorial = 1;
		int j = 1;
		do {
			factorial = factorial * j;
			j = j + 1;
		} while (j <= factNo);
		System.out.printf("%d! = %d\n", factNo, factorial);
		
		// Write a program to generate tables of 10.
		int k = 1;
		do {
			int intNo = 10 * k;
			System.out.printf("%d * 10 = %d\n", k, intNo);
			k = k + 1;
		} while (k <= 10);
		
		// Write a program to add the digits of a number.
		System.out.print("Please Enter your number: ");
		int numberDigit = sc.nextInt();
		if (numberDigit > 0) {
			int length = String.valueOf(numberDigit).length();
			int sumDigit = 0;
			int originalNumber = numberDigit;
			int l = 1;
			do {
				sumDigit = sumDigit + (numberDigit % 10);
				numberDigit = (numberDigit / 10);
				l = l + 1;
			} while (l <= length);
			System.out.printf("Sum of digit of a number %d is %d\n", originalNumber, sumDigit);
		}
		
		// Write a program to reverse the digits of a number
		System.out.print("Please Enter your number: ");
		int numberReverse = sc.nextInt();
		if (numberReverse > 0) {
			int lengthReverse = String.valueOf(numberReverse).length();
			int reverseNumber = 0;
			int originalReverse = numberReverse;
			int m = 1;
			do {
				int temp1 = (numberReverse % 10);
				int temp2 = (int) Math.pow(10, (lengthReverse - m));
				int temp = (temp1 * temp2);
				reverseNumber = reverseNumber + temp;
				numberReverse = (numberReverse / 10);
				m = m + 1;
			} while (m <= lengthReverse);
			System.out.printf("Reverse number of number %d is %d\n", originalReverse, reverseNumber);
		}
		
		// Write a program to generate 10 Fibonacci number.
		int startNo = 0;
		int nextNo = 1;
		int result;
		System.out.print("10 Fibonacci Numbers are: ");
		System.out.printf("%d\t", startNo);
		System.out.printf("%d\t", nextNo);
		int n = 1;
		do {
			result = startNo + nextNo;
			startNo = nextNo;
			nextNo = result;
			System.out.printf("%d\t", result);
			n = n + 1;
		} while (n <= 8);
		System.out.println();
		
		sc.close();

	}

}
