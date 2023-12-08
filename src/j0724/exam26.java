package j0724;

import java.util.Scanner;

public class exam26 {

	public static void main(String[] args) {
		// 실습12
		
		Scanner s1=new Scanner(System.in);
		int sum=0;
		
		System.out.println("시작값 입력 : ");
		int start=s1.nextInt();
		System.out.println("끝값 입력 : ");
		int end=s1.nextInt();
		System.out.println("증가값 입력 : ");
		int plus=s1.nextInt();
		
		for(int i=start; i<=end; i=i+plus) {         
			sum=sum+i;
		}
			
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : ", start, end, plus);
		System.out.printf("%d", sum);
			
        
		
	}

	}
	

