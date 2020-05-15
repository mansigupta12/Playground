#include<iostream>
using namespace std;
int main()
{
  int n, dsum1=0, dsum2=0, rsum=0, csum=0; 
  cin>>n;
  int a[n][n];
  for(int i=0; i<n; i++)
  {
    for(int j=0; j<n; j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0; i<n; i++)
  {
    dsum1 = dsum1 + a[i][i];
  }
  
  for(int i=0; i<n; i++)
  {
    dsum2 = dsum2 + a[i][n-1-i]; 
  }
  if(dsum1 != dsum2)
  {
    cout<<"No";
    return 0;
  }
  for(int i=0; i<n; i++)
  {
    rsum = 0;
    for(int j=0; j<n; j++)
    {
      rsum = rsum + a[i][j];
    }
    if(rsum != dsum1)
    {
      cout<<"No";
      return 0;
    }
  }
  for(int i=0; i<n; i++)
  {
    csum = 0;
    for(int j=0; j<n; j++)
    {
      csum = csum + a[j][i];
    }
    if(csum != dsum1)
    {
      cout<<"No";
      return 0;
    }
  }
  cout<<"Yes";
}