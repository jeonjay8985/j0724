package j0724;

import java.util.Scanner;

public class exam31 {
		
		public static void Method(int num) {
			int sum=0;
			for(int i=1; i<=num; i++) {
				sum=sum+i;
			}
			System.out.printf("1부터 5까지의 합은: %d 입니다", sum);
			
			
		}
		public static void main(String[] args) {
			// 매서드 실습17
			
			Scanner s1=new Scanner(System.in);
			System.out.println("1부터 x까지 합을 구하자");
			System.out.print("x의 값: ");
			int num=s1.nextInt();
			Method(num);
			
		
		
		}	
	  
	
}


