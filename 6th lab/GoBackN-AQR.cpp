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
    cout<<"Enter the window size: ";
    cin>>n;
    cout<<"Enter the number of message bits: ";
    int mn;
    cin>>mn;
    int slidingWindow[n] = {'\0'};
    int count = 0;
    for(int i=0;i<n-1;i++){
        cout<<"frame "<<i<<"\n";
        Frame(i);
        count++;
        slidingWindow[i] = i;
        cout<<"Values in sliding window are: "<<slidingWindow[i]<<" ";
    }
        int temp =n,l=0;
    for(int i=n-1;i<mn;i++){
        
        cout<<"frame "<<i<<"\n";
        Frame(i);
        count++;
      
        if(Acknoledgement()==1){

            cout<<"Acknoledge is recieved successfully.\n";
           
            slidingWindow[l] = temp;
            l++;
            temp++;
        }
        
        cout<<"Values in sliding window are: "<<slidingWindow[i]<<" ";
        else{
            cout<<"Acknoledgement is not recieved.\n";
            l=0;
            while(l<n){
                slidingWindow[l] = i;
                i++;
                l++;
                count++;
            }
        }

    }
    /*for(int i=1;i<=mn;i++){
        cout<<"frame"<<i<<"is sent";
        
        for(int j=0;j<n;j++){
            Frame(i);
            if(Acknoledgement()==1){
                cout<<"Acknowledgement is recieved successfully.";
                arr[j] = i;
                cout<<"Values in sliding window are: ";
            }
            else{

            }
        }
    }
*/
}