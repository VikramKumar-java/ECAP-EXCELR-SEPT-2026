package com.excelr.vikram;

import java.util.Scanner;

public class MajorMinor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age:");
		int a = sc.nextInt();
		if(a>=18) {
			System.out.println("the person is major");
		}
		else
			System.out.println("the person is minor");
		
	}
	
	

}
