package j0724;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		// 조건문 01
		
		Scanner s1=new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num=s1.nextInt();
		
		if(num % 2 ==0) {                                //참일때(짝수일때)만 실행되는 단순 이프문
			System.out.printf("%d는 짝수입니다", num);
		    }else {
		    	System.out.printf("%d는 홀수입니다", num);
		    }
		
		
		
		
		

	}

}
