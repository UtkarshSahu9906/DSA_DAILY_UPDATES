package recursion;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr ={0,6,2,7,2,7,4,6,5,4,3,84,8};
        System.out.println(lsatOccurrence(arr, arr.length-1,10 ));
        
    }
    static int lsatOccurrence(int[] arr , int index,int target){
        if(index<0)return -1;
        if(arr[index]==target) return index;

        return lsatOccurrence(arr, index-1, target);
    }
}
