class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        Arrays.sort(nums); 
        int n = nums.length; 
        int count = 1; 
        for (int i = 1; i < n ;i++){
            if (nums [i] == nums[i-1]){
                count++; 
            }
            if (nums[i] != nums[i-1])
                count = 1; 
            if (count > n/2){
                return nums[i-1]; 
            }
        }
        return 0;   
    }
}