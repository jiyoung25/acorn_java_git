package test.mypac;

public class Water {
	
	public int num;
	public String name;
	
	public void waterOut(){
		System.out.println(num+"번째 "+name+"에서 물이 나옵니다.");
		num++;
	}
	
	public void waterIn() {
		System.out.println(num+"번째 "+name+"에 물을 채웁니다.");
		num++;
		
	}

}
