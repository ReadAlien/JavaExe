package ch02.operator02;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("덧셈 연산 \n");
		System.out.println("1번째 숫자");
		int num0 = sc.nextInt();
		System.out.println("2번째 숫자");
		int num1 = sc.nextInt();
		
		System.out.println("결과 : " + num0 + num1);
		
		sc.close();
	}
}
