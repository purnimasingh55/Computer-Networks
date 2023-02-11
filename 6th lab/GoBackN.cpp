/*#include<iostream>
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
    int i = 0;

    for(int i=0;i<n;i++){
        cout<<"frame "<<i<<"\n";
        Frame(i);
        count++;
        slidingWindow[i] = i;
    }
    int temp =n-1;
    i=n;
    int j=0;
    int sn=0;
    while (i<=mn)
    {
        if(i!=mn&&j!=mn){
            if(Acknoledgement()==1){
                cout<<"Acknowledgement"<<j<<" is recieved\n";
                j++;
                if(sn>=n){
                    sn=0;
                }
                Frame(i);
                count++;
                cout<<"Frame "<<i<<" is send\n";
                slidingWindow[sn] = temp;
                temp++;
                sn++;
            }
            else{
                cout<<"Acknowledge "<<j<< " is rejected.\n";
                sn =0;
                int k=j;
                i = i-n-1;
                while (sn<n)
                {
                    slidingWindow[sn] = k;
                    k++;
                    sn++; 
                    count++;
                }
            }
        }
        else if(i==mn&&j!=mn){
            if(Acknoledgement()==1){
                cout<<"Acknowledge "<<j<<" is recieved.\n";
                j++;
            }
            else{
                cout<<"Acknowledge "<<j<< " is rejected.\n";
                sn =0;
                int k=j;
                i = i-n;
                while (sn<n)
                {
                    slidingWindow[sn] = k;
                    k++;
                    sn++; 
                    count++;
                }
            }
        }
        i++;
    }
}*/



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
    int i = 0;

    for(int i=0;i<n;i++){
        cout<<"frame "<<i<<"\n";
        Frame(i);
        count++;
        slidingWindow[i] = i;
    }
    int temp =n;
    i=n;
    int j=0;
    int sn=0;
    /*while (j<=mn)
    {
        if(i<mn&&j!=mn){
            if(Acknoledgement()==1){
                cout<<"Acknowledgement"<<j<<" is recieved\n";
                j++;
                if(sn>=n){
                    sn=0;
                }
                Frame(i);
                count++;
                cout<<"Frame "<<i<<" is send\n";
                slidingWindow[sn] = i;
                //temp++;
                sn++;
            }
            else{
                cout<<"Acknowledge "<<j<< " is rejected.\n";
                sn =0;
                int k=j;
                i = i-n-1;
                while (sn<n)
                {
                    slidingWindow[sn] = k;
                    k++;
                    sn++; 
                    count++;
                }
            }
        }
        else if(i==mn&&j!=mn){
            if(Acknoledgement()==1){
                cout<<"Acknowledge "<<j<<" is recieved.\n";
                j++;
            }
            else{
                cout<<"Acknowledge "<<j<< " is rejected.\n";
                sn =0;
                int k=j;
                i = j-1;
                while (sn<n)
                {
                    Frame(k);
                    slidingWindow[sn] = k;
                    k++;
                    sn++; 
                    count++;
                }
            }
        }
        i++;
    }*/
    while(i<mn){
    	if(Acknoledgement()==0){
            cout<<"Acknowledge "<< j << " is not recieved\n";
            i =j;
            sn =0;
            //int k=j;
            i = i-n-1;
            while (sn<n)
            {
                slidingWindow[sn] = i;
                //k++;
                sn++; 
                count++;
            }        
        }
        else if(Acknoledgement()==1&&i!=mn){
            cout<<"Acknowlwdge "<< j << " is recieved.\n";
            j++;
            Frame(i);
            cout<<"Acknowlwdgement "<<i<<" is send.\n";
             if(sn>=n){
                    sn=0;
                }
            slidingWindow[sn] = i;
            sn++;
            i++;
            count++;
            //sn++;
        }
        else if(i==mn && j!=mn && Acknoledgement()==1){
            cout<<"Acknowlwdgement "<<j<<" is recieved.\n";
            j++;
        }
	}
    cout<<count;
}
    

    


    

    


