package Greedy;
import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder()); //Due to reverse i'm using Integer coins not int

        int countOfCoins = 0;
        int amount = 1059;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.print("Total Min no of coins to make the value is " + countOfCoins + "(");
        for(int i=0;i<ans.size();i++){
            if(i == (ans.size()-1)){
              System.out.print(ans.get(i)+")");  
            }else{
            System.out.print(ans.get(i) + "+");
            }
        }
    }
}
