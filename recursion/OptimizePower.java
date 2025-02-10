package recursion;

public class OptimizePower {
    public static void main(String[] args) {
        System.out.println(optimizePower(10, 2));
        
    }
    static int optimizePower(int a, int n){
        if(n==0){
            return 1;
        
        }
        int halfPower = optimizePower(a, n/2);
        int halfPowerSq=halfPower*halfPower;


        if(n%2!=0){
            halfPowerSq =a*halfPowerSq;
        }
        return halfPowerSq;
    }
}
