#include<stdio.h>
#include <iomanip>
#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here
  float a,b;
  cin>>a>>b;
  float h;
  h = sqrt(a*a+b*b);
  cout<< setprecision (2) << fixed << h;
  return 0;
}