#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int temp;
  temp = n;
  int cnt=0;
  while(n>0)
  {
   n=n/10;
    cnt++; 
  }
  n=temp;
  int sum=0;
  while(n>0)
  {
   int rem=n%10;
    sum+=power(rem,cnt);
      n=n/10;
    
  }
  if(temp == sum)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}