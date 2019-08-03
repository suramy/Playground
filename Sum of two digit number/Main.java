#include<stdio.h>

int main()
{
        int num,temp1,temp2;
        scanf("%d",&num);
        temp1=num%10;                  /* store last digit in temp1   */
        num=num/10;                       /* making number one digit shorter   */
        temp2=num%10;                  /* store the second last digit in temp2   */
        num=temp1+temp2; /* add the last digit and subtract second last digit to shorter number  */
          printf("%d",num);
  return 0;
}