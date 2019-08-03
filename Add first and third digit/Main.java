#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,c;
  scanf("%d",&a);
  b=(a/100)%10;
  c=(a/1)%10;
  int d=b+c;
  printf("%d",d);
  return 0;
}