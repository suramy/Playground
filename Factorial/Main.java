#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  long n,a=1;
  cin>>n;
  for(int i=1; i<=n ; i++)
  {
    a = a*i;
  }
  cout<<a;
  return 0;
}