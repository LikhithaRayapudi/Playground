#include<stdio.h>
int main()
{
  //Type your code here
  int n,num,sum,a;
  scanf("%d",&n);
  num=n%10;
  sum=n/10;
  a=num+sum;
  printf("%d",a);
  return 0;
}