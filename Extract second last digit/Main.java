#include<stdio.h>
int main()
{
  //Type your code here
  int num,first,second;
  printf("");
  scanf("%d",&num);
  first=num%100;
  second=first/10;
  printf("%d",second);
  return 0;
}