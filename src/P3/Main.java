package P3;

public class Main {
    public static void main(String[] args){
        int[] num = {1,3,4};
        boolean status =  isDuplicate(num);
        System.out.println("Duplication : " + status);
    }
    public static boolean isDuplicate(int[] nums){
        boolean value = false;
        for(int i=0 ;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    value =true;
                }
            }
        }
        return value;
    }
}
