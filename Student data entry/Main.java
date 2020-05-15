#include <iostream>
#include <cstring>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  char name[50];
  int roll;
  float marks;
  cin.getline(name,50);
  cin>>roll>>marks;
  struct student s;
  strcpy(s.name,name);
  s.roll=roll;
  s.marks=marks;
 // cout<<"Student Details"<<endl<<"Name: "<<name<<endl<<"Roll: "<<roll<<endl<<"Marks: "<<marks;
  cout<<endl<<"Student Details"<<endl<<"Name: "<<s.name<<endl<<"Roll: "<<s.roll<<endl<<"Marks: "<<s.marks;
  
}