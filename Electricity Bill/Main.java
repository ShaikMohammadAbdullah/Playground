#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u;
  cin>>u;
  if(u<=200)
  {
    cout<<"Rs."<<int(u*0.5);
  }
  else if(200<u<=400)
  {
    cout<<"Rs."<<int(u*0.65 +100);
  }
  else if(400<u<=600)
  {
    cout<<"Rs."<<int(u*0.8 + 200);
  }
  else
  {
     cout<<"Rs."<<int(u*1.25 + 425);
  }
  return 0;
  
}