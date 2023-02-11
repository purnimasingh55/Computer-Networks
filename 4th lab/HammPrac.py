d = input("enter the data bits: ")
data = list(d)
data.reverse()
c =0
h =[]
h_copy = []
for k in range(0,len(d)):
    p = 2**c
    h.append(int(data[k]))
    h_copy.append(int(data[k]))
    if(p == (k+1)):
        c+=1
ch =0
parity_list = []
for parity in range(0,(len(h))):
    ph = 2**ch
    if(ph ==(parity+1)):
        startIndex = ph-1
        i = startIndex
        toXor = []
    while(i<len(h)):
        block = h[i::i + ph]
        toXor.extend(block)
        i +=2*ph
    for z in range(1,len(toXor)):
        h[startIndex] = h[startIndex]^toXor[z]
    parity_list.append(h[parity])
    ch+=1
parity_list.reverse()
error = sum(int(parity_list) * ( 2**i ) for i , parity_list in enumerate(parity_list[::-1]))

if(error == 0):
    print("no error")
elif((error)> (len(h_copy))):
    print("error can not be detected")
else:
    print("Error is in",error,"bit")
    if(h_copy(error-1)==0):
        h_copy[error-1] = 1
    elif(h_copy[error-1]==1):
        h_copy[error-1] = 0
h_copy.reverse()
print(int(''.join(map(str,h_copy))))
