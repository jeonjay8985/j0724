package j0724;

import java.util.Scanner;

public class exam19 {

	public static void main(String[] args) {
		// 실습05
		
		Scanner s1=new Scanner(System.in);
		
		System.out.print("첫번째 계산할 값을 입력하세요 ==> ");
		int num1=s1.nextInt();
		
		System.out.print("+ - * / % ==> ");
		String calcule=s1.next();
		
		System.out.print("두번째 계산할 값을 입력하세요 ==> ");
		int num2=s1.nextInt();
		
		
		if(calcule.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if(calcule.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if(calcule.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		} else if(calcule.equals("/")) {
			if(num2==0) {
				System.out.println("0으로 나누면 안됩니다");
		  }else { 
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		  }
		}    
	  }
	}


