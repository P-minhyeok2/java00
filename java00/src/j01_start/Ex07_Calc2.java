package j01_start;

import java.util.Scanner;

public class Ex07_Calc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1, num2; //입력하는 수
		String operator;
		String next;
		
	
		do {
			System.out.println("첫번째 숫자, 부호, 두번째 숫자 순으로 입력하시오.");
			num1 = sc.nextInt();
			operator = sc.next();
			num2 = sc.nextInt();
			
			switch(operator) {
			case "+": 
				System.out.println("결과=" + (num1+num2));
				break;
			case "-": 
				System.out.println("결과=" + (num1-num2));
				break;
			case "*": 
				System.out.println("결과=" + (num1*num2));
				break;
			case "/": 
				System.out.println("결과=" + (num1/num2));
				break;
			default: 
				System.out.println("잘못된 값입니다.");
			}
			System.out.println("더 입력하실 거면 y를 입력하세요.");
			next = sc.next();
		}while(next.equals("y"));
	}//main

}//class
