package j0724;

public class exam07 {

	public static void main(String[] args) {
		// 반복문 - do while
		int sum=0; 
		int i=1;
		for(i=1; i<=10; i++) {         //밖에서 int i=1;, for(i=1; ; )이라고 설정
			System.out.printf("%d\n", i);
			sum=sum+i;
		}
        System.out.printf("sum : %d\n", sum);
        
        
        
        sum=0;
        i=1;
        while(i<=10) {
        	System.out.printf("%d\n" , i);
        	sum=sum+i;
        	i++;
        }
        System.out.printf("sum은 %d\n", sum);
        
	
        
        
        sum=0;
	    i=1;
        do{
        	System.out.printf("%d\n" , i);
        	sum=sum+i;
        	i++;
        }while(i<=10);
        System.out.printf("sum은 %d\n", sum);
	}

}
