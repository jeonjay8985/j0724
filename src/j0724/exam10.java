package j0724;

public class exam10 {

	public static void main(String[] args) {
		// 배열
		
		int num[]=new int[10];           //배열 내부의 변수는 인덱스 0부터 시작함 
		
		for(int i=0 ; i<=9 ; i++) {     //i<=9 대신 i<=num.length 써도 됨. 대신 i<num 0~9까지
			num[i]=(i+1)*10;
			System.out.printf("num[%d]=%d\n", i, num[i]);
		}
		
		/*for(int i=0 ; i<num.length ; i++) {  
		  System.out.printf("num[%d]=%d\n", i, num[i]);
			*/
		}

	}


