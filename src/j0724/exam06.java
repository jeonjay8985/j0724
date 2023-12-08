package j0724;

public class exam06 {

	public static void main(String[] args) {
		// 반복문
		
		int sum=0; 
		for(int i=1; i<=10; i++) {         //int i는 포문 안에서만 활동. 다시 쓰고싶으면 밖에서 int i=1;, for(i=1; ; )이라고 설정
			System.out.printf("%d\n", i);
			sum=sum+i;
		}
        System.out.printf("sum : %d\n", sum);
        
        
        
        sum=0;
        int i=1;
        while(i<=10) {
        	System.out.printf("%d\n" , i);
        	sum=sum+i;
        	i++;
        }
        System.out.printf("sum은 %d\n", sum);
        
	
        
        
        sum=0;
	    int k=1;
        do{
        	System.out.printf("%d\n" , k);
        	sum=sum+k;
        	k++;
        }while(k<=10);
        System.out.printf("sum은 %d\n", sum);
	}
	
}


