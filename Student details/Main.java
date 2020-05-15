#include<iostream>
using namespace std;
struct student
{
  char name[30];
  char department[20];
  int year;
  float cgpa;
};
int main()
{
  int n;
  cout<<"Enter the number of students"<<endl;
  cin>>n;
  struct student s[n];
  for(int i=0;i<n;i++)
  {
   cout<<"Enter the details of student "<<i+1<<endl; 
   cout<<"Enter name"<<endl;
       cin.ignore();
    cin.getline(s[i].name,30);
   cout<<"Enter department"<<endl;
    cin.getline(s[i].department,20);
 
    cout<<"Enter year of study"<<endl;
    cin>>s[i].year;
   
    cout<<"Enter cgpa"<<endl;
    cin>>s[i].cgpa;
  }
  cout<<"Details of students"<<endl;
  student temp;
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(s[i].name<s[j].name)
      {
        temp=s[i];
        s[i]=s[j];
        s[j]=temp;
      }
    }  
  }
  for(int i=0;i<n;i++)
  {
   cout<<"Student "<<i+1<<endl; 
    cout<<"Name:"<<s[i].name<<endl;
    cout<<"Department:"<<s[i].department<<endl;
    cout<<"Year of study:"<<s[i].year<<endl;
    cout<<"CGPA:"<<s[i].cgpa<<endl;
  }
}