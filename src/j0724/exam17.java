package j0724;

import java.util.Scanner;

public class exam17 {

	public static void main(String[] args) {
		// 실습03
		
		  Scanner s1 = new Scanner(System.in);
		  
		  System.out.println("두 개의 실수를 입력하세요"); 
			
			System.out.print("실수1 입력 : "); 
			float num1=s1.nextFloat();
			System.out.print("실수2 입력 : "); 
			float num2=s1.nextFloat();
			
			float result1=num1+num2;
			System.out.println("두 수의 합은 "+result1+" 입니다");
			
			float result2=(num1+num2)/2;
			System.out.println("두 수의 평균은 "+result2+" 입니다");

	}

}
