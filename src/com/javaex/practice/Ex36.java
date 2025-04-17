package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args) {
		
		/*
		 동전별 개수를 입력받아 총금액을 계산하는 프로그램을 작성하세요. 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수 : ");
		int o = sc.nextInt();
		sc.nextLine();
		
		System.out.print("100원 개수 : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.print("50원 개수 : ");
		int os = sc.nextInt();
		sc.nextLine();
		
		System.out.print("10원 개수 : ");
		int s = sc.nextInt();
		sc.nextLine();
		
		int total = 500*o + 100*b + 50*os + 10*s;
		
		System.out.println("동전의 총합은 " + total + " 원 입니다.");
		
		sc.close();
	}

}
