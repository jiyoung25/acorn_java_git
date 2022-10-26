package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//0으로 초기화된 방 3개짜리 int[]객체를 만들어서 참조값을 지역변수 nums에 담기
		int[] nums= {0, 0, 0}; // = int[] nums = new int[3];
		//0번방에 10, 1번방에 20, 2번방에 30을 저장해보세요
		
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		
		//0으로 초기화된 방 100개짜리 int[]객체를 만들어서 참조값을 지역변수 nums2에 담기
		int[] nums2 = new int[100]; //int 배열 타입~~~~~~ 기억하자 )^)^)^)^
		//nums2[100]=30; //100번 방은 존재하지 않는데 100번방에 숫자를 넣으면 오류가 발생한다. (이곳엔 0~99번 방이 있음)
		
		System.out.println("main 메소드가 정상 종료됩니다.");
		
	}

}
