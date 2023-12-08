package j0724;

import java.util.Scanner;

public class exam15 {

	public static void main(String[] args) {
		// 실습 01
		
		Scanner s1=new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int num=s1.nextInt();
		
		if(num>=19) {
			System.out.println("성년입니다");
		}else if (num<19) {
			System.out.println("미성년입니다");

	  }

	}
	
}
