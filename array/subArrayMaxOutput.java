
public class subArrayMaxOutput {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 4, 2, 6, -8};
        int max =0;
        int temp = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {
                temp=0;


                for (int k = i; k <=j; k++) {
                     temp +=array[k];
                }
                if(max<temp){
                    max=temp;
                }

            }
        }
        System.out.println("max output is -> "+max);

    }
}
