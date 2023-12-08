package j0724;

import java.util.Scanner;

public class exam11 {

	public static void main(String[] args) {
		// 일차원배열 
		// 정수형 배열크기 10으로 생성
		// 각 배열 항목을 입력을 받아 값을 넣고-> 출력은 각 항목을 출력-> 마지막에 합계, 평균을 출력
		
		Scanner s1=new Scanner(System.in);
		
		int num[] = new int[10];
		
		for (int i=0; i<num.length; i++) {
			System.out.printf("num[%d] : ", i);
			num[i]=s1.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<num.length; i++) {
			System.out.printf("num[%d] : %d\n", i, num[i]);
			sum=sum+num[i];
		}
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.2f", (double)sum/num.length); //sum을 double로 임시로 형변환하여 나눠줌
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		/*
		int arr[] = new int[10]; 
		int num=0;
		int sum=0;
		for(int i=0 ; i<10; i++); {  
			System.out.println("정수 입력: ");
			num=s1.nextInt();
			arr[i]=num;
			sum=num+i;
			i++;
		}
			System.out.printf("합계 : %d", num);
        */
	}

}
