package test.main;

public class MainClass01 {

	// javascript와 java의 배열은 많이 다르다. (java배열의 활용도가 더 떨어진다. 그렇지만 알아두어야 한다.)
	// java에선 방의 개수 늘이거나 줄이는 것 불가
	
	public static void main(String[] args) {
		// int type 5개를 저장하고 있는 배열 객체를 생성해서 참조값을 nums라는 지역변수에 담기
		int[] nums= {10, 20, 30, 40, 50}; //int[] : int배열 type
		//double type 5개를 저장하고 있는 배열
		double[] nums2= {10.1, 10.2, 10.3, 10.4, 10.5};
		//boolean type 5개를 저장하고 있는 배열
		boolean[] truth= {true, false, false, true, true};
		//String type(참조 data type) 5개를 저장하고 있는 배열
		String[] names= {"김구라","해골","원숭이","주뎅이","덩어리"};
		
		//배열의 각각의 방 참조하기
		int result1=nums[0]; //10
		double result2=nums2[1];//10.2
		boolean result3=truth[2];//false
		String result4=names[3];//"주뎅이"
		
		//배열 객체의 메소드와 필드 사용해보기
		int[] cloned=nums.clone(); //clone: 복제본을 만드는 것
		int[] copied=nums; //참조값 복사해주기
		//cloned와 copied의 차이 알아보기!
		int size=nums.length;
	
	}
}
