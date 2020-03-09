#include<iostream>
using namespace std;
int main()
{
  char a;
  cin>>a;
  if(a >= 'a' && a <= 'z' || a>='A' && a<='Z')
  {
  	if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U'|| a=='a' || a=='e' || a=='i' || a=='o' || a=='u' )
  	{
    	cout<<"Vowel";
   	}
   	else
   	{
    	 cout<<"Consonant";
   	}
  }
  else 
   {
     cout<<"Not an alphabet";
   }
  return 0;
  //Type your code here.
}