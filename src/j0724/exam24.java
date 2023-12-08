package j0724;

public class exam24 {

	public static void main(String[] args) {
		// 실습10
		
	int even=0;
	int odd=0;
	
	for(int i=1; i<=100; i++) {
		if(i%2 ==0) {
			even +=i;
		}else  {
			odd +=i;
		}
	}
			System.out.println("1~100까지 수 중 짝수의 합: "+even);
			System.out.println("1~100까지 수 중 홀수의 합: "+odd);
		}
	 
	}


