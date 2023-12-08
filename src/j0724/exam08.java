package j0724;

import java.util.Scanner;

public class exam08 {

	public static void Method(int num) {
		int sum=0;
		for(int i=1; i<=num; i++) {
			System.out.printf("%d\n", i);
			sum=sum+i;
		}
		System.out.printf("sum: %d\n", sum);
		
	}
	public static void main(String[] args) {
		// 매서드
		
		Scanner s1=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=s1.nextInt();
		Method(num);
	}

}
