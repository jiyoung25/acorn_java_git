package test.mypac;

public abstract class StudyJava {
	public int num;

	public void subject(int n) {
		this.num = n;
		System.out.println(n+"번째 과목인 Java를 공부해요.");
	}
	
	public abstract void Java (int n);
	
}
