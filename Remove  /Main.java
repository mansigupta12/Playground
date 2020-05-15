#include<iostream>
#include<string>
using namespace std;

int main()
{
  string s1,s2,s3;
 getline(cin,s1);
  string str[s1.length()];
  int j=0;
 for(int i=0;i<s1.length();i++){
   if(s1[i]==' '){
    j++; 
   }else{
   str[j]=str[j]+s1[i];
   }
 }
  for(int i=0;i<=j;i++){
   if(str[i]!="the"){
    s2.append(str[i]);
    if(i!=j) 
    s2.append(" ");
   }
  }
  cout<<s2;
}