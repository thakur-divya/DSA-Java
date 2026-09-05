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
    }

}
