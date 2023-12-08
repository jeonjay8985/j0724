package j0724;

import java.util.Scanner; //ctrl+sft+o

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-데이터 입력
		Scanner s1=new Scanner(System.in);
		
		/*
		System.out.print("정수 입력 : ");
        int num=s1.nextInt();
        System.out.printf("%d\n", num);
        
        System.out.print("실수 입력 : ");
        double d1=s1.nextDouble();
        System.out.printf("d1 :%.2f\n", d1);
        */
		
        System.out.print("주소 : ");
        String str1=s1.nextLine();             //String str1=s1.next();  엔터키도 하나의 문자로 인식->엔터치면 끝남, 주소등 한 줄로 입력할떄는 넥스트라인을 써야 함
        System.out.printf("%s\n", str1);  
        
        
        System.out.print("전화번호 : "); 
        String str2=s1.nextLine();
        System.out.printf("%s\n", str2);
        
		
		
		
		
	}

}
