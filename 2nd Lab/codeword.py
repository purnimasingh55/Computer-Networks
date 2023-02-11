'''def cmpare(str1, str2):
    count = 0
    j = 0
    if str1 == str2:
        return 0
    else:
        for i in str1:
            if (i == str2[j]):
                j += 1
            else:
                count += 1
                j += 1
        return count'''
def cmpare(srt1, str2):
    if str1 == str2:
        return 0
    elif len(str1) == len(str2):
        count =0
        j = 0
        for i in str1:
            if i == str2[j]:
                j+=1
            else:
                count+=1
                j+=1
        return count
    else:
        return -1


str1 = input("Enter the first codeword ")
str2 = input("Enter the second codeword ")

print("Number of similar characters in two codewords are: ",cmpare(str1, str2))