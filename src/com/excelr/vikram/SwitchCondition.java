package com.excelr.vikram;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch(ch) {
		case '+':
			System.out.println("addition");
			break;
		case '-':
			System.out.println("sub");
			break;
		default:
			System.out.println("invalid");
			break;
		}
		System.out.println("Keep Learning....!!");
	}

}
