package j0724;

import java.util.Scanner;

public class exam28 {

	public static void main(String[] args) {
		// 실습14
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("손님 주문하시겠습니까?");
		
		int menu=0;
		do {
			System.out.println("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만 ==>");
			menu=s1.nextInt();
			
			if(menu<=1) {
				System.out.println("#카페라떼를 주문하셨습니다");
			}else if(menu<=2) {
				System.out.println("#카푸치노를 주문하셨습니다");
			}else if(menu<=3) {
				System.out.println("#아메리카노를 주문하셨습니다");
			}else {
				System.out.println("주문하신 커피 준비하겠습니다");
		  }
 
		}
		while(menu<4); 
			
	}

}
