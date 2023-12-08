package j0724;

import java.util.Scanner;

public class exam23 {

	public static void main(String[] args) {
		// 실습09
		
		Scanner s1=new Scanner(System.in);
		
		int sum=0;
		int i;
		i=1;
    	while(true) {  //true 무한루프
    		sum += i;
    		if(sum>=5000) {
    			sum=sum-i;
    			break;
    		}
    		i++;
    	}
    	
    	System.out.print("1부터 99까지의 합이 "+sum+"입니다");


    	}
    	
	}

