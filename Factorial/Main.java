#include<stdio.h>
#include<math.h>
int main()
{
    double a,c,f=1;
  scanf("%lf",&a);
  for(c=1;c<=a;c++)
  {
    f = f*c;
  }
  printf("%lf",f);
  return 0;
}