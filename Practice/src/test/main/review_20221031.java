package test.main;

import java.util.ArrayList;
import java.util.List;

public class review_20221031 {
	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>();
		List<Integer> nums2=new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums2.addAll(nums);
		boolean a=nums.contains(1);
		boolean b=nums.equals(nums2);
		boolean c=nums.containsAll(nums2);
	}
}