#include <iostream>

using namespace std;

int main()
{
    int n1;
    int n2;
    cout<<"Enter two num"<<endl;
    cin>>n1>>n2;
    int tot=n1+n2;
    if(tot%2==0)
    {
        cout<<"Even";
    }
    else
    cout<<"odd";

    return 0;
}
