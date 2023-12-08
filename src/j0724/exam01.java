package j0724;

public class exam01 {

	public static void main(String[] args) {
		// 프린트 명령문-데이터 출력
		int num=100;
		double d1=120.4;
		String str="korea";
		System.out.print("num: " +num+"\n");    //줄바꿈없음 html br태그와 같은 기능 = \n
		System.out.println("num : "+num); //줄바꿈있음
		System.out.printf("%d\n", num); //형식(포맷)지정, 정수는d 실수는f 문자는 string %10d 자릿수정해줌 6.2 =>전체자리수 6 소수점 2
		System.out.printf("%.2f\n", d1);
		System.out.printf("%s\n", str); //10s = 10자리 문자
		

	}

}
