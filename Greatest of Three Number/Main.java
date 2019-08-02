#include <stdio.h>

int main()
{ 
    long long int num1,num2,num3;
  scanf("%lld,%lld,%lld",&num1,&num2,&num3);
  if(num1>num2)
  {
    if(num1>num3){
    printf("%lld",num1);
  }
  else
  {
    printf("%lld",num3);
  }}
  else if(num2>num3)
  {
    printf("%lld",num2);
}
  else
    printf("%lld",num3);
  return 0;
}