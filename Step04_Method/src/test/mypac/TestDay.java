package test.mypac;

public class TestDay {
	public int d_day() {
		int num=31;
		return num-1;
	}
	public String Lucky() {
		int random = (int) Math.ceil(Math.random()*2);
		String luck = random % 2 == 0 ? "운이 좋아요.":"운이 나빠요.";
		return luck;
		/*
		 * if(random % 2 == 0) {
		 
			System.out.println("운이 좋아요");
		} else {
			System.out.println("운이 나빠요 ");
		}
		*/
	}

}
