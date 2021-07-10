package com.java.july;

/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
*/

public class RunningSumof1dArray {

	public static void main(String[] args) {

		int array[] = new int[] { 1, 2, 3, 4 };
//		int array[] = new int[] { 1,1,1,1,1 };
//		int array[] = new int[] { 3, 1, 2, 10, 1 };
		
		int result[] = findRunningSumof1dArray(array);
		for (int value : result) {
			System.out.print(value + "  ");
		}
	}

	public static int[] findRunningSumof1dArray(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		return nums;
	}
}