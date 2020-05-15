#include<iostream>
#include<string>
#include<iomanip>
using namespace std;
struct employee
{
  string name;
  int id;
  int age;
  string designation;
  float salary;
};
int main()
{
  employee e;
  cout<<"Enter name:"<<endl;
  getline(cin,e.name);
  cout<<"Enter ID:"<<endl;
  cin>>e.id;
  cout<<"Enter age:"<<endl;
  cin>>e.age;
  cout<<"Enter designation:"<<endl;
  cin.ignore();
  getline(cin,e.designation);
  cout<<"Enter Salary:"<<endl;
  cin>>e.salary;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<e.name<<endl;
  cout<<"ID of the Employee : "<<e.id<<endl;
  cout<<"Age of the Employee : "<<e.age<<endl;
  cout<<"Designation of the Employee : "<<e.designation<<endl;
  cout<<"Salary of the Employee : ";
  cout<<e.salary;
  
}