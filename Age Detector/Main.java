#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int by,cy;
  cin>>by>>cy;
  if(by>cy)
  {
    cout<<100-by+cy;
  }
  else
  {
    cout<<cy-by;
  }
  return 0; 
}