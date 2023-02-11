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
    cout<<"Enter the Size of Sliding Window: ";
    cin>>n;
    int fr;
    cout<<"Enter the number of frames you want to send: ";
    cin>>fr;
    for(int i=0;i<n;i++){
        cout<<"frame "<<i<<"\n";
        Frame(i);

    }

    for(int i=n;i<fr;i++){
        
        cout<<"frame "<<i<<"\n";
        Frame(i);
        if(Acknoledgement()==1){
           
            cout<<"Acknoledge is" <<i-n<<"recieved successfully.\n";
            
        }
        else{
            cout<<"Acknoledgement is not recieved.\n";
            break;
        }

    }

}