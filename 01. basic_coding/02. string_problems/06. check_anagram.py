# anagram or not


# by sorting

s1='listen'
s2='silent'
if len(s1)!=len(s2):
    print("no")
else:
    if sorted(s1)!=sorted(s2):
        print("no")
    else:
        print("yes")

# by hasmap

s1='listen'
s2='silent'
hm={}
for ch in s1:
    hm[ch]=hm.get(ch,0)+1
for ch in s2:
    if ch not in hm:
        print("no")
        exit()
    hm[ch]-=1
print("yes")

print(all(x==0 for x in hm.values()))

# by count array

s1='listen'
s2='silent'
s1=s1.lower()
s2=s2.lower()

count=[0]*26
print(count)

for ch in s1:
    count[ord(ch)-97]+=1
print(count)

for ch in s2:
    count[ord(ch)-97]-=1
print(count)

print(all(x==0 for x in count))
    
 

