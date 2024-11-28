package pattern;

public class pyramid {

    public static void main(String[] args) {

        printNumberPyramid(5);
    }

    static void printNumberPyramid(int num) {
        for (int i = 0; i != num; i++) {
            for (int j = 0; j != i+1; j++) {
                System.out.print("" +(j+1));
            }
            System.out.println("");
        }

    }
}
