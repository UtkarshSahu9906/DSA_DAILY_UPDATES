#include<bits/stdc++.h>
 using namespace std;


 int reverseNumber(int num ){
   int reverse=0;
   while (num!=0){
    int temp = num%10;

      num =num/10;

      reverse=reverse*10+temp;
   }

   return reverse;
    
 }
 int main(){

   cout<< reverseNumber(24)<<endl;
    return 0;

 }