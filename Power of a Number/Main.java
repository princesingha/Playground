#include <stdio.h>
#include<math.h>
int main()
{
  	double b,e,r;
  scanf("%lf%lf%lf",&b,&e);
  if(e>=0)
  {
    r = pow(b,e);
    printf("%lf",r);
  }
  else
    printf("Wrong input");
    return 0;
}