#include<bits/stdc++.h>

using namespace std;


void decimalToBinarryConvertion(){
int a;
int binary=0;
int reminder=0;
cin>>a;


while(a!=0){
    reminder = a%2;
    a=a/2;
    binary=binary*10+reminder;

}
cout<<binary;

}

int main(){

decimalToBinarryConvertion();
    return 0;
}