package java.com.july;

/*Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2  */

public class MaxConsecutiveOnes {

	public static void main(String[] args) {

		int array[] = new int[] { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(array));

	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;      //to store the maximum occurrence of one's
		int counter = 0;  //to store number of consecutive one's

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				counter++;
			} else {
				if (max <= counter) {
					max = counter;
				}
				counter = 0;
			}

		}
		
		if (max > counter)
			return max;
		else
			return counter;
	}
}
