#include<stdio.h>
int square(int m)
{
  int s=m*m;
  return s;
}
int main()
{
  int n;
  scanf("%d",&n);
  if(n>=0)
  {
   int sq=square(n);
    n=sq;
    printf("%d",n);
  }
}
   