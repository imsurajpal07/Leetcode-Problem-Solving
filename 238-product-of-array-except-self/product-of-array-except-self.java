class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int prefix = 1;
        int suffix = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = prefix;
            prefix = arr[i] * nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = suffix * arr[i];
            suffix = suffix * nums[i];
        }
        return arr;
    }
}