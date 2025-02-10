package bitManipulation;

public class GetIthBit {

    public static void main(String[] args) {
System.out.println(getIthBit(10, 3));
    }

    static int getIthBit(int num, int index) {

        int bitMasking = 1 << index;
        if ((num & bitMasking) == 0) {
            return 0; 
        }else {
            return 1;
        }
    }
}
