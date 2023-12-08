package j0724;

import java.util.Scanner;

public class exam20 {

	public static void main(String[] args) {
		// 실습06, 짝수만 덧셈
		Scanner s1=new Scanner(System.in);
		
		int n=0;
		int sum=0;
		do {
			System.out.print("양의 정수 입력 : ");
			n=s1.nextInt();
			
		 if(n%2==0) {
			 sum+=n;}
		 
		}while(n>0);
		
		System.out.print("양의 정수 중 짝수만 덧셈한 결과 "+sum);

		}

		

	}


