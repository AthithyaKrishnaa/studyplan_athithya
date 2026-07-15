# anagram difference
a=["tea","tea","act"]
b=["ate","toe","acts"]
# op: [0,1,-1]
res=[]
for i in range(len(a)):
    if len(a[i])!=len(b[i]):
        res.append(-1)
        continue
    freq=[0]*26
    
    for ch in a[i]:
        freq[ord(ch)-97]+=1
    for ch in b[i]:
        freq[ord(ch)-97]-=1
    
    count=0
    for j in freq:
        if j>0:
            count+=j
    res.append(count)
print(res)