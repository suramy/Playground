#include<iostream>
#include<stdio.h>
using namespace std;
int main(){
  float r,a;
  cin>>r>>a;
  float arc = (2*3.14*r);
  arc = arc*(a/360);
  printf("%.2f",arc);
  return 0;
}