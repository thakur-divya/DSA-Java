package Arrays;
public class ArrayFunction {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int marks[] = {95,92,90};
        update(marks);
        for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
    }   System.out.println();
    }
}
