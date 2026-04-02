package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Monotone {

    public boolean  monotone(ArrayList<Integer> nums){
        boolean inc = true;
        boolean dec = true;
        for(int i=0;i < nums.size()-1;i++){
            if(nums.get(i) < nums.get(i+1)){
                dec = false;
            }
            if(nums.get(i) > nums.get(i+1)){
                inc = false;
            }
        }
        return inc || dec;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ArrayList Elements size");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i < n;i++){
            System.out.println("Enter for element for index " + i);
            list.add(sc.nextInt());
        }

        Monotone ob = new Monotone();
        System.out.println(ob.monotone(list));
    }
}
