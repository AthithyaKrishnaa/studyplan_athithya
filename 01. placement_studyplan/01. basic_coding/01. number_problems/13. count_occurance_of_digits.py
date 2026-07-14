# count occurance of digits

n=1122233334
s=str(n)

count=1

for i in range(1,len(s)):
    if s[i]==s[i-1]:
        count+=1
    else:
        print(s[i-1]+':'+str(count)+',', end=" ")
        count=1
print(s[i-1]+':'+str(count))