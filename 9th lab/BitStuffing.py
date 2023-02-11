'''l = []
s = int(input("Enter the size of list"))
for i in range(s):
    bs = int(input("Enter the bit streams's bit"))
    l.append(bs)
count =0
for i in range(s)'''

bitstring=input("Enter bit: ")
data=list(bitstring)
i=0
c=0
while(i<len(data)):
    if(data[i]=='1'):
        c+=1
    else:
        c=0
    if(c==6):
        data.insert(i,'0')
        c=0
    i+=1

x=''
x=''.join(data)
print(f"After bit stuffing: {x}")
