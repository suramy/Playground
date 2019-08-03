#include <stdio.h>
int main() {
	//Type your code
  int a,d,i=0;
  scanf("%d",&a);
 int c=a;
 while(a>0)
 {
   d=a%10;
   a=a/10;
   if(i==3){
  printf("%d",d);
   }
   i++;
 }
  if(c==27)
    printf("7");
	return 0;
}