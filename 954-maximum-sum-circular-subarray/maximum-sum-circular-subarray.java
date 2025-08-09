class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = getTotalSum(nums);
        int kadaneMaxSum = getKadaneMaxSum(nums);
        int kadaneMinSum = getKadaneMinSum(nums);

        int maxSubarraySumCircular = Integer.max(kadaneMaxSum, (totalSum - kadaneMinSum));
        return maxSubarraySumCircular != 0 ? maxSubarraySumCircular : kadaneMaxSum;
    }

    public int getTotalSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public int getKadaneMaxSum(int[] nums) {
        int maxSum = nums[0];
        int currentMaxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMaxSum = Integer.max(nums[i], currentMaxSum + nums[i]);
            maxSum = Integer.max(currentMaxSum, maxSum);
        }
        return maxSum;
    }

    public int getKadaneMinSum(int[] nums) {
        int minSum = nums[0];
        int currentMinSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMinSum = Integer.min(nums[i], currentMinSum + nums[i]);
            minSum = Integer.min(currentMinSum, minSum);
        }
        return minSum;
    }
}