package j0724;

public class exam25 {

	public static void main(String[] args) {
		// 실습11

		int even=0;
		int odd=0;
		
		int i=1;
		
		while(i<=100) {
			if(i%2 ==0) {
				even +=i;
			}else  {
				odd +=i;
			}
			i++;
		}
				System.out.println("1~100까지 수 중 짝수의 합: "+even);
				System.out.println("1~100까지 수 중 홀수의 합: "+odd);
			}
}
