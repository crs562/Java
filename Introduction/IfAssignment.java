
public class IfAssignment {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// Write a program to check if a candidate is eligible for voting or not.
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		if(age >= 18)
			System.out.println("You are good for Voting!");
		else
			System.out.println("Please wait untill you are 18 year old!");
		
		// Write a program to check if the number is positive or negative.
		System.out.println("Please Enter your Number: ");
		int number = sc.nextInt();
		if(number >= 0)
			System.out.printf("The number that you entered %d is positive\n", number);
		else
			System.out.printf("The number that you entered %d is negative\n", number);

		// Extend the previous program to check whether the given number is positive, zero or negative.
		System.out.println("Please Enter your Number: ");
		int numberZero = sc.nextInt();
		if(numberZero > 0)
			System.out.printf("The number that you entered %d is positive\n", numberZero);
		else if (numberZero == 0)
			System.out.printf("The number that you entered %d is Zero\n", numberZero);	
		else
			System.out.printf("The number that you entered %d is negative\n", numberZero);
		
		// Write a program to find largest of two number.
		System.out.println("Please Enter your 1st Number: ");
		int number1 = sc.nextInt();
		System.out.println("Please Enter your 2st Number: ");
		int number2 = sc.nextInt();
		if(number1 > number2)
			System.out.printf("The largest number in %d and %d is %d\n", number1, number2, number1);
		else if(number1 < number2)
			System.out.printf("The largest number in %d and %d is %d\n", number1, number2, number2);
		else
			System.out.printf("Your number %d and %d are the same\n", number1, number2);
		
		// Write a program to check given number is even or odd.
		System.out.println("Please Enter your Number: ");
		int evenOdd = sc.nextInt();
		if(evenOdd % 2 == 0)
			System.out.printf("The number that you entered %d is even\n", evenOdd);
		else
			System.out.printf("The number that you entered %d is odd\n", evenOdd);
		
		sc.close();
		
	}

}