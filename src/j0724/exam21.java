package j0724;

import java.util.Scanner;

public class exam21 {

	public static void main(String[] args) {
		// 실습07
		Scanner s1=new Scanner(System.in);
		
		System.out.print("처리할 수를 입력하세요 : ");
		int n=s1.nextInt();
		
		if(n >0) {  
			System.out.println("입력한 수는 +입니다.");
		}else if(n< 0) {
			System.out.println("입력한 수는 -입니다.");
		}else {
			System.out.println("입력한 수는 0입니다.");
		}
		

	}

}
