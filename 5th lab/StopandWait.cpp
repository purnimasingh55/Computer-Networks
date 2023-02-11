#include<iostream>
using namespace std;
int Acknoledgement(){
    int ans;
    cout<<"Enter the recivers responce: ";
    cin>>ans;
    if(ans==1){
        return 1;
    }
    else{
        return 0;
    }
}
void Frame(int n){
    cout<<"Your frame is sent successfully.\n";
}
int main(){
    int n;
    cout<<"Enter the number of frame you want to send: ";
    cin>>n;
    
   // int arr[n];
    for(int i=0;i<n;i++){
        cout<<"frame"<<i<<"is sent";
        Frame(i);
        

        if(Acknoledgement()==1){
            cout<<"Acknoledge is recieved successfully.";
            
        }
        else{
            cout<<"Acknoledgement is not recieved.";
            break;
        }
    }

}