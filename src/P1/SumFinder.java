package P1;

public class SumFinder {
    public static void main(String[] args){
        int [] nums = {2,7,8,1,15};
        getIndeces(nums,9);
    }
    public static void getIndeces(int[] nums,int target ){
        int x=0;
        int y=0;
        for(int i=0;i <=nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                int sum = nums[i] + nums[j];
                if(sum==target){
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println("Output : "+ "["+x+","+y+"]");
    }
}

