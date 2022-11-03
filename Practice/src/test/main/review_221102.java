package test.main;

public class review_221102 {
	
	static int num1;
	static int num2;
	
	static int divide(int num1, int num2) {
		num1=num1;
		num2=num2;
		int di= num1/num2;
		return di;
	}
	public static void rr(){
		try {
			divide(num1,num2);
			System.out.println(divide(num1,num2));
		} catch(Exception e) {
			System.out.println("제대로 된 숫자로 나눠라.");
		} finally {
			System.out.println("중요한 작업중");
		}
	}
	
	public static void main(String[] args) {
		num1=1;
		num2=0;
		rr();
	}
}
