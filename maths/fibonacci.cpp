#include<bits/stdc++.h>
 using namespace std;

 void fibonacci(int term ){
    int t1 =0;
    int t2 = 1;
    for (int i = 1; i  <=term; i++)
    {
        cout<<t1<<endl;

        int nextTerm = t1+t2;
        t1=t2;
        t2=nextTerm;
 
    }
    
 }
 int main(){

    fibonacci(2);
    return 0;

 }