public class Pattern_Practice {


    public static void main(String args[]){
        System.out.println("1st Pattern");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2nd Pattern");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("3rd pattern");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("4th Pattern");
        char ch = 'A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        System.out.println("5th Pattern (Hollow Pattern)");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){

                if(i==1 || i==4 || j==1 || j==5){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println("6th Pattern Inverted and Rotated Half Pyramid");
        for(int i=1;i<=4;i++){
            for(int k=4-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("6th Pattern Inverted Half Pyramid with Numbers");
        for(int i=1;i<=5;i++){
            int k=1;
            for(int j=5-i+1;j>0;j--){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }

        System.out.println("7th Pattern Floydd's Triangle");
        int m=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }
    }

}
