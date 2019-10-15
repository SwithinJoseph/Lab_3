package co.grandcircus;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		int userNum;
		String userName;
		
		Scanner scnr = new Scanner(System.in);

		System.out.println("Hi! What's your name?");
		userName = scnr.next();
		System.out.println("Okay " + userName);
		System.out.println("Please enter a number from 1 to 100: ");
		userNum = scnr.nextInt();
		System.out.println("You chose " + userNum);

		if (userNum >= 0 && userNum <= 100) {
			if (userNum % 2 != 0) {
				System.out.println(userNum + " is odd.");
			} else if ((userNum % 2 == 0) && (userNum >= 2 && userNum <= 25)) {
				System.out.println("even and less than 25.");
			} else if ((userNum % 2 == 0) && (userNum >= 26 && userNum <= 60)) {
				System.out.println("Even.");
			} else if ((userNum % 2 == 0) && (userNum > 60)) {
				System.out.println(userNum + " is even.");
			} else if ((userNum % 2 != 0) && (userNum > 60)) {
				System.out.println(userNum + " is odd and over 60.");
			}
		} else {
			System.out.println("That is not a valid number " + userName + "!!!");
		}
		System.out.println("Goodbye!");
	}

}