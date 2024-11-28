package maths;

public class palindrome {
public static void main(String[] args) {

   System.out.println( ""+isPalindrome(15356));
       
   }
   
   static boolean isPalindrome(int num){
    int rev=0;
    int temp=num;

    while(num!=0){
        rev=rev*10+(num%10);
        num=num/10;
    }


    return  (temp==rev)?true:false; 
}

    
}
