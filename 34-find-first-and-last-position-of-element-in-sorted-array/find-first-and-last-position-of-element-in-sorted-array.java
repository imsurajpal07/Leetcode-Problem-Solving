class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = findPosition(nums, target, true);
        int second = findPosition(nums, target, false);
        int[] arr = { first, second };
        return arr;
    }

    private int findPosition(int[] nums, int target, boolean first) {
        int low = 0, high = nums.length - 1, pos = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                pos = mid;
                if (first) {
                    high = mid - 1; // move left
                } else {
                    low = mid + 1; // move right
                }
            }
        }
        return pos;
    }
}