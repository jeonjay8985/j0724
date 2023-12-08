package j0724;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		// Switch문
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n=s1.nextInt();
		switch(n) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		default:
		    System.out.println("잘못된 숫자입니다");
			
		}
		

	}

}
