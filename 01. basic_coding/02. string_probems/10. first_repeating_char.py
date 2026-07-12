# first repeating character

s="abcdea"
hm={}

for ch in s:
    hm[ch]=hm.get(ch,0)+1

for key,value in hm.items():
    if value>1:
        print(key)
        break
