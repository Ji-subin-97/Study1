package com.subinji.java;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력해주세요.");
		
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int output;
		
		output = input/4*10 + input%4;
		
		System.out.println(input);
		System.out.println(output);
		
		//새로운 코드 추가
	}

}
