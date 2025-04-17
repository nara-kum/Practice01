package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {
	public static void main(String[] args) {
		
		/*
		 사용자로부터 가로 세로 값을 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하세요
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		float w = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("세로 : ");
		float h = sc.nextFloat();
		sc.nextLine();
		
		float a = (w*h/2F);
		
		System.out.print("삼각형의 넓이는 " + a + " 입니다.");
		
		sc.close();
	}

}
