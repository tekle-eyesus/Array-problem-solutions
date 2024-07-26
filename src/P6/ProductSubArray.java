package P6;

public class ProductSubArray {
    public static void main(String[] args){
        int nums[] = {2,3,-2,4};
        getMaxProduct(nums);
    }
    public static void getMaxProduct(int[] nums){
            int product;
            int max = nums[0];
            for (int i = 0; i < nums.length-1; i++) {
                product = nums[i];
                for (int j = i+1;j < nums.length; j++){
                    product = product * nums[j];
                    if (product > max){
                        max = product;
                    }
                }
            }
            System.out.println("Maximum Sub Array Product : " + max);
    }
}
