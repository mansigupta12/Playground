#include <iostream>
#include <stdio.h>
using namespace std;
int main()
{
char str[100], rev[100],ch;     
int count = 0, end, i=0;
 gets(str);
while(str[i]!='\0'){
 count++;
  i++;
}
  i=0;
  count--;
 while(count>=0){
  rev[i] = str[count];
   i++;
   count--;
 }
  rev[i]='\0';
  
   
std::cout<<rev;
}