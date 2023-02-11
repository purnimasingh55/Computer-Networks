def ParityCheck(str1):
    count =0
    for i in str1:
        if i == '1':
            count+=1
        else:
            pass
    return count

str1 = input("Enter the bit stream: ")
num = ParityCheck(str1)
print(num)
if(num%2==0):
    print("Parity bit: ", 0)
else:
    print("Parity bit: ", 1)