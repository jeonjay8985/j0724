package j0724;

import java.util.Scanner;

public class exam29 {

		public static void Method(int a, int b, int c) {
			if(a<=b && a<=c) {
				System.out.print("최솟값은 "+a+"입니다");
			}else if (b<=a && b<=c) {
				System.out.print("최솟값은 "+b+"입니다");
			}else {
				System.out.print("최솟값은 "+c+"입니다");
				 
			}
			
		}
		public static void main(String[] args) {
			// 매서드 실습15
			
		Method(1, 3, 2);
	}

}
