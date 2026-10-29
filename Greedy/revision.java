package Greedy;

import java.util.*;

class revision{

    public static int activity(int start[],int end[]){

        int count = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int lastEnd = end[0];

        for(int i=1;i<start.length;i++){
            if(start[i] >= lastEnd){
                count++;
                lastEnd = end[i];
                ans.add(i);

            }
        }

        for(int i=0;i<ans.size();i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        return count;

    }
    public static void main(String[] args) {
        int start[] = {10,12,20};
        int end[] = {20,25,30};
        System.out.println(activity(start, end));
    }
}