'''import math
def Redundant_bit(m):
    r = 0
    while (1):
        ex = 2 ** r
        if ((m + 1 + r) <= ex):
            #print("First no. satisfaing humming formula is: ", r)
            return r
            r += 1
            break
        r += 1



def Binary_Convrtion(n):
    return bin(n).replace("0b", "")




Data_bit = int(input("Enter the of data bit: "))
str_DB = str(Data_bit)
m = len(str_DB)
print(m)
r = Redundant_bit(m)
print("Number of redundant bits are: ",r)
l = []
print("Numbers in binary formate are: ")
for i in range (1,m+r+1):
    l.append(Binary_Convrtion(i))
print(l)
print("Parity bits are: ")
for i in range(0,r):
    print(2**i, end = ' ')
print()
res = [int(x) for x in str(Data_bit)]
for i in range(0,r):
    res.insert(((m+r-2)-2**i)+1, 'R')

print(res)
print(l)


print("Finding all the values for parity bit ")

for i in range(0,r):
    for j in res:
        res[j] = str(res[j])
        les = [int(x) for x in str(res[j])]
        p = len(les)
        for k in range(p):'''


option=int(input('Press 1 for generating hamming code  \nPress 2 for finding error in hamming code\n\t Enter your choice:--\n'))

if(option==1):  # GENERATE HAMMING CODE
    print('Enter the data bits')
    d=input()
    data=list(d)
    data.reverse()
    c,ch,j,r,h=0,0,0,0,[]

    while ((len(d)+r+1)>(pow(2,r))):
        r=r+1

    for i in range(0,(r+len(data))):
        p=(2**c)

        if(p==(i+1)):
            h.append(0)
            c=c+1

        else:
            h.append(int(data[j]))
            j=j+1

    for parity in range(0,(len(h))):
        ph=(2**ch)
        if(ph==(parity+1)):
            startIndex=ph-1
            i=startIndex
            toXor=[]

            while(i<len(h)):
                block=h[i:i+ph]
                toXor.extend(block)
                i+=2*ph

            for z in range(1,len(toXor)):
                h[startIndex]=h[startIndex]^toXor[z]
            ch+=1

    h.reverse()
    print('Hamming code generated would be:- ', end="")
    print(int(''.join(map(str, h))))


elif(option==2): # DETECT ERROR IN RECEIVED HAMMING CODE
    print('Enter the hamming code received')
    d=input()
    data=list(d)
    data.reverse()
    c,ch,j,r,error,h,parity_list,h_copy=0,0,0,0,0,[],[],[]

    for k in range(0,len(data)):
        p=(2**c)
        h.append(int(data[k]))
        h_copy.append(data[k])
        if(p==(k+1)):
            c=c+1
            
    for parity in range(0,(len(h))):
        ph=(2**ch)
        if(ph==(parity+1)):

            startIndex=ph-1
            i=startIndex
            toXor=[]

            while(i<len(h)):
                block=h[i:i+ph]
                toXor.extend(block)
                i+=2*ph

            for z in range(1,len(toXor)):
                h[startIndex]=h[startIndex]^toXor[z]
            parity_list.append(h[parity])
            ch+=1
    parity_list.reverse()
    error=sum(int(parity_list) * (2 ** i) for i, parity_list in enumerate(parity_list[::-1]))
    
    if((error)==0):
        print('There is no error in the hamming code received')

    elif((error)>=len(h_copy)):
        print('Error cannot be detected')

    else:
        print('Error is in',error,'bit')

        if(h_copy[error-1]=='0'):
            h_copy[error-1]='1'

        elif(h_copy[error-1]=='1'):
            h_copy[error-1]='0'
            print('After correction hamming code is:- ')
        h_copy.reverse()
        print(int(''.join(map(str, h_copy))))

else:
    print('Option entered does not exist')

