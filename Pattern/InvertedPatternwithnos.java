package Pattern;

public class InvertedPatternwithnos {
    public static void InvertedPatternwithNos(int n){
        for(int i=n;i>=1;i--){
            int k=1;
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       InvertedPatternwithNos(4);
    }
}
