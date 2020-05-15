#include <cstring>
#include <iostream>
using namespace std;
int main()
{
  char str[100];
 cin.getline(str,100);
  int count=0;
  for(int i=0;i<strlen(str);i++){
    if(str[i]==' ')
      count++;
  }
  if(count>9)
    cout<<"Caption not eligible for the contest";
  else
    cout<<"Caption eligible for the contest";
}