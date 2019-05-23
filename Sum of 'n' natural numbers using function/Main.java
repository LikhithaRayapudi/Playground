#include<stdio.h>
#include<math.h>
int sum_natural(int n)
{
  int s=n*(n+1)/2;
  return s;
}
int main()
{
  int m;
  scanf("%d\n",&m);
  int n1=sum_natural(m);
  m=n1;
  printf("%d",m);
}