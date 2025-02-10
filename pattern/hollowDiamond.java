package pattern;

public class hollowDiamond {

    public static void main(String[] args) {
        //enter odd number
        printHollowDiamondPattern(10);
    }

    static void printHollowDiamondPattern(int num) {
       int centerPoint = (num / 2) + 1;
       int startStar = centerPoint;
        int endStar = centerPoint;
        boolean printStartStar = true;


        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i <= centerPoint) {
                    if (j == startStar) {
                        System.out.print("*");
                        startStar = startStar - (1);
                        if(i==1){
                            endStar = endStar + (1);
                            break;

                        }

                    } else if (j == endStar) {
                        System.out.print("*");
                        endStar = endStar + (1);
                        break;
                    } else {
                        System.out.print(" ");
                    }

                } else {
                    if(startStar==0 && endStar==num+1){
                        startStar=startStar+2;
                        endStar=endStar-2;            
                         }
                    if (j == startStar && printStartStar) {           

                        System.out.print("*");
                        startStar = startStar + (1);
                        printStartStar=false;

                    } else if (j == endStar) {

                       System.out.print("*");
                        endStar = endStar - (1);
                        printStartStar =true;
                        break;
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");

        }

    }
}
