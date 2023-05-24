package dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence_300 {

	public int lengthOfLIS(int[] nums) 
	{
	    int n = nums.length;
	    int[] dp = new int[n];
	    for (int i = 0; i < n; i++) 
	    {
	        int max = 1;
	        for (int j = 0; j < i; j++) 
	        {
	            if (nums[i] > nums[j]) 
	            {
	                max = Math.max(max, dp[j] + 1);
	            }
	        }
	        dp[i] = max;
	    }
	    return Arrays.stream(dp).max().orElse(0);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
