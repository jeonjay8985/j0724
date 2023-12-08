package j0724;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] myArr; //String myArr[]; [배열]선언구문 똑같음
		myArr=new String[3];
		                 //String [] myArr=new String[3];
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("3개의 문자열을 입력하세요 : ");
		
		for(int i=0; i<myArr.length; i++) {
			myArr[i]=s1.nextLine();
		}
		
 		for(int i=0; i<myArr.length; i++) {
 			System.out.printf("%s", myArr[i]);
 		}
	 
		
		 
		
		

	}

}
