def Hamming_Code(m):
    r = 0
    while (1):
        ex = 2 ** r
        if ((m + 1 + r) <= ex):
            print("First no. satisfaing humming formula is: ", r)
            r += 1
            break
        r += 1



m = int(input("Enter the data bit: "))
Hamming_Code(m)

