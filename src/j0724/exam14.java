package j0724;

public class exam14 {

	public static void main(String[] args) {
		//
		
		double[]gradeArr= {90, 70.35, 80, 69, 51.5, 89.5, 75, 82, 45, 32.3};
		double sum=0;
		for(int i=0; i<gradeArr.length; i++) {
			sum=sum+gradeArr[i];
		}
		double avg=sum/gradeArr.length;
		System.out.printf("합계 : %.2f\n", sum);
		System.out.printf("평균 : %.2f\n", avg);
		

	}

}
