#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  int v=0,c=0,s=0,d=0,sym=0;
  for(int i=0;i<str.length();i++){
    if(str.at(i)=='a' || str.at(i)=='e' || str.at(i)=='i' || str.at(i)=='o' || str.at(i)=='u' ||
       str.at(i)=='A' || str.at(i)=='E' || str.at(i)=='I' || str.at(i)=='O' || str.at(i)=='U'){
           v++;    
    } else if(int(str.at(i))>='0' && int(str.at(i))<='9'){
      d++; 
    }else if(str.at(i)==' '){
     s++; 
    }else if((str.at(i)>='a'&& str.at(i)<='z')||(str.at(i)>='A'&& str.at(i)<='Z')){
     c++; 
    }else {
     sym++; 
    }
  }
  
cout<<"Vowels:"<<v<<endl;
cout<<"Consonants:"<<c<<endl;
cout<<"White Spaces:"<<s<<endl;
cout<<"Digits:"<<d<<endl;
cout<<"Symbols:"<<sym;
}