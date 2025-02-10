package recursion;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr ={3,6,2,7,2,7,4,6,5,4,3,84,8};
        System.out.println(firstOccurrence(arr, 0, 5));
        
    }
    static int firstOccurrence(int[] arr , int index,int target){
        if(index==arr.length-1)return -1;
        if(arr[index]==target) return index;

        return firstOccurrence(arr, index+1, target);
    }
}
