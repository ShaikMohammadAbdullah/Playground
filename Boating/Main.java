#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int handle,noa,noc,boat;
  cin>>handle;
  cin>>noa;
  cin>>noc;
  boat = noa*75 + noc*30;
  if(boat<=handle)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}