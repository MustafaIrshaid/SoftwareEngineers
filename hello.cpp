#include <iostream>
using namespace std;


int main(){
    int x;
    cin>>x;
    while(true){ 
    if(x%2==0){
    x=x/2;
    }
    else if(x%2){
    x=x*3+1;
    }
    cout<<x;
    }

    return 0;
}