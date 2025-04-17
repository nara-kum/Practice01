package com.javaex.practice;

public class Ex24 {
	public static void main(String[] args) {
		
		/*
		 다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다.  
		 결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요. 
		*/
		
		double f = 80.0;
		
		System.out.println(5/9*(f-32.0));  // 5/9 가 정수형태로 0이나와서 무엇을 곱해도 0이 나오게 됨
		System.out.println((double)5/9*(f-32.0));  // 5/9 중에 하나라도 실수형으로 만들어 줌(자동)
	}

}
