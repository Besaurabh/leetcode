class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};  // 1-based index
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        // If no solution is found, though the problem guarantees one exists
        return new int[]{-1, -1};
    }
}