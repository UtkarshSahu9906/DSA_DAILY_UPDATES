package bitManipulation;

public class CountSetBitInNumber {

    public static void main(String[] args) {
        System.out.println(countSetBitInNumber(15));
    }

    static int countSetBitInNumber(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 != 0) {
                count++;
            }
            num = num >> 1;
        }
        return count;

    }
}
