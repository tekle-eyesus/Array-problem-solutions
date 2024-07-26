package P2;

public class Price {
    public static void main(String[] args){
        int[] prices ={7,1,4,3,12} ;
        getMaximumPrice(prices);
    }
    public static void getMaximumPrice(int[] prices){
        int min = prices[0];

        int index=0 ;
        for(int i=0 ; i< prices.length ; i++){
            if(prices[i]<min){
                min = prices[i];
                index = i;
            }
        }
        int max  = prices[index];
        for(int j = index;j<prices.length;j++){
            if(prices[j]>max){
                max = prices[j];
            }
        }
        int profit = max - min;
        System.out.println("Maximum profit : " + profit);
    }
}
