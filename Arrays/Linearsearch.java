package Arrays;
public class Linearsearch {
    public static int linearsearch(int numbers[],int key){
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,9,45,23,45,90,10,34,67};
        int key = 10;
        int index = linearsearch(numbers,key);
        if(index == -1){
            System.out.println("NOT FOUND!");
        }else{
            System.out.println("Found at index : " + index);
        }

    }
}
