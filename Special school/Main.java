#include <bits/stdc++.h>
using namespace std;
int main()
{
 string s1,s2,s3;
  cin>>s1>>s2;
   reverse(s2.begin(),s2.end());
  if(s1==s2)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  
}