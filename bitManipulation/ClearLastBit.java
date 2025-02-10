package bitManipulation;

public class ClearLastBit {
    public static void main(String[] args) {
        System.out.println(clearLastBit(15, 2));
    }
    static int clearLastBit(int num,int index){
        int bitMask  =-1<<index;
        return num&bitMask;
    }
}
