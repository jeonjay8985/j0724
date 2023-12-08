package j0724;

public class exam13 {

	public static void main(String[] args) {
		//String [] myArr;
		//myArr=new String[3];
		
		String [] myArr = {"Hello", "Java", "Program"}; //배열의 크기가 3으로 초기값으로 들어감
		//myArr[0]-"Hello";
		//myArr[1]-"Java";
		//myArr[2]-"Program";
		for(int i=0; i<myArr.length; i++) {
			System.out.printf("%s\n", myArr[i]);
		}

	}

}
