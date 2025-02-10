package bitManipulation;

public class ClearIthBit {
    public static void main(String[] args) {
        System.out.println(clearIthBit(10,1));
    }
    static  int clearIthBit(int num,int index){
        int bitMask = ~(1<<index);
        return num&bitMask;
    }
}
