package test.main;

public class MainClass02 {

	public static void main(String[] args) {
		//기본 데이터type double
		double num1=10.1;
		
		//참조 data type Double		
		Double num2=10.2;
		
		//참조 datatype Double이지만 마치 기본 datatype과같이 쓸 수 있따
		 double result1=num1+10;
		 double result2=num1+num2;
		 Double result3=num1+num2;

		double result4=Double.parseDouble("1.1");
		System.out.println(result4);
	}
}
