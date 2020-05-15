#include<iostream>
using namespace std;
int main()
{
  int n, cnt = 0;
  cin>>n;
  int a[n];
  for(int i = 0; i < n; i++)
  {
    cin>>a[i];
  }
  
  for(int i = 0; i < n; i++)
  {
    if(i == 0)
    {
      cout<<"1"<<endl;
      continue;
    }
    if(a[i] < a[i-1])
    {
      cout<<"1"<<endl;
    }
    else
    {
      cnt = cnt + 2;
      cout<<cnt<<endl;
    }
  }
}