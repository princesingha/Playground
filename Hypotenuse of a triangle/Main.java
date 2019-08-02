#include<stdio.h>
#include<math.h>
int main()
{
  float l,b;
  scanf("%f%f",&l,&b);
 float h = sqrt((l*l)+(b*b));
  printf("%.2f",h);
  return 0;
}