package maths;

public class numberPiramid {

    public static void main(String[] args) {

        printNumberPiramid(5);
    }

    static void printNumberPiramid(int num) {
        for (int i = 0; i != num; i++) {
            for (int j = 0; j != i+1; j++) {
                System.out.print("" +(j+1));
            }
            System.out.println("");
        }

    }
}
