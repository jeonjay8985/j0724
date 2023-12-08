package j0724;

import java.util.Scanner;

public class exam16 {

	public static void main(String[] args) {
		// 실습02
		
		Scanner s1=new Scanner(System.in);
		System.out.print("등수를 입력하세요 : ");
		int score=s1.nextInt();
		switch(score) {
			case 1:
				System.out.println("아주잘했습니다");
				break;
			case 2:
				System.out.println("잘했습니다");
				break;
			case 3:
				System.out.println("잘했습니다");
				break;
			case 4:
				System.out.println("보통입니다");
				break;
			case 5:
				System.out.println("보통입니다");
				break;
			case 6:
				System.out.println("보통입니다");
				break;
			default:
				System.out.println("노력해야겠습니다");
	
	  }
	}
}
