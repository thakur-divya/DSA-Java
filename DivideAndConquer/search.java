package DivideAndConquer;

public class search {
    public static int searcha(int arr[],int tar,int si,int ei){
        //Base Case
        if(si>ei){
            return -1;
        }
        //Kaam
        int mid = si + (ei-si)/2;

        if(arr[mid] == tar){
            return mid;
        }
        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a : left
            if(arr[si] <= tar && tar <= arr[mid]){
                return searcha(arr,tar,si,mid-1);
            }
            //case b : right
            else{
                return searcha(arr,tar,mid+1,ei);
            }
        }
        else{//mid on L2
            //case c : right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return searcha(arr,tar,mid+1,ei);
            }
            //case d : left
            else{
                return searcha(arr,tar,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int tarIdx = searcha(arr,target,0,arr.length-1);
        System.out.println(tarIdx);
    }
}
