package recursion;

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tilingProblem(10));
        
    }
    static  int tilingProblem(int n){
        if(n==0||n==1)return 1;

        int fnm1=tilingProblem(n-1);
        int fnm2=tilingProblem(n-2);

        return fnm1+fnm2;

    }
}
