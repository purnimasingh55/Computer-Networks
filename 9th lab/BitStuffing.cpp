#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int> v;
    int ele;
    cout<<"Enter the size of bit stream: ";
    int n;
    cin>>n;
    for(int i=0;i<n;i++){
        int ele;
        cout<<"Enter the bit to be stuffed: ";
        cin>>ele;
        v.push_back(ele);
    }
    int maxi;
    cout<<"Enter the maximum bit after which you want to stuff bit: ";
    cin>>maxi;
    int count =0;
    for(int i=0;i<v.size();i++){
        if(v[i]==1){
            count++;
        }
        else{
            count=0;
        }
        auto pos = v.begin() +i;
        if(count==6){
            v.insert(pos,'0');
        }
    }
    for(int x: v){
        cout<<x;
    }
}
