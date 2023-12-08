package j0724;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		// 조건문 02
		
		Scanner s1=new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num=s1.nextInt();
		
		if(num ==100) {                               
			System.out.printf("100과 같습니다");
		    }else if(num > 100) {
		    	System.out.printf("100보다 큽니다");
		    }else {
		    	System.out.printf("100보다 작습니다");
		    }
		
		
	}

}
