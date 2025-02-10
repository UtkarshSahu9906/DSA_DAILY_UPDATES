package recursion;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,2};
        System.out.println(isArraySorted(arr, 0));
        
    }
    static boolean isArraySorted(int[] arr , int index){
        if(index==arr.length-1)return true;
        if(arr[index]>arr[index+1]) return false;

        return isArraySorted(arr, index+1);
    }
}
