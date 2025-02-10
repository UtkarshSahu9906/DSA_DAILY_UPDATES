package bitManipulation;

public class ClearBitInRange {

    public static void main(String[] args) {
System.out.println(clearBitInRange(10, 2, 4));
    }

    static int clearBitInRange(int num, int i, int j) {
        int a = -1 << j + 1;
        int b = ((1 << i) - 1);
        int bitMask = a | b;
        return num & bitMask;
    }
}
