
import java.awt.geom.Ellipse2D;

public class PairSum {

    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9};

        int target = 8;
       System.out.println(pairSumArray(target,array));

    
            
        }

        static String pairSumArray(int target,int[] array){

        int i = 0;
        int j = array.length-1;
            while (i<j) { 
                if((array[i]+array[j])<target){
                   i++;
                }
                else if((array[i]+array[j])>target){
                   j--;
                }
                else{
                   return "pair is: "+array[i]+" & "+array[j];
                }
               
           }
           return "-1";
        }
    }

    

