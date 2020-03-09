#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float r,h,arh,tnhw,vol_tank,vol_received;
  cin>>r>>h>>arh>>tnhw;
  vol_tank = 3.14*r*r*h;
  vol_received = arh*tnhw;
  if(vol_tank<vol_received)
  {
    cout<<"The tank can be filled within "<<tnhw<<" hours";
  }
  else
  {
    cout<<"The tank cannot be filled within "<<tnhw<<" hours";
  }
  return 0;
}