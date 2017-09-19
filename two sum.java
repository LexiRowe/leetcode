class Solution {
    public int[] twoSum(int[] nums, int target) {
   	int[] result;
	result = new int[2];
	
	finish:
	for (int i = 0; i < nums.length-1; i++) {
		int odd = target - nums[i];
		for (int j = i+1; j < nums.length; j++) {
			if (odd== nums[j]) {
				result[0] = i;
				result[1] = j;
				break finish;
			}
		}
		
	}
    return result;
    }
}
