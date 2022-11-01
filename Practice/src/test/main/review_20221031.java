package test.main;

import java.util.ArrayList;
import java.util.List;

public class review_20221031 {
	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>();
		List<Integer> nums2=new ArrayList<>();
		int[] numbers= {1231, 3452, 1562, 2234};
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		for(int i=0; i<numbers.length; i++) {
			nums2.add(i, numbers[i]);
		}
		
		List<String> str=new ArrayList<>();
		boolean a=nums.contains(1);
		boolean b=nums.equals(nums2);
		boolean c=nums.containsAll(nums2);
	}
}