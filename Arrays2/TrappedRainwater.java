package Arrays2;

public class TrappedRainwater {
    public static int trappedrainwater(int height[]){
        int sum = 0;
        //calculate left max array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1;i<height.length;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

        //calculate right max array
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int j = height.length - 2; j >=0 ; j--) {
            rightmax[j] = Math.max(rightmax[j+1],height[j]);
        }
        //waterlevel = min (leftmax,rightmax)
        int waterlevel[] = new int[height.length];
        for(int k = 0; k < height.length; k++){
            waterlevel[k] = Math.min(rightmax[k],leftmax[k]);
        }
        //trappedwater=waterlevel-height
        int trapwater[] = new int[height.length];
        for(int i = 0; i<height.length; i++){
            trapwater[i] = waterlevel[i] - height[i];
            sum = sum + trapwater[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        //trappedrainwater(height);
        System.out.println(trappedrainwater(height));

    }
}
