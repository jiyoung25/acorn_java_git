package test.main;

public class fieldSave {
	
	static int num1;
	static int num2;
	static int sum(int n1, int n2) {
		fieldSave.num1=n1;
		fieldSave.num2=n2;
		int sum=num1+num2;
		return sum;
	};
	
	public static void main(String[] args) {
		num1=1;
		num2=2;
		
		System.out.println(sum(num1,num2));
		System.out.println(sum(3,4));
		System.out.println(sum(num1,num2));
	}

}
