#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
	double t,v;
  	double WCF;
  	cin>>t>>v;
  	WCF = 35.74 + (0.6215*t) + ((0.4275*t) - 35.75) * pow(v,0.16);
  	cout<<WCF;
}