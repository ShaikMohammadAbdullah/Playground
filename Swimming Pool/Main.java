#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int len,lit,volume;
  cin>>len>>lit;
  volume = len*len*len*1000;
  if(volume>=lit)
  {
    cout<<"Can store";
  }
  else
  {
    cout<<"Cannot store";
  }
  return 0;
}