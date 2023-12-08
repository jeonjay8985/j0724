package j0724;

import java.util.Scanner;

public class exam22 {

	public static void main(String[] args) {
		// 실습08
		
		Scanner s1=new Scanner(System.in);
		System.out.println("1부터 n까지의 합 중에서 5000을 넘지 않는 가장 큰 합은? ");
	
		int sum=0;
		int i;
		
    	for( i=1;; i++) { //조건 없는 무한루프
    		sum += i;
    		if(sum>=5000) {
    			sum=sum-i;
    			break;
    		}
    	}
    	
    	System.out.print("1부터 99까지의 합이 "+sum+"입니다");
    }
	
		
		

}
	


