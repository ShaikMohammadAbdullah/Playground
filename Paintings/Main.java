#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int lw,bw,l1,b1,l2,b2,sum=0,aor,ao1,ao2;
  cin>>lw>>bw>>l1>>b1>>l2>>b2;
  aor = lw*bw;
  ao1=l1*b1;
  ao2=l2*b2;
  sum=ao1+ao2;
  if(aor>sum)
  {
    cout<<"Raj can fix both painting";
  }
  else
  {
    cout<<"Raj cannot fix both painting";
  }
  return 0;
}