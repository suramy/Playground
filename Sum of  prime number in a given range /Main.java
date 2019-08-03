#include<stdio.h>
int main()
{
  //Type youe code here
  int n,sum=0;
  scanf("%d",&n);
  for (int i=2 ; i<=n ; i++)
  {
    int flag =0;
    for(int j=2 ; j<=i/2 ; j++){
      if(i%j==0)
    	flag ++;
    }
    if(flag == 0){
    	sum = sum +i;
    }
  }
  printf("%d",sum);
  return 0;
}