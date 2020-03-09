#include<iostream>
#include<stdlib.h>
using namespace std;
int main()
{
  //Type your code here.
  int a,sum,temp;
  cin>>a;
  temp = a;
  sum=0;
  if(a>9 && a<100)
  {
    sum=a/10 + a%10;
  }
  else
  {
    cout<<"Wrong Input";
    exit(1);
  }

cout<<"Alice must go in path-"<<sum<<endl;
  return 0;
}