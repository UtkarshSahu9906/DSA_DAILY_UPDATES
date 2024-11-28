package pattern;

public class increaseDecresePyramid {

    public static void main(String[] args) {
        printIncreaseDecreasePyramid(9);

    }

    static void printIncreaseDecreasePyramid(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.print("-");

            }
            for(int k=0;k<=i;k++){
                System.out.print(""+(k+1));
            }
            for(int l=1;l<=i;l++){
                System.out.print(""+Math.abs(l-i-1));
            }
            System.out.println("");
        }
    }
}
