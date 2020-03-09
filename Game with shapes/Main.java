#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,los,d;
  cin>>r>>los;
  d = 2*r;
  if(d <= los)
  {
    cout<<"circle can be inside a square";
  }
  else
  {
    cout<<"circle cannot be inside a square";
  }
  return 0;
}