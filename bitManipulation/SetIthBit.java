package bitManipulation;

public class SetIthBit {
    public static void main(String[] args) {

        System.out.println(setItBIt(10, 2));
        
    }
    static int setItBIt(int num,int index){
        int bitMask =1<<index;
        return num|bitMask;
    }
}
