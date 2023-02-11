#include<iostream>
using namespace std;
int main(){
    for(int i =0;i<7;i++){
        for(int j =0;j<7;j++){
            if((i==0 || i==6)&& j==3){
                cout<<"*";
            }
            else if((i==1||i==5)&&(j==1||j==5||j==3)){
                cout<<"*";
            }
            else if(i==2||i==4)
                cout<<"*";
            else if(i==3){
                cout<<"*";
            }
            else{
                cout<<" ";
            }
            
        }
        cout<<"\n";
    }
}