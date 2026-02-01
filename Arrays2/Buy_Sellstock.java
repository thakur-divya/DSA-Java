package Arrays2;

public class Buy_Sellstock { //Tie comp is O(n)
    public static int buysell(int prices[]){
        int buyingprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyingprice < prices[i]){
                maxprofit = Math.max(maxprofit, prices[i] - buyingprice); //calc profit with SP-BP
            }
            else{
                buyingprice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buysell(prices));
    }
}
