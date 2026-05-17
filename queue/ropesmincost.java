package queue;
import java.util.*;
// Given n ropes and there length are given connct two ropes at atime such that it has min cost
public class ropesmincost {
    public static int mincst(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;

        //Insert all ropes
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        while(pq.size() > 1){ //till priority queue is greater than 1
            int first = pq.remove(); //removes 1st smallest element from queue
            int second = pq.remove(); //removes 2nd smallest element from queue

            int sum = first + second;  //Cost by adding sum of two small lengths
            cost += sum;
            pq.add(sum); //Adding that cost to the queue
        }
        return cost;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};
        System.out.println(mincst(arr));
    }
}
