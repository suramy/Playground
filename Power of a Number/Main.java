#include <stdio.h>
#include <iostream>
#include <math.h>
using namespace std;
int main(){

  int a,b,i;
  cin>>a>>b;
  if(b>=0){
  i = pow(a,b);
    cout<<i;
  }
  else
    cout<<"Wrong input";
  return 0;
}