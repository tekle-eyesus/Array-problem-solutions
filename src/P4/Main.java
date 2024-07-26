package P4;

public class Main {
    public static void main(String[] args) {
        int[] arry = {-1,1,0,-3,3};
        getSumArry(arry);
    }

    public static void getSumArry(int[] nums) {
        int[] test = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    product = product * nums[j];
                }
            }
            test[i] = product;
        }
        for (int k = 0; k < test.length; k++) {
            System.out.print(test[k] + ", ");

        }

    }
}