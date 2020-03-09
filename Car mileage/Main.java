#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  int l,d,reach;
  cin>>m>>l>>d;
  reach = int(m*l);
  if(reach>d)
  {
    cout<<"Can reach";
  }
  else
  {
    cout<<"Cannot reach";
  }
}