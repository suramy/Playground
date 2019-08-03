#include<stdio.h>
#include<iostream>
using namespace std;
int main()
{
  int a[100],b,n,i,j;
  cin>>n;
  for(i=0; i<n; i++)
  {
    cin>>a[i];
  }
  cin>>b;
  for(i=0; i<n; i++)
  {
    if(a[i] == b)
    {
      j=i+1;
      break;
    }
  }
  if(j != 0)
  {
    cout<<j;
  }
  else{
  	cout<<b<<" isn't present in the array.";
  }
  return 0;
}