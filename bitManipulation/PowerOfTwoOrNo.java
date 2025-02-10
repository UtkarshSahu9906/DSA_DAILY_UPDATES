package bitManipulation;

public class PowerOfTwoOrNo {
    public static void main(String[] args) {
        System.out.println(powerOfTwoOrNo(8));
        
    }
    static  boolean powerOfTwoOrNo(int num){
        return  (num&(num-1))==0;
    }
}
