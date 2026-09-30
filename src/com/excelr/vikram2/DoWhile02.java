package com.excelr.vikram2;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		int correct_pin = 1908;
		int entered_pin;
		do {
			System.out.println("enter the pin");
			entered_pin = sc.nextInt();
			if (entered_pin == correct_pin) {
				System.out.println("withdraw money");
			} else
				System.out.println("enter correct pin");
		} while (entered_pin != correct_pin);
		System.out.println("thank you...!!");

	}

}
