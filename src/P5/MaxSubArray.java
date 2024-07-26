package P5;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray(nums);
    }

    public static void MaxSubArray(int[] nums) {
        int sum;
        int max = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
             sum = nums[i];
            for (int j = i+1;j < nums.length; j++){
                sum = sum + nums[j];
                if (sum > max){
                    max = sum;
                }
            }
        }
        System.out.println("Maximum Sub Array Sum : " + max);
    }
}
