#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f,s,t,largest,i,sm;
  cin>>f>>s>>t;
  if(f>s && f>t)
  {
    largest = f;
    if(s>t)
    {
      cout<<"The treasure is in box which has number "<<s<<"\n";
  	}
    else
    {
      cout<<"The treasure is in box which has number "<<t<<"\n";
    }
    for(i=1;i<=largest;i++)
    {
      if((s%i == 0) && (t%i == 0) && (f%i == 0))
      {
        sm=i;
      }
    }
  }
  if(s>t && s>f)
  {
    largest = s;
    if(t>f)
    {
      cout<<"The treasure is in box which has number "<<t<<"\n";
  	}
    else
    {
      cout<<"The treasure is in box which has number "<<f<<"\n";
    }
    for(i=1;i<=largest;i++)
    {
      if((s%i == 0) && (t%i == 0) && (f%i == 0))
      {
        sm=i;
      }
    }
  }
  if(t>f && t>s)
  {
    largest = t;
    if(s>f)
    {
      cout<<"The treasure is in box which has number "<<s<<"\n";
  	}
    else
    {
      cout<<"The treasure is in box which has number "<<f<<"\n";
    }
	for(i=1;i<=largest;i++)
    {
      if((s%i == 0) && (t%i == 0) && (f%i == 0))
      {
        sm=i;
      }
    }
  }
  cout<<"The code to open the box is "<<sm;
  return 0; 
}